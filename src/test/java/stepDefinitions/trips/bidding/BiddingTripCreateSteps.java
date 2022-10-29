package stepDefinitions.trips.bidding;

import com.alpine.cucumber.TestContext;
import com.alpine.managers.FileReaderManager;
import com.alpine.pageObjects.trips.RequestsPage;
import com.alpine.testDataTypes.Shipper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;

public class BiddingTripCreateSteps {
    TestContext testContext;
    RequestsPage requestsPage;

    public BiddingTripCreateSteps(@NotNull TestContext testContext) {
        this.testContext = testContext;
        requestsPage = testContext.getPageObjectManager().getRequestsPage();
    }

    @Given("Admin user is on request page")
    public void adminUserIsOnRequestPage() {
        requestsPage.navigateToRequestsPage();
    }

    @Then("Admin user enters {string}")
    public void adminUserEnters(String arg0) {
        int shipperId = Integer.parseInt(arg0);
        Shipper shipper = FileReaderManager.getInstance().getJsonReader().getShipperById(shipperId);
        System.out.println(shipper.user_details_id);
    }
}
