package com.alpine.stepDefinitions.trips.bidding;

import com.alpine.managers.PageObjectManager;
import com.alpine.pageObjects.trips.RequestsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BiddingTripCreateSteps {
    WebDriver driver;
    PageObjectManager pageObjectManager;
    RequestsPage requestsPage;

    @Given("Admin user is on request page")
    public void adminUserIsOnRequestPage() {
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        pageObjectManager = new PageObjectManager(driver);
        requestsPage = pageObjectManager.getRequestsPage();
        requestsPage.navigateToRequestsPage();
    }

    @Then("Admin user enters shipper id")
    public void adminUserEntersShipperId() {
        driver.quit();
    }
}
