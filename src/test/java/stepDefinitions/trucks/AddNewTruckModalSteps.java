package stepDefinitions.trucks;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.trucks.AddNewTruckModal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddNewTruckModalSteps {
    private TestContext testContext;
    private AddNewTruckModal addNewTruckModal;

    public AddNewTruckModalSteps(TestContext context) {
        testContext = context;
        addNewTruckModal = testContext.getPageObjectManager().getAddNewTruckModal();
    }

    @Then("add new truck modal opens to search owner")
    public void addNewTruckModalOpensToSearchOwner() {
        addNewTruckModal.checkIfAddNewTruckModalIsOpened();
    }

    @And("he types {string} as owner info on the search field")
    public void heTypesAsOwnerInfoOnTheSearchField(String ownerInfo) {
        addNewTruckModal.enterOwnerInfoInTheAddNewTruckSearchModalInputField(ownerInfo);
    }

    @And("clicks the search button")
    public void clicksTheSearchButton() {
        addNewTruckModal.clickSearchButton();
    }

    @Then("owner info card appears with searched owner's information")
    public void ownerInfoCardAppearsWithSearchedOwnerSInformation() {

    }

    @And("Admin user checks if the fetched info matches")
    public void adminUserChecksIfTheFetchedInfoMatches() {

    }

    @Then("he clicks on the proceed button for further steps")
    public void heClicksOnTheProceedButtonForFurtherSteps() {
        addNewTruckModal.clickProceedButton();
    }

    @And("add new truck form appears")
    public void addNewTruckFormAppears() {
    }

    @Then("he clicks on the select metro drop down button")
    public void heClicksOnTheSelectMetroDropDownButton() {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Select Metro", " Select Metro");
    }

    @And("he selects {string} for truck metro")
    public void heSelectsForTruckMetro(String arg0) {
    }

    @Then("he clicks select class drop down button")
    public void heClicksSelectClassDropDownButton() {
    }

    @And("he selects {string} for truck class")
    public void heSelectsForTruckClass(String arg0) {
    }

    @Then("he types {string} as vehicle number")
    public void heTypesAsVehicleNumber(String arg0) {
    }

    @Then("he clicks on the category drop down button")
    public void heClicksOnTheCategoryDropDownButton() {
    }

    @And("he selects {string} as ton, {string} as feet, {string} as type")
    public void heSelectsAsTonAsFeetAsType(String arg0, String arg1, String arg2) {
    }

    @Then("he clicks apply button")
    public void heClicksApplyButton() {
    }

    @Then("he clicks on truck model name drop down button")
    public void heClicksOnTruckModelNameDropDownButton() {
    }

    @And("he selects {string} as truck model name")
    public void heSelectsAsTruckModelName(String arg0) {
    }

    @Then("he types {string} as manufacturing month")
    public void heTypesAsManufacturingMonth(String arg0) {
    }

    @And("he types {string} as manufacturing year")
    public void heTypesAsManufacturingYear(String arg0) {
    }

    @Then("he types {string} as truck height")
    public void heTypesAsTruckHeight(String arg0) {
    }

    @Then("he types {string} as truck width")
    public void heTypesAsTruckWidth(String arg0) {
    }

    @Then("he types {string} as truck length")
    public void heTypesAsTruckLength(String arg0) {
    }

    @Then("he types {string} as truck capacity")
    public void heTypesAsTruckCapacity(String arg0) {
    }

    @Then("he clicks on the hq drop down button")
    public void heClicksOnTheHqDropDownButton() {
    }

    @And("he select {string} as truck hq")
    public void heSelectAsTruckHq(String arg0) {
    }

    @Then("he clicks on the stand drop down button")
    public void heClicksOnTheStandDropDownButton() {
    }

    @And("he selects {string} as truck stand")
    public void heSelectsAsTruckStand(String arg0) {
    }

    @And("he clicks add button")
    public void heClicksAddButton() {
    }
}
