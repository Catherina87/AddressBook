package com.pchelina.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class ContactModificationData {

    @DataProvider(name = "getContactModificationData")
    public static Object[][] getContactModificationData() {
        final List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{
                "firstName and lastName passed",
                "Jason",
                "Bourne",
                false

        });

        data.add(new Object[]{
                "modification passed",
                "Sara",
                "Michael",
                false

        });

        return data.toArray(new Object[data.size()][]);
    }
}
