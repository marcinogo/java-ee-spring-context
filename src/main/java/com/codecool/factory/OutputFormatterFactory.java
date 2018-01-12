package com.codecool.factory;

import com.codecool.model.OutputFormat;
import com.codecool.view.JsonOutputFormatter;
import com.codecool.view.OutputFormatter;
import com.codecool.view.TableOutputFormatter;
import com.codecool.view.XmlOutputFormatter;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {
    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();
            default:
                throw new IllegalArgumentException();
        }
    }
}
