package com.trucklagbe.pageObjects.shipper;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AddNewShipperPage extends Page {
    WebDriver driver;

    @FindBy(className = "form-group")
    private List<WebElement> formGroups;

    @FindBy(css = "input[formControlName='shipperName']")
    private WebElement nameInputField;

    private WebElement companyInputField;
    private WebElement phoneInputField;

    @FindBy(css = "select[formcontrolname='shipperType']")
    private WebElement shipperTypeDropDownButton;

    @FindBy(xpath = "//button[text()=' Create Account ']")
    private WebElement createAccountButton;

    public AddNewShipperPage(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void userIsOnThisPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/shipper/new"));
    }

    public void enterValuesInInputField(String fieldName, String value) {
        for (WebElement formGroup : formGroups) {
            WebElement label = formGroup.findElement(By.cssSelector("label"));
            WebElement inputField = formGroup.findElement(By.cssSelector("input"));
            System.out.println(label.getText());
            if (label.getText().contains(fieldName)) {
                inputField.sendKeys(value);
                break;
            }
        }
    }

    public void enterNewShipperName(String givenName) {
        nameInputField.sendKeys(givenName);
    }

    public void selectShipperType(String givenShipperType) {
        shipperTypeDropDownButton.click();
        List<WebElement> shipperTypeOptions = shipperTypeDropDownButton.findElements(By.cssSelector("option"));
        for (WebElement option : shipperTypeOptions) {
            if (option.getText().contains(givenShipperType)) {
                option.click();
                break;
            }
        }
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
        Wait.untilJqueryIsDone(driver);
        WaitExplicit.wait(10 * 1000);
    }
}
