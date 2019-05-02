package com.pchelina.tests;

import com.pchelina.data.GroupCreationTestsData;
import com.pchelina.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test(dataProvider = "getGroupCreationData", dataProviderClass = GroupCreationTestsData.class)
    public void testGroupCreation(String name, String groupName, String header, String footer) {

        GroupData data = new GroupData(groupName, header, footer);

        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(data);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }
}
