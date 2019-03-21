package com.pchelina;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {

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
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();

    }

    private void goToGroupPage() {
        wd.findElement(By.xpath("//a[contains(text(),'groups')]")).click();
    }

    private void initGroupCreation() {
        wd.findElement(By.xpath("//div[@id='content']//input[1]")).click();
    }

    private void fillGroupForm(GroupData data) {
        wd.findElement(By.xpath("//input[@name='group_name']")).sendKeys(data.getName());
        wd.findElement(By.xpath("//textarea[@name='group_header']")).sendKeys(data.getHeader());
        wd.findElement(By.xpath("//textarea[@name='group_footer']")).sendKeys(data.getFooter());
    }

    private void submitGroupCreation() {
        wd.findElement(By.xpath("//input[@value='Enter information']")).click();
    }

    private void returnToGroupPage() {
        wd.findElement(By.xpath("//a[contains(text(),'group page')]")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
