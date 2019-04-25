package com.pchelina.tests;

import com.pchelina.data.GroupDeletionTestsData;
import com.pchelina.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test(dataProvider = "getGroupDeletionData", dataProviderClass = GroupDeletionTestsData.class)

    public void testGroupDeletion(String name, String groupName) {

        GroupData newGroupData = new GroupData(groupName);

        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(newGroupData);
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }
}
