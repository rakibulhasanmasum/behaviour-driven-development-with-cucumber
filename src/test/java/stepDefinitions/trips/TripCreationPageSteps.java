package stepDefinitions.trips;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.TripCreationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TripCreationPageSteps {
    TestContext testContext;
    TripCreationPage tripCreationPage;

    public TripCreationPageSteps(TestContext context) {
        testContext = context;
        tripCreationPage = testContext.getPageObjectManager().getTripCreationPage();
    }

    @And("Now admin user is on trip creation page")
    public void nowAdminUserIsOnTripCreationPage() {
        tripCreationPage.userIsCurrentlyOnThisPage();
    }

    @Then("he enters the load location {string}")
    public void heEntersTheLoadLocation(String loadLocation) {
        tripCreationPage.setLoadLocation(loadLocation);
    }

    @And("selects the {int}{string} suggestion")
    public void selectsTheNthSuggestion(int suggestionEntryNumber, String numberSuffix) {
        tripCreationPage.selectNthLocationSuggestion(suggestionEntryNumber);
    }

    @Then("enters the unload location {string}")
    public void entersTheUnloadLocation(String unloadLocation) {
        tripCreationPage.setUnloadLocation(unloadLocation);
    }

    @Then("he clicks the done button")
    public void heClicksTheDoneButton() {
        tripCreationPage.clickDoneButton();
    }

    @And("he clicks the next button")
    public void heClicksTheNextButton() {
        tripCreationPage.clickNextButton();
    }
}
