package com.trucklagbe.pageObjects.shipper.details.notifications;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NotificationTab extends Page {
    private WebDriver driver;

    private WebElement sendNotificationButton;

    public NotificationTab(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
