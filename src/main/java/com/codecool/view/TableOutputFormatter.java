package com.codecool.view;

import org.sk.PrettyTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TableOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(List<Map<String, String>> data) {
        String[] headers = data.get(0).keySet().toArray(new String[data.get(0).keySet().size()]);

        PrettyTable table = new PrettyTable(headers);

        for (int i = 1; i < data.size(); i++) {
            List<String> valueList = new ArrayList<>();
            String[] keyArray = data.get(i).keySet().toArray(new String[data.get(i).keySet().size()]);

            for (int j = 0; j < keyArray.length; j++) {
                valueList.add(data.get(i).get(keyArray[j]));
            }

            String[] temp = new String[valueList.size()];
            temp = valueList.toArray(temp);
            table.addRow(temp);
        }

        System.out.println(table);
    }
}
