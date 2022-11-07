package com.trucklagbe.pageObjects.shipper.details.addressBookTab;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends Page {
    private WebDriver driver;

    private WebElement addNewButton;

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
