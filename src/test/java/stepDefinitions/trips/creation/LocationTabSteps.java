package stepDefinitions.trips.creation;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.creation.LocationTab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LocationTabSteps {
    TestContext testContext;
    LocationTab locationTab;

    public LocationTabSteps(TestContext context) {
        testContext = context;
        locationTab = testContext.getPageObjectManager().getLocationTab();
    }

    @Then("he enters the load location {string}")
    public void heEntersTheLoadLocation(String loadLocation) {
        locationTab.setLoadLocation(loadLocation);
    }

    @And("selects the {int}{string} suggestion")
    public void selectsTheSuggestion(int suggestionNumber, String numberSuffix) {
        locationTab.selectNthLocationSuggestion(suggestionNumber);
    }

    @Then("enters the unload location {string}")
    public void entersTheUnloadLocation(String unloadLocation) {
        locationTab.setUnloadLocation(unloadLocation);
    }

    @Then("he clicks the done button")
    public void heClicksTheDoneButton() {
        locationTab.clickDoneButton();
    }

    @And("he clicks the next button")
    public void heClicksTheNextButton() {
        locationTab.clickNextButton();
    }
}
