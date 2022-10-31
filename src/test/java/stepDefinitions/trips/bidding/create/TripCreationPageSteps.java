package stepDefinitions.trips.bidding.create;

import com.alpine.cucumber.TestContext;
import com.alpine.pageObjects.trips.TripCreationPage;
import com.alpine.selenium.Wait;
import io.cucumber.java.en.And;

public class TripCreationPageSteps {
    TestContext testContext;
    TripCreationPage tripCreationPage;

    public TripCreationPageSteps(TestContext context) {
        testContext = context;
        tripCreationPage = testContext.getPageObjectManager().getTripCreationPage();
        System.out.println("TRIP CREATION PAGE STEPS");
    }

    @And("This will take Admin user to the Trip Creation Page")
    public void thisWillTakeAdminUserToTheTripCreationPage() {
        tripCreationPage.userIsCurrentlyOnThisPage();
    }
}
