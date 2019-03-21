package com.pchelina;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTests {

    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/Users/TheBestOrNothing/Downloads/geckodriver");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("admin", "secret");

    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testContactCreation() {
        goToCreateContactPage();
        fillContactForm(new ContactData("Ekaterina", "Pchelina", "Katty", "QA Engineer",
                        "Amazon", "4433 42nd Ave SW, Seattle, WA 98116", "760-520-9090",
                        "pchelina.kate@gmail.com"));
        submitContactCreation();

    }

    public void goToCreateContactPage() {
        wd.findElement(By.xpath("//a[contains(text(),'add new')]")).click();
    }

    public void fillContactForm(ContactData data) {
        wd.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data.getFirstName());
        wd.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data.getLastName());
        wd.findElement(By.xpath("//input[@name='nickname']")).sendKeys(data.getNickName());
        wd.findElement(By.xpath("//input[@name='title']")).sendKeys(data.getTitle());
        wd.findElement(By.xpath("//input[@name='company']")).sendKeys(data.getCompany());
        wd.findElement(By.xpath("//textarea[@name='address']")).sendKeys(data.getAddress());
        wd.findElement(By.xpath("//input[@name='mobile']")).sendKeys(data.getPhone());
        wd.findElement(By.xpath("//input[@name='email']")).sendKeys(data.getEmail());
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//form[@name='theform']//input[1]")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
