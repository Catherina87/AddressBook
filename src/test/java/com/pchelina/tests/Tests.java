package com.pchelina.tests;

import java.util.List;
import java.util.stream.Collectors;


public class Tests{

    public static void main(String[] args) {
        List<WebElement> retrieveElements = SeleniumWebDriver.getAllElements();

       //for(int i = 0; i < retrieveElements.size(); i++) {
       //    System.out.println(retrieveElements.get(i).getName() + " " + retrieveElements.get(i).getPath());
       //}

        retrieveElements.stream().forEach(box -> System.out.println(box.getName() + " " + box.getPath()));


        List<String> names = retrieveElements
                .stream()
                .parallel()
                .map(webElementBox -> webElementBox.getName())
                .collect(Collectors.toList());

        System.out.println(names);
    }
 }
