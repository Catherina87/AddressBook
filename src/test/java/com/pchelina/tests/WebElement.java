package com.pchelina.tests;

public class WebElement {

    private String path;
    private String name;

    public WebElement(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return this.path;
    }

    public String getName() {
        return this.name;
    }
}
