package stepDefinitions.trips;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.trips.RequestsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @When("Enters Shipper ID {string}")
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

    @And("he checks if the shipper id {string} is valid")
    public void adminUserChecksIfTheShipperIdIsValid(String shipperInfo) {
        requestsPage.checkIfShipperInfoMatches(shipperInfo);
    }

    @When("he Clicks on the proceed button")
    public void clicksOnTheProceedButton() {
        requestsPage.clickProceedButton();
    }

    @Then("a new tab will open")
    public void aNewTabWillOpen() {
        requestsPage.handOverTheWindowHandler();
    }

    @When("he clicks on the shipper button")
    public void heClicksOnTheShipperButton() {
        requestsPage.clickShipperSideBarButton();
    }

    @Then("a new tab will open and he will be on shipper page respectively")
    public void aNewTabWillOpenAndHeWillBeOnShipperPageRespectively() {
        requestsPage.handOverTheDriverToNextTab();
    }

    @When("he clicks on the owner button")
    public void heClicksOnTheOwnerButton() {
        requestsPage.clickOwnerSideBarButton();
    }

    @Then("a new tab will open and he will be on owner page respectively")
    public void aNewTabWillOpenAndHeWillBeOnOwnerPageRespectively() {
        requestsPage.handOverTheDriverToNextTab();
    }
}
