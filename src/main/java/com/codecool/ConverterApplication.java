package com.codecool;

import com.codecool.model.OutputFormat;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
        } else {
            final Integer PATH_ARG = args.length - 1;
            Path CSVPath = Paths.get(args[PATH_ARG]);

            OutputFormat outputFormat;

            if (args.length == 1) {
                outputFormat = OutputFormat.TABLE;
            } else if (args.length > 1) {
                final Integer FORMAT_ARG = 0;

                if (args[FORMAT_ARG].equals("json")) {
                    outputFormat = OutputFormat.JSON;
                } else if (args[FORMAT_ARG].equals("xml")) {
                    outputFormat = OutputFormat.XML;
                }
            }
        }
    }
}
