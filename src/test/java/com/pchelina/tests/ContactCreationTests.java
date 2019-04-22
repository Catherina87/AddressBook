package com.pchelina.tests;

import com.pchelina.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getContactHelper().goToCreateContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Ekaterina", "Pchelina", "Katty", "QA Engineer",
                        "Amazon", "4433 42nd Ave SW, Seattle, WA 98116", "760-520-9090",
                        "pchelina.kate@gmail.com", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();

    }

    @Test
    public void testContactCreation2() {
        app.getContactHelper().goToCreateContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Sergei", "Mavrushkin", "Hubby", "SDE",
                "Amazon","4433 42nd Ave SW, Seattle, WA 98116", "760-520-0000",
                "sergei@mail.ru", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();
    }

}
