package com.alpine.pageObjects.trips;

import com.alpine.managers.FileReaderManager;
import com.alpine.selenium.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RequestsPage {
    WebDriver driver;

    public RequestsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void navigateToRequestsPage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getRequestsUrl());
    }
}