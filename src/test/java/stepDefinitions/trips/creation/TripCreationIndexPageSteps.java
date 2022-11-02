package stepDefinitions.trips.creation;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.creation.TripCreationIndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TripCreationIndexPageSteps {
    TestContext testContext;
    TripCreationIndexPage tripCreationIndexPage;

    public TripCreationIndexPageSteps(TestContext context) {
        testContext = context;
        tripCreationIndexPage = testContext.getPageObjectManager().getTripCreationIndexPage();
    }

    @And("Now admin user is on trip creation page")
    public void nowAdminUserIsOnTripCreationPage() {
        tripCreationIndexPage.userIsCurrentlyOnThisPage();
    }
}
