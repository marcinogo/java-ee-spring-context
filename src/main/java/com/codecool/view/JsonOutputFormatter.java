package com.codecool.view;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(List<List<String>> data) {
        System.out.println("Some random CSV converted to JSON");
    }
}
