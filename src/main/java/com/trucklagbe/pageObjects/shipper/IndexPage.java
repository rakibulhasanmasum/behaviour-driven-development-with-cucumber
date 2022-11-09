package com.trucklagbe.pageObjects.shipper;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IndexPage extends Page {
    WebDriver driver;

    @FindBy(id = "add_new_shipper")
    private WebElement addShipperButton;

    private WebElement createANewTripButton;
    private WebElement searchButton;
    private WebElement searchInputField;

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void userIsOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("shipper"));
    }

    public void clickAddNewShipperButton() {
        addShipperButton.click();
    }
}