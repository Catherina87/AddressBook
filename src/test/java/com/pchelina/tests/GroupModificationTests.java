package com.pchelina.tests;

import com.pchelina.data.GroupModificationTestData;
import com.pchelina.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test(dataProvider = "getGroupModificationData", dataProviderClass = GroupModificationTestData.class)
    public void testGroupModification(String comment, String modifiedGroupName,
                                      String anotherName, String header, String footer) {

        GroupData modifiedData = new GroupData(modifiedGroupName);
        GroupData fillData = new GroupData(anotherName, header, footer);

        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(modifiedData);
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(fillData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

    }
}
