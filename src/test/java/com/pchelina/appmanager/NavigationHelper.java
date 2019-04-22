package com.pchelina.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        if(isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.xpath("//a[contains(text(),'groups')]"));
    }

    public void goToHomePage(){
        if(isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.xpath("//a[contains(text(),'home')]"));
    }
}