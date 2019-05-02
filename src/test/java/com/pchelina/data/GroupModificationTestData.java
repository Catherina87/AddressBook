package com.pchelina.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class GroupModificationTestData {

    @DataProvider(name = "getGroupModificationData")
    public static Object[][] getGroupModificationData() {
        final List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{
                "group modified",
                "test mody",
                "another name",
                "header",
                "footer"
        });

        return data.toArray(new Object[data.size()][]);
    }
}
