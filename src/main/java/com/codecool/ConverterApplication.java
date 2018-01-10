package com.codecool;

import com.codecool.model.OutputFormat;
import com.codecool.service.SimpleCsvConverter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
        } else {
            final Integer PATH_ARG = args.length - 1;
            Path CSVPath = Paths.get(args[PATH_ARG]);

            SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter();

            if (args.length == 1) {
                simpleCsvConverter.convert(CSVPath.toFile());
            } else if (args.length > 1) {
                OutputFormat outputFormat;
                final Integer FORMAT_ARG = 0;

                if (args[FORMAT_ARG].equals("json")) {
                    outputFormat = OutputFormat.JSON;
                    simpleCsvConverter.convert(CSVPath.toFile(), outputFormat);
                } else if (args[FORMAT_ARG].equals("xml")) {
                    outputFormat = OutputFormat.XML;
                    simpleCsvConverter.convert(CSVPath.toFile(), outputFormat);
                }
            }
        }
    }
}
