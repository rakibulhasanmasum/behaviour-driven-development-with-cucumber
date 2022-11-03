package stepDefinitions.trips.creation;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.trips.creation.TripInformationTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TripInformationTabSteps {
    TestContext testContext;
    TripInformationTab tripInformationTab;
    public TripInformationTabSteps(TestContext context) {
        testContext = context;
        tripInformationTab = testContext.getPageObjectManager().getTripInformationTab();
    }

    @Then("this will take him to the trip information tab")
    public void thisWillTakeHimToTheTripInformationTab() {
        tripInformationTab.userIsCurrentlyOnThisTab();
    }

    @When("he clicks truck category button truck category dropdown area expands")
    public void heClicksTruckCategoryButtonTruckCategoryDropdownAreaExpands() {
        tripInformationTab.isTruckCategoryDropDownExpanded();
    }

    @And("he clicks truck category button")
    public void heClicksTruckCategoryButton() {
        tripInformationTab.clickTruckCategoryButton();
    }

    @When("truck category dropdown area expands")
    public void truckCategoryDropdownAreaExpands() {
        tripInformationTab.isTruckCategoryDropDownExpanded();
    }

    @And("he selects {string} ton truck")
    public void heSelectsTonTruck(String truckTon) {
        tripInformationTab.selectGivenTruckTon(truckTon);
    }

    @And("he selects {string} feet truck")
    public void heSelectsFeetTruck(String truckFeet) {
        tripInformationTab.selectGivenTruckFeet(truckFeet);
    }

    @And("he selects {string} as truck type")
    public void heSelectsAsTruckType(String truckType) {
        tripInformationTab.selectGivenTruckType(truckType);
    }

    @And("clicks truck category apply button")
    public void clicksTruckCategoryApplyButton() {
        tripInformationTab.clickTruckCategoryApplyButton();
    }

    @Then("clicks bidding button to select trip type")
    public void clicksBiddingButtonToSelectTripType() {
        tripInformationTab.clickBiddingTripTypeButton();
    }

    @When("he clicks the date dropdown button")
    public void heClicksTheDateDropdownButton() {
       tripInformationTab.clickDateDropDownButton();
    }

    @And("after date dropdown field is being showed")
    public void afterDateDropdownFieldIsBeingShowed() {
        tripInformationTab.checkIfDateDropDownAriaExpanded();
    }

    @Then("he sees only {string} days counting from today is selectable only")
    public void heSeesOnlyDaysCountingFromTodayIsSelectableOnly(String dayLimits) {
        tripInformationTab.checkIfSelectableDatesCountIsEqualsTo(dayLimits);
    }

    @And("he selects {string} as date")
    public void heSelectsAsDate(String givenDate) {
        tripInformationTab.selectDateForTripCreation(givenDate);
    }

    @When("he clicks the time dropdown button")
    public void heClicksTheTimeDropdownButton() {
        tripInformationTab.clickTimeDropDownButton();
    }

    @Then("he selects {string} as time")
    public void heSelectsAsTime(String givenTime) {
        tripInformationTab.selectScheduleTimeForTripCreation(givenTime);
    }

    @Then("he enters {string} tk as shipper budget")
    public void heEntersTkAsShipperBudget(String givenBudget) {
        tripInformationTab.enterShipperBudget(givenBudget);
    }

    @And("he enters {string} as product details")
    public void heEntersAsProductDetails(String givenProductDetails) {
        tripInformationTab.enterProductDetails(givenProductDetails);
    }

    @Then("he selects {string} as payment type")
    public void heSelectsAsPaymentType(String givenPaymentType) {
        tripInformationTab.selectPaymentType(givenPaymentType);
    }

    @And("finally clicks the PUBLISH TRIP button")
    public void finallyClicksThePUBLISHTRIPButton() {
        tripInformationTab.clickPublishButton();
    }
}
