package com.alpine.managers;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;

import com.alpine.pageObjects.trips.*;

public class PageObjectManager {
    private WebDriver driver;
    Dotenv dotenv;
    private RequestsPage requestsPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
        dotenv = Dotenv.load();
    }

    public RequestsPage getRequestsPage() {
        return (requestsPage == null) ? requestsPage = new RequestsPage(driver, dotenv) : requestsPage;
    }
}