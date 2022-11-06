package stepDefinitions.trips;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.models.Shipper;
import com.trucklagbe.pageObjects.trips.RequestsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
}
