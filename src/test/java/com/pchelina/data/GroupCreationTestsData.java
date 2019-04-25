package com.pchelina.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class GroupCreationTestsData {

    @DataProvider(name = "getGroupCreationData")
    public static Object[][] getGroupCreationData() {
        final List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{
               "group created",
               "test1",
               "header",
               "footer"
        });

        data.add(new Object[]{
                "group created",
                "test2",
                "header",
                "footer"
        });

        return data.toArray(new Object[data.size()][]);
    }
}
