package com.pchelina.tests;

import com.pchelina.model.ContactData;
import org.testng.annotations.Test;

public class ContactModification extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().clickEditContact();
        app.getContactHelper().fillContactForm(new ContactData("John", "Smith"), false);
        app.getContactHelper().clickUpdateButton();
    }
}
