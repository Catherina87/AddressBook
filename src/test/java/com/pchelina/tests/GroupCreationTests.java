package com.pchelina.tests;

import com.pchelina.data.GroupCreationTestsData;
import com.pchelina.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test(dataProvider = "getGroupCreationData", dataProviderClass = GroupCreationTestsData.class)
    public void testGroupCreation(String name, String groupName, String header, String footer) {

        GroupData data = new GroupData(groupName, header, footer);

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(data);
    }
}
