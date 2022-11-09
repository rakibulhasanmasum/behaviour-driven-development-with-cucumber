package com.trucklagbe.pageObjects.trucks;

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

public class AddNewTruckModal extends Page {
    private WebDriver driver;

    @FindBy(css = "body")
    private WebElement body;

    @FindBy(css = "input[name='search_shipper']")
    private WebElement shipperInfoInputField;

    @FindBy(id = "search_button")
    private WebElement searchButton;

    @FindBy(xpath = "//button[text()=' Proceed ']")
    private WebElement proceedButton;

    @FindBy(css = ".new-truck-form .form-row:nth-child(1)")
    private List<WebElement> formRows;

    @FindBy(css = ".new-truck-form select")
    private List<WebElement> allDropDownButtons;

    // truck no row
    @FindBy(css = ".new-truck-form .form-row:nth-child(1)")
    private WebElement truckNoRow;

    // category row
    @FindBy(css = ".new-truck-form .form-row:nth-child(2)")
    private WebElement truckCategoryRow;

    // model name row
    @FindBy(css = ".new-truck-form .form-row:nth-child(3)")
    private WebElement truckModelNameRow;

    // manufacturing year and month row
    @FindBy(css = ".new-truck-form .form-row:nth-child(4)")
    private WebElement manufacturingMontAndYearRow;

    // height width length capacity row
    @FindBy(css = ".new-truck-form .form-row:nth-child(5)")
    private WebElement heightWidthAndCapacityRow;

    // hq and stand row
    @FindBy(css = ".new-truck-form .form-row:nth-child(6)")
    private WebElement hqAndStandRow;

    @FindBy(xpath = "//button[text()=' Add ']")
    private WebElement addButton;

    public AddNewTruckModal(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void checkIfAddNewTruckModalIsOpened() {
        String bodyClass = body.getAttribute("class");
        Assert.assertTrue(bodyClass.contains("open"));
    }

    public void enterOwnerInfoInTheAddNewTruckSearchModalInputField(String ownerInfo) {
        shipperInfoInputField.sendKeys(ownerInfo);
    }

    public void clickSearchButton() {
        searchButton.click();
        Wait.untilJqueryIsDone(driver);
    }

    public void clickProceedButton() {
        proceedButton.click();
    }

    // Add New Truck Form
    public void selectGivenOptionFromGivenOptionType(String optionType, String optionValue) {
        for (WebElement selectCandidate : allDropDownButtons) {
            WebElement firstOption = selectCandidate.findElement(By.cssSelector("option:nth-child(1)"));
            selectCandidate.click();
            System.out.println(firstOption.getText());
            break;
        }
        WaitExplicit.wait(40000);
    }
}
