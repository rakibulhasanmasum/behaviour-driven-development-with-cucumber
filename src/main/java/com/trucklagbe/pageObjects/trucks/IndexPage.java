package com.trucklagbe.pageObjects.trucks;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IndexPage extends Page {
    private WebDriver driver;

    @FindBy(id = "add_new_truck")
    private WebElement addNewTruckButton;

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfUserIsOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("/trucks"));
    }

    public void clickAddNewTruckButton() {
        addNewTruckButton.click();
    }
}
