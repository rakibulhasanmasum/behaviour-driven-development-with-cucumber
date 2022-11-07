package com.trucklagbe.pageObjects.shipper.details;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends Page {
    WebDriver driver;

    private WebElement createNewTripButton;
    private WebElement editProfileButton;
    private WebElement userRestrictionButton;
    private WebElement notificationButton;
    private WebElement kamDropDownButton;

    private WebElement marketPlaceTripsNavigationButton;
    private WebElement brokerageTripsNavigationButton;
    private WebElement addressBookNavigationButton;

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
