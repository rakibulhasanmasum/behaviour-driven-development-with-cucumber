package com.trucklagbe.pageObjects.trucks;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    @FindBy(xpath = "//input[@placeholder='Vehicle Number']")
    private WebElement vehicleNumberInputField;

    // category row
    @FindBy(css = ".new-truck-form .form-row:nth-child(2)")
    private WebElement truckCategoryRow;

    @FindBy(css = ".new-truck-form #truckCategoryDropdown")
    private WebElement truckCategoryButton;

    @FindBy(css = ".select_ton .ton-body-top button")
    private List<WebElement> truckCategoryTonButtons;

    @FindBy(css = ".select_feet .feet-body-top button")
    private List<WebElement> truckCategoryFeetButtons;

    @FindBy(css = ".select_truck_type .truck-type-body button")
    private List<WebElement> truckCategoryTypeButtons;

    @FindBy(css = ".new-truck-form #apply")
    private WebElement applyButton;

    // model name row
    @FindBy(css = ".new-truck-form .form-row:nth-child(3)")
    private WebElement truckModelNameRow;

    // manufacturing year and month row
    @FindBy(css = ".new-truck-form .form-row:nth-child(4)")
    private WebElement manufacturingMontAndYearRow;

    @FindBy(xpath = "//div[contains(@class,'form-group')][label[text()='Manufacturing Month']]/input")
    private WebElement manufacturingMonthInputField;

    @FindBy(xpath = "//div[contains(@class,'form-group')][label[text()='Year']]/input")
    private WebElement manufacturingYearInputField;

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
    public void clickTruckCategoryButton() {
        truckCategoryButton.click();
    }

    public WebElement getCandidateDropDownButton(String optionType) {
        for (WebElement candidate : allDropDownButtons) {
            String cssSelector = "option:nth-child(1)";
            WebElement firstOption = candidate.findElement(By.cssSelector(cssSelector));
            if (firstOption.getText().contains(optionType)) {
                return candidate;
            }
        }
        throw new NoSuchElementException(optionType + " type option is not available at the moment");
    }

    public void clickDesiredDropDownButton(String desiredOption) {
        WebElement candidate = getCandidateDropDownButton(desiredOption);
        candidate.click();
    }

    public void selectCandidateOption(WebElement candidate, String optionValue) {
        String cssSelector = "option[value='" + optionValue +"']";
        WebElement element = candidate.findElement(By.cssSelector(cssSelector));
        element.click();
    }

    public void selectGivenOptionFromGivenOptionType(String optionType, String optionValue) {
        WebElement candidate = getCandidateDropDownButton(optionType);
        selectCandidateOption(candidate, optionValue);
    }

    public void enterVehicleNumber(String vehicleNumber) {
        vehicleNumberInputField.sendKeys(vehicleNumber);
    }

    public void enterManufacturingMonth(String monthNumber) {
        manufacturingMonthInputField.sendKeys(monthNumber);
    }

    public void enterManufacturingYear(String givenYear) {
        manufacturingYearInputField.sendKeys(givenYear);
    }

    // truck category
    public void selectGivenTonForTruckCategory(String ton) {
        for (WebElement button : truckCategoryTonButtons) {
            String buttonText = button.getText();
            if (buttonText.strip().equalsIgnoreCase(ton)) {
                button.click();
            }
        }
    }

    public void selectGivenFeetForTruckCategory(String feet) {
        for (WebElement button : truckCategoryFeetButtons) {
            String buttonText = button.getText();
            if (buttonText.strip().equalsIgnoreCase(feet)) {
                button.click();
            }
        }
    }

    public void selectGivenTypeForTruckCategory(String type) {
        for (WebElement button : truckCategoryTypeButtons) {
            String buttonText = button.getText();
            if (buttonText.strip().equalsIgnoreCase(type)) {
                button.click();
            }
        }
    }

    public void clickApplyButton() {
        applyButton.click();
    }

    // add button
    public void clickAddButton() {
        addButton.click();
        Wait.untilJqueryIsDone(driver);
        WaitExplicit.wait(10 * 1000);
    }
}
