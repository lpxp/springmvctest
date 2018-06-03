package com.springmvctest.pojo;

import java.util.HashMap;
import java.util.Map;

public class DefenseCommand {
    private String head;
    private String name;
    private String templateString;
    private Map<String, String> measurementNameValue = new HashMap<String, String>();

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplateString() {
        return templateString;
    }

    public void setTemplateString(String templateString) {
        this.templateString = templateString;
    }

    public Map<String, String> getMeasurementNameValue() {
        return measurementNameValue;
    }

    public void setMeasurementNameValue(Map<String, String> measurementNameValue) {
        this.measurementNameValue = measurementNameValue;
    }
}
