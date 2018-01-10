package com.codecool.service;

import com.codecool.dao.FileReader;
import com.codecool.model.OutputFormat;

import java.nio.file.Path;

public class SimpleCsvConverter {
    private FileReader fileReader;

    public SimpleCsvConverter() {
        this.fileReader = new FileReader();
    }

    public void convert (Path file) {
        this.fileReader.readData(file);
        OutputFormat outputFormat = OutputFormat.TABLE;
        System.out.println(String.format("I convert CSV to %s", outputFormat));
    }

    public void convert (Path file, OutputFormat outputFormat) {
        this.fileReader.readData(file);
        System.out.println(String.format("I convert CSV to %s", outputFormat));
    }
}
