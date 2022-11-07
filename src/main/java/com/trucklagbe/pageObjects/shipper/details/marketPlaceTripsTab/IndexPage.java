package com.trucklagbe.pageObjects.shipper.details.marketPlaceTripsTab;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends Page {
    WebDriver driver;

    private WebElement dateDropDownButton;
    private WebElement filterDropDownButton;

    private WebElement biddingNavigationButton;
    private WebElement fixedPriceNavigationButton;
    private WebElement priceRangeNavigationButton;


    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
