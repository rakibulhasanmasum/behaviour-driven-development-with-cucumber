package com.alpine.pageObjects.trips;

import com.alpine.dataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RequestsPage {
    WebDriver driver;
    ConfigFileReader configFileReader;

    public RequestsPage(WebDriver driver) {
        this.driver = driver;
        configFileReader = new ConfigFileReader();
        PageFactory.initElements(driver, this);
    }
    public void navigateToRequestsPage() {
        driver.get(configFileReader.getRequestsUrl());
    }
}