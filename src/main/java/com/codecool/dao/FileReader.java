package com.codecool.dao;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

@Component
public class FileReader {
    public List<Map<String, String>> readData(Path file) {
        List<Map<String, String>> csvData = new ArrayList<>();

        try (
            Reader reader = Files.newBufferedReader(file);
            CSVReader csvReader = new CSVReader(reader)
        ) {
            String[] line;

            while ((line = csvReader.readNext()) != null) {

                Map<String, String> csvRow = new LinkedHashMap<>();
                for (int i = 0; i < line.length; i++) {
                    csvRow.put("col_" + i, line[i]);
                }
                csvData.add(csvRow);
            }
        } catch (IOException e) {
            System.out.println("Can't read given file");
            System.exit(0);
        }

        return csvData;
    }
}
