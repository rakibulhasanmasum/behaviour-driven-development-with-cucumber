package com.trucklagbe.pageObjects.owner;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AddNewOwnerPage extends Page {
    private WebDriver driver;

    private WebElement nameInputField;
    private WebElement phoneNumberInputField;

    @FindBy(css = "select[formcontrolname='owner_type']")
    private WebElement ownerTypeDropDownButton;

    @FindBy(className = "form-group")
    private List<WebElement> ownerNewFormGroups;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    public AddNewOwnerPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfUserIsOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/owner-list/new"));
    }

    public void enterNewOwnerName(String givenName) {

    }

    public void enterPhoneNumber(String givenPhoneNumber) {

    }

    public void clickOwnerTypeDropDownButton() {
        ownerTypeDropDownButton.click();
    }

    public void selectOwnerType(String givenType) {
        System.out.println(ownerTypeDropDownButton.getAttribute("innerHTML"));
        List<WebElement> ownerTypeOptions = ownerTypeDropDownButton.findElements(By.cssSelector("option"));
        for (WebElement option : ownerTypeOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase(givenType)) {
                option.click();
                break;
            }
        }
    }

    public void enterGivenValueOnInputField(String fieldName, String value) {
        for (WebElement group : ownerNewFormGroups) {
            WebElement label = group.findElement(By.cssSelector("label"));
            WebElement input = group.findElement(By.cssSelector("input"));

            if (label.getText().contains(fieldName)) {
                input.sendKeys(value);
                break;
            }
        }
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
        WaitExplicit.wait(10 * 1000);
    }
}
