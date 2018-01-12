package com.codecool.service;

import com.codecool.dao.FileReader;
import com.codecool.factory.OutputFormatterFactory;
import com.codecool.model.OutputFormat;
import com.codecool.view.OutputFormatter;

import java.nio.file.Path;

public class SimpleCsvConverter {
    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert (Path file) {
        OutputFormat outputFormat = OutputFormat.TABLE;

        OutputFormatter outputFormatter = this.outputFormatterFactory.createByFormat(outputFormat);
        System.out.println(String.format("I convert CSV to %s", outputFormat));
        outputFormatter.printToConsole(this.fileReader.readData(file));
    }

    public void convert (Path file, OutputFormat outputFormat) {
        OutputFormatter outputFormatter = this.outputFormatterFactory.createByFormat(outputFormat);
        System.out.println(String.format("I convert CSV to %s", outputFormat));
        outputFormatter.printToConsole(this.fileReader.readData(file));
    }
}
