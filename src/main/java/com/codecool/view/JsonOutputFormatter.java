package com.codecool.view;

import java.util.List;
import java.util.Map;

public class JsonOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(List<Map<String, String>> data) {
        System.out.println("Some random CSV converted to JSON");
    }
}
