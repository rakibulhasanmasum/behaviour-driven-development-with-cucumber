package com.trucklagbe.pageObjects.owner;

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

    @FindBy(xpath = "//button[text()=' Add Owner ']")
    private WebElement addOwnerButton;

    private WebElement searchButton;

    private WebElement searchOwnerInputField;

    public IndexPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfUserIsOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("owner-list"));
    }

    public void clickAddOwnerButton() {
        addOwnerButton.click();
    }
}
