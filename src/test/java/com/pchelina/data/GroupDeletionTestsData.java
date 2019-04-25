package com.pchelina.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class GroupDeletionTestsData {

    @DataProvider(name = "getGroupDeletionData")
    public static Object[][] getGroupDeletionData() {
        final List<Object[]> data = new ArrayList<>();

        data.add(new Object[]{
                "group deleted",
                "test1",
        });

        data.add(new Object[]{
                "group deleted",
                "test2",
        });

        return data.toArray(new Object[data.size()][]);
    }

}
