package stepDefinitions.trucks;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.helper.WaitExplicit;
import com.trucklagbe.pageObjects.trucks.AddNewTruckModal;
import com.trucklagbe.selenium.Wait;
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
        addNewTruckModal.clickDesiredDropDownButton("Select Metro");
    }

    @And("he selects {string} for truck metro")
    public void heSelectsForTruckMetro(String selectedMetro) {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Select Metro", selectedMetro);
    }

    @Then("he clicks select class drop down button")
    public void heClicksSelectClassDropDownButton() {
        addNewTruckModal.clickDesiredDropDownButton("Select Class");
    }

    @And("he selects {string} for truck class")
    public void heSelectsForTruckClass(String selectedClass) {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Select Class", selectedClass);
    }

    @Then("he types {string} as vehicle number")
    public void heTypesAsVehicleNumber(String vehicleNumber) {
        addNewTruckModal.enterVehicleNumber(vehicleNumber);
    }

    @Then("he clicks on the category drop down button")
    public void heClicksOnTheCategoryDropDownButton() {
        addNewTruckModal.clickTruckCategoryButton();
    }

    @And("he selects {string} as ton, {string} as feet, {string} as type")
    public void heSelectsAsTonAsFeetAsType(String ton, String feet, String type) {
        addNewTruckModal.selectGivenTonForTruckCategory(ton);
        addNewTruckModal.selectGivenFeetForTruckCategory(feet);
        addNewTruckModal.selectGivenTypeForTruckCategory(type);
    }

    @Then("he clicks apply button")
    public void heClicksApplyButton() {
        addNewTruckModal.clickApplyButton();
    }

    @Then("he clicks on truck model name drop down button")
    public void heClicksOnTruckModelNameDropDownButton() {
        addNewTruckModal.clickDesiredDropDownButton("Model Name");
    }

    @And("he selects {string} as truck model name")
    public void heSelectsAsTruckModelName(String modelName) {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Model Name", modelName);
    }

    @Then("he types {string} as manufacturing month")
    public void heTypesAsManufacturingMonth(String monthNumber) {
        addNewTruckModal.enterManufacturingMonth(monthNumber);
    }

    @And("he types {string} as manufacturing year")
    public void heTypesAsManufacturingYear(String givenYear) {
        addNewTruckModal.enterManufacturingYear(givenYear);
    }

//    @Then("he types {string} as truck height")
//    public void heTypesAsTruckHeight(String arg0) {
//    }
//
//    @Then("he types {string} as truck width")
//    public void heTypesAsTruckWidth(String arg0) {
//    }
//
//    @Then("he types {string} as truck length")
//    public void heTypesAsTruckLength(String arg0) {
//    }
//
//    @Then("he types {string} as truck capacity")
//    public void heTypesAsTruckCapacity(String arg0) {
//    }

    @Then("he clicks on the hq drop down button")
    public void heClicksOnTheHqDropDownButton() {
        addNewTruckModal.clickDesiredDropDownButton("Truck HQ");
    }

    @And("he select {string} as truck hq")
    public void heSelectAsTruckHq(String truckHQ) {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Truck HQ", truckHQ);
    }

    @Then("he clicks on the stand drop down button")
    public void heClicksOnTheStandDropDownButton() {
        addNewTruckModal.clickDesiredDropDownButton("Truck Stand");
    }

    @And("he selects {string} as truck stand")
    public void heSelectsAsTruckStand(String truckStand) {
        addNewTruckModal.selectGivenOptionFromGivenOptionType("Truck Stand", truckStand);
    }

    @And("he clicks add button")
    public void heClicksAddButton() {
        addNewTruckModal.clickAddButton();
    }
}
