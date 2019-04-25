package com.pchelina.tests;

import com.pchelina.data.ContactCreationTestsData;
import com.pchelina.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test(dataProvider = "getContactCreationData", dataProviderClass = ContactCreationTestsData.class)
    public void testContactCreation(String testName, String firstName, String lastName,
                                    String nickName, String position, String company,
                                    String address, int phoneId, String email,
                                    String group, boolean isCreation) {

        ContactData newContactData = new ContactData(firstName, lastName, nickName,
                position, company, address, phoneId, email, group);

        app.getContactHelper().goToCreateContactPage();
        app.getContactHelper().fillContactForm(
                newContactData,
                isCreation
        );
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();
    }
}
