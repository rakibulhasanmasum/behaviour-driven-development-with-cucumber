package com.trucklagbe.pageObjects.trips.creation;

import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.Page;
import com.trucklagbe.selenium.Wait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TripInformationTab extends Page {
    private WebDriver driver;

    @FindBy(id = "trip-info-panel")
    private WebElement tripInfoPanel;

    // TRUCK SECTION
    private WebElement routeButton;

    private WebElement wholeDayButton;

    @FindBy(id = "truckCategoryDropdown")
    private WebElement truckCategoryDropDownButton;

    // TRUCK CATEGORY
//        @FindBy(className = "select_ton")
//        private WebElement selectTonSection;

    @FindBy(css = ".select_ton .truck-type-filter-btn")
    private List<WebElement> truckCategoryTonButtons;

    private WebElement selectFeetSection;

    @FindBy(css = ".select_feet .truck-type-filter-btn")
    private List<WebElement> truckCategoryFeetButtons;

    @FindBy(css = ".trailer-shape-type-body button")
    private List<WebElement> truckTypeButtons;

    private WebElement selectTrailerTruckSection;

    private WebElement selectDumpTruckSection;

    private WebElement selectTypeSection;

    @FindBy(id = "apply")
    private WebElement applyButton;

    private WebElement decreaseTruckCountButton;

    private WebElement increaseTruckCountButton;

    private WebElement numberOfTrucksInputBox;

    // CONTACT PERSON SECTION
    private WebElement kamNameCheckBox;

    private WebElement kamNameDropDownButton;

    private WebElement shipperNameAndContactCheckbox;


    // TRIP TYPE SECTION
    private WebElement fixedPriceButton;

    @FindBy(xpath = "//button[text()='Bidding ']")
    private WebElement biddingTripTypeButton;

    private WebElement priceRangeButton;

    // TRIP DATE AND TIME

    @FindBy(id = "dateDropdown")
    private WebElement dateFieldDropDownButton;

    @FindBy(css = ".ngb-dp-day:not(.disabled)")
    private List<WebElement> enabledDateButtons;

    @FindBy(id = "schedule_time")
    private WebElement timeFieldDropDownButton;

    @FindBy(css = ".schedule_time option")
    private List<WebElement> scheduleTimeOptions;

    private WebElement nowButton;

    // DISCOUNT
    private WebElement discountCodeInputField;

    private WebElement discountApplyButton;

    private WebElement aeReferenceInputField;

    // PRICE SECTION
    @FindBy(id = "shipper_rate")
    private WebElement shipperBudgetInputField;

    private WebElement ownerPriceInputField;

    private WebElement profitInputField;

    // PAYMENT SELECTION
    @FindBy(css = "input[formcontrolname=isCashTrip]")
    private WebElement cashTripCheckboxButton;

    @FindBy(css = "input[formcontrolname=isCreditTrip]")
    private WebElement creditTripCheckboxButton;

    // PRODUCT DETAILS
    @FindBy(id = "product_details")
    private WebElement productDetailsInputField;

    // RESET
    private WebElement resetButton;

    // PUBLISH
    @FindBy(xpath = "//button[text()='PUBLISH TRIP ']")
    private WebElement publishButton;

    public TripInformationTab(WebDriver webDriver) {
        super(webDriver);
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void userIsCurrentlyOnThisTab() {
        Assert.assertTrue( tripInfoPanel.getAttribute("class").contains("active") );
    }

    public void clickTruckCategoryButton() {
        truckCategoryDropDownButton.click();
    }

    public void isTruckCategoryDropDownExpanded() {
        Assert.assertTrue( truckCategoryDropDownButton.getAttribute("aria-expanded").contains("true") );
    }

    public void selectGivenTruckTon(String givenTon) {
        for (WebElement availableTon : truckCategoryTonButtons) {
            if (availableTon.getText().strip().equalsIgnoreCase(givenTon)) {
                availableTon.click();
                return;
            }
        }
        throw new NoSuchElementException(givenTon + " ton truck is not available at this moment");
    }

    public void selectGivenTruckFeet(String givenFeet) {
        for (WebElement availableFeet : truckCategoryFeetButtons) {
            if (availableFeet.getText().equalsIgnoreCase(givenFeet)) {
                availableFeet.click();
                return;
            }
        }
        throw new NoSuchElementException(givenFeet + " feet truck is not available at this moment");
    }

    public void selectGivenTruckType(String givenType) {
        for (WebElement availableType : truckTypeButtons) {
            if (availableType.getText().equalsIgnoreCase(givenType)) {
                availableType.click();
                return;
            }
        }
        throw new NoSuchElementException(givenType + " type truck is not available at this moment");
    }

    public void clickTruckCategoryApplyButton() {
        applyButton.click();
    }

    public void clickBiddingTripTypeButton() {
        biddingTripTypeButton.click();
    }

    public void clickDateDropDownButton() {
        dateFieldDropDownButton.click();
    }

    public void clickTimeDropDownButton() {
        timeFieldDropDownButton.click();
    }

    public void checkIfDateDropDownAriaExpanded() {
        String ariaExpanded = dateFieldDropDownButton.getAttribute("aria-expanded");
        Assert.assertTrue(ariaExpanded.contains("true"));
    }

    public void checkIfSelectableDatesCountIsEqualsTo(String dayLimits) {
        int totalEnabledDateButtons = enabledDateButtons.size();
        Assert.assertTrue((totalEnabledDateButtons) == Integer.valueOf(dayLimits));
    }

    public void selectDateForTripCreation(String givenDate) {
        for (WebElement dateButton : enabledDateButtons) {
            if (dateButton.getText().equalsIgnoreCase(givenDate)) {
                dateButton.click();
                return;
            }
        }
        throw new NoSuchElementException("Date " + givenDate + " was failed to select");
    }

    public void selectScheduleTimeForTripCreation(String givenTime) {
        for (WebElement timeOption : scheduleTimeOptions) {
            String option = timeOption.getText();
            if (option.equalsIgnoreCase(givenTime)) {
                timeOption.click();
                return;
            }
        }
        throw new NoSuchElementException(givenTime + " was failed to select as trip time");
    }

    public void enterShipperBudget(String givenBudget) {
        shipperBudgetInputField.sendKeys(givenBudget);
    }

    public void enterProductDetails(String givenProductDetails) {
        productDetailsInputField.sendKeys(givenProductDetails);
    }

    public void selectPaymentType(String givenPaymentType) {
        if (givenPaymentType.strip().equalsIgnoreCase("cash")) {
            cashTripCheckboxButton.click();
        } else if(givenPaymentType.strip().equalsIgnoreCase("credit")) {
            creditTripCheckboxButton.click();
        } else {
            throw new NoSuchElementException(givenPaymentType +" is not implemented yet");
        }
    }

    public void clickPublishButton() {
        publishButton.click();
        Wait.untilJqueryIsDone(driver);
        WaitExplicit.wait(3000);
    }
}
