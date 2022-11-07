package com.trucklagbe.pageObjects.owner;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class New extends Page {
    private WebDriver driver;

    private WebElement nameInputField;
    private WebElement phoneNumberInputField;
    private WebElement ownerTypeDropDownButton;
    private WebElement createAccountButton;

    public New(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
