package com.alpine.stepDefinitions.trips.bidding;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.RequestsPage;
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

    @Then("Admin user enters shipper id")
    public void adminUserEntersShipperId() {
    }
}
