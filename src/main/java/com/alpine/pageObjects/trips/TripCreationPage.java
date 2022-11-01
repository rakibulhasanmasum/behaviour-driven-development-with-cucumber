package com.alpine.pageObjects.trips;

import com.alpine.pageObjects.Page;
import com.alpine.selenium.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TripCreationPage extends Page {
    private final WebDriver driver;

    // ========== UNDER LOCATION =====================
    @FindBy(className = "shipper-container-fluid")
    private WebElement shipperContainerFluid;

    @FindBy(xpath = "//*[@id=\"location-panel\"]/app-location/div/div/div[1]/div/app-location-search-bar/div/div[1]/input")
    WebElement loadLocationInputField;

    @FindBy(xpath = "//*[@id=\"location-panel\"]/app-location/div/div/div[3]/div/app-location-search-bar/div/div[1]/input")
    WebElement unloadLocationInputField;

    @FindBy(className = "suggestion-item")
    List<WebElement> suggestionList;

    @FindBy(xpath = "/html/body/app-root/div/div[2]/section/app-trip-creation/div/div[2]/div[2]/button")
    WebElement doneButton;

    @FindBy(xpath = "/html/body/app-root/div/div[2]/section/app-trip-creation/div/div[2]/div[2]/button")
    WebElement nextButton;

    // ========== UNDER TRIP INFORMATION =============

    // TRUCK SECTION
    WebElement routeButton;

    WebElement wholeDayButton;

    WebElement truckCategoryDropDownButton;

    WebElement decreaseTruckCountButton;

    WebElement increaseTruckCountButton;

    WebElement numberOfTrucksInputBox;

    // CONTACT PERSON SECTION
    WebElement kamNameCheckBox;

    WebElement kamNameDropDownButton;

    WebElement shipperNameAndContactCheckbox;


    // TRIP TYPE SECTION
    WebElement fixedPriceButton;

    WebElement biddingButton;

    WebElement priceRangeButton;

    // TRIP DATE AND TIME

    WebElement dateFieldButton;

    WebElement timeFieldButton;

    WebElement nowButton;

    // DISCOUNT
    WebElement discountCodeInputField;

    WebElement discountApplyButton;

    WebElement aeReferenceInputField;

    // PRICE SECTION
    WebElement shipperPriceInputField;

    WebElement ownerPriceInputField;

    WebElement profitInputField;

    // PAYMENT SELECTION
    WebElement cashCheckboxButton;

    WebElement creditCheckboxButton;

    // PRODUCT DETAILS
    WebElement productDetailsInputField;

    // RESET
    WebElement resetButton;

    // PUBLISH
    @FindBy(xpath = "//button[@type = 'submit' and text()='PUBLISH TRIP ']")
    WebElement publishButton;

    public TripCreationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void userIsCurrentlyOnThisPage() {
        Wait.untilPageLoadComplete(driver);
        Wait.untilJqueryIsDone(driver);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("trip_creation"));
    }

    public void setLoadLocation(String loadLocation) {
        loadLocationInputField.sendKeys(loadLocation);
    }

    public void selectNthLocationSuggestion(int suggestionEntryNumber)  {
        WebElement elem = suggestionList.get(suggestionEntryNumber - 1).findElement(By.className("title"));
        elem.click();
    }

    public void setUnloadLocation(String unloadLocation) {
        unloadLocationInputField.sendKeys(unloadLocation);
    }

    public void clickDoneButton() {
        doneButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
        WaitExplicit.wait(200);
    }
}
