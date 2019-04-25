package com.pchelina.tests;

import com.pchelina.data.ContactModificationData;
import com.pchelina.model.ContactData;
import org.testng.annotations.Test;

public class ContactModification extends TestBase{

    @Test(dataProvider = "getContactModificationData", dataProviderClass = ContactModificationData.class)
    public void testContactModification(String testName, String firstName, String lastName, boolean isCreation) {

        ContactData newContactData = new ContactData(firstName, lastName);

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().fillContactForm(
                newContactData,
                isCreation
        );
        app.getContactHelper().clickUpdateButton();
    }
}
