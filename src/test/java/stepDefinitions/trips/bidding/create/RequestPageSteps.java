package stepDefinitions.trips.bidding.create;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.RequestsPage;
import com.alpine.pageObjects.trips.TripCreationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;

public class RequestPageSteps {
    TestContext testContext;
    RequestsPage requestsPage;

    public RequestPageSteps(TestContext context) {
        testContext = context;
        requestsPage = testContext.getPageObjectManager().getRequestsPage();
    }

    @Given("Admin user is on request page")
    public void adminUserIsOnRequestPage() {
        requestsPage.navigateToRequestsPage();
    }

    @Then("Clicks New Trip Create Button")
    public void clicksNewTripCreateButton() {
        requestsPage.clickNewTripButton();
    }

    @Then("Modal to Search Shipper Popups")
    public void modalToSearchShipperPopups() {
        requestsPage.checkIfShipperSearchButtonExists();
    }

    @Then("Enters Shipper ID {string}")
    public void enters(String shipperId) {
        requestsPage.enterValuesInShipperSearchInputField(shipperId);
    }

    @And("Clicks Search button")
    public void clicksSearchButton() {
        requestsPage.clickShipperSearchButton();
    }

    @Then("Shipper info card appears")
    public void shipperInfoCardAppears() {
        requestsPage.checkIfShipperCardAppears();
    }

    @And("Admin user checks if the shipper id {string} is valid")
    public void adminUserChecksIfTheShipperIdIsValid(String shipperInfo) {
        requestsPage.checkIfShipperInfoMatches(shipperInfo);
    }

    @Then("Clicks on the proceed button")
    public void clicksOnTheProceedButton() {
        requestsPage.clickProceedButton();
    }
}
