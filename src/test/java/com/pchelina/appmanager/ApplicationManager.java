package com.pchelina.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public NavigationHelper getNavigationHelper() {
        if(this.navigationHelper == null) {
            throw new IllegalArgumentException("Hey you forgot to call init() method");
        }
        return this.navigationHelper;
    }

    public GroupHelper getGroupHelper() {
        if (this.groupHelper == null) {
            throw new IllegalArgumentException("Hey you forgot to call init() method");
        }
        return this.groupHelper;
    }

    public ContactHelper getContactHelper() {
        if(this.contactHelper == null) {
            throw new IllegalArgumentException("Hey you forgot to call init() method");
        }
        return this.contactHelper;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)) {
            System.setProperty("webdriver.chrome.driver", "/Users/TheBestOrNothing/Downloads/chromedriver");
            wd = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "/Users/TheBestOrNothing/Downloads/geckodriver");
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }
}
