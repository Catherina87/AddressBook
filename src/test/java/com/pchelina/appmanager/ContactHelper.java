package com.pchelina.appmanager;

import com.pchelina.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void goToCreateContactPage() {
        click(By.xpath("//a[contains(text(),'add new')]"));
    }

    public void fillContactForm(ContactData data, boolean creation) {
        type(By.xpath("//input[@name='firstname']"), data.getFirstName());
        type(By.xpath("//input[@name='lastname']"), data.getLastName());
        type(By.xpath("//input[@name='nickname']"), data.getNickName());
        type(By.xpath("//input[@name='title']"), data.getTitle());
        type(By.xpath("//input[@name='company']"), data.getCompany());
        type(By.xpath("//textarea[@name='address']"), data.getAddress());
        type(By.xpath("//input[@name='mobile']"), data.getPhone());
        type(By.xpath("//input[@name='email']"), data.getEmail());

        if(creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(data.getGroup());
        } else{
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactCreation() {
        click(By.xpath("//form[@name='theform']//input[1]"));
    }

    public void clickEditContact() {
        click(By.xpath("//a[@href='edit.php?id=8']//img[@title='Edit']"));
    }

    public void clickUpdateButton() {
        click(By.name("update"));
    }
}
