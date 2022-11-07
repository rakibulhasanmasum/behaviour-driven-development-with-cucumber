package com.trucklagbe.pageObjects.shipper;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class New extends Page {
    WebDriver driver;

    private WebElement nameInputField;
    private WebElement companyInputField;
    private WebElement phoneInputField;
    private WebElement shipperTypeDropDownButton;
    private WebElement createAccountButton;

    public New(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}