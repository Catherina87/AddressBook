package com.pchelina.appmanager;

import com.pchelina.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void initGroupCreation() {
        click(By.xpath("//div[@id='content']//input[1]"));
    }

    public void fillGroupForm(GroupData data) {
        type(By.xpath("//input[@name='group_name']"), data.getName());
        type(By.xpath("//textarea[@name='group_header']"), data.getHeader());
        type(By.xpath("//textarea[@name='group_footer']"), data.getFooter());
    }
    

    public void submitGroupCreation() {
        click(By.xpath("//input[@value='Enter information']"));
    }

    public void returnToGroupPage() {
        click(By.xpath("//a[contains(text(),'group page')]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }
}
