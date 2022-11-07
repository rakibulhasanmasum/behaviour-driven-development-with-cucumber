package com.trucklagbe.pageObjects.shipper.details.addressBookTab;

import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddressBookModal extends Page {
    private WebDriver driver;

    private WebElement locationNameInputField;
    private WebElement contactNameInputField;
    private WebElement contactNoInputField;
    private WebElement searchAddressInputFiled;
    private WebElement cancelButton;
    private WebElement addButton;

    public AddressBookModal(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
