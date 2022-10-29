package com.alpine.managers;

import org.openqa.selenium.WebDriver;

import com.alpine.pageObjects.trips.*;

public class PageObjectManager {
    protected WebDriver driver;
    private RequestsPage requestsPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public RequestsPage getRequestsPage() {
        return (requestsPage == null) ? requestsPage = new RequestsPage(driver) : requestsPage;
    }
}