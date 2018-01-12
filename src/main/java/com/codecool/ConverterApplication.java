package com.codecool;

import com.codecool.model.OutputFormat;
import com.codecool.service.SimpleCsvConverter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
        } else {
            final Integer PATH_ARG = args.length - 1;
            Path file = Paths.get(args[PATH_ARG]);

            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

            SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");

            if (args.length == 1) {
                simpleCsvConverter.convert(file);
            } else if (args.length > 1) {
                OutputFormat outputFormat = null;
                final Integer FORMAT_ARG = 0;

                if (args[FORMAT_ARG].equals("json")) {
                    outputFormat = OutputFormat.JSON;
                } else if (args[FORMAT_ARG].equals("xml")) {
                    outputFormat = OutputFormat.XML;
                } else {
                    System.out.println("No such output format define");
                    System.exit(0);
                }

                simpleCsvConverter.convert(file, outputFormat);
            }
        }
    }
}
