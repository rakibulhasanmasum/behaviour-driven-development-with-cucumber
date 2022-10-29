package com.alpine.pageObjects.trips;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RequestsPage {
    WebDriver driver;
    Dotenv dotenv;

    public RequestsPage(WebDriver driver, Dotenv dotenv) {
        this.driver = driver;
        this.dotenv = dotenv;
        PageFactory.initElements(driver, this);
    }
    public void navigateToRequestsPage() {
        String url = dotenv.get("REQUESTS_URL");
        driver.get(url);
    }
}