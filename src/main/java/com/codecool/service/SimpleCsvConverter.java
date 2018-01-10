package com.codecool.service;

import com.codecool.model.OutputFormat;

import java.io.File;

public class SimpleCsvConverter {
    public void convert (File file) {
        OutputFormat outputFormat = OutputFormat.TABLE;
        System.out.println(String.format("I convert CSV to %s", outputFormat));
    }

    public void convert (File file, OutputFormat outputFormat) {
        System.out.println(String.format("I convert CSV to %s", outputFormat));
    }
}
