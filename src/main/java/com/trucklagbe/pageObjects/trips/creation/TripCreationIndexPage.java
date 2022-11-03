package com.trucklagbe.pageObjects.trips.creation;

import com.trucklagbe.pageObjects.Page;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TripCreationIndexPage extends Page {
    private WebDriver driver;

    public TripCreationIndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void userIsCurrentlyOnThisPage() {
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("trip_creation"));
    }
}
