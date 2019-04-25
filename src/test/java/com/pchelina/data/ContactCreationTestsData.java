package com.pchelina.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ContactCreationTestsData {

//    @DataProvider(name = "methodName")
//    public static Object[][] methodName() {
//        final List<Object[]> data = new ArrayList<>();
//
//        data.add(new Object[] {
//           <params data>
//        });
//
//        return data.toArray(new Object[data.size()][]);
//    }

    @DataProvider(name = "getContactCreationData")
    public static Object[][] getContactCreationData() {
        final List<Object[]> data = new ArrayList<>();

        data.add(new Object[] {
                "All data passed",
                "Mary",
                "Smith",
                "Katty",
                "QA Engineer",
                "Amazon",
                "850 1st Ave SW, Seattle",
                654,
                "kuku@gmail.com",
                "test1",
                true
        });

        data.add(new Object[] {
                "Only names passed",
                "John",
                "Mark",
                null,
                null,
                null,
                null,
                0,
                null,
                null,
                true
        });

        return data.toArray(new Object[data.size()][]);
    }
}
