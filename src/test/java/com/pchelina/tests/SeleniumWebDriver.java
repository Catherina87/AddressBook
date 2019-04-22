package com.pchelina.tests;

import java.util.ArrayList;
import java.util.List;

public class SeleniumWebDriver {

    public static List<WebElement> getAllElements() {

        List<WebElement> webElements = new ArrayList<>();
        webElements.add(new WebElement("firstPath", "button"));
        webElements.add(new WebElement("secondPath", "submit"));
        webElements.add(new WebElement("thirdPath", "checkBox"));

        return webElements;
    }
}
