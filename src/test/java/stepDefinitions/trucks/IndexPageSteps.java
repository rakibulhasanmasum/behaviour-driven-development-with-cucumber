package stepDefinitions.trucks;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.trucks.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndexPageSteps {
    private TestContext testContext;
    private IndexPage indexPage;

    public IndexPageSteps(TestContext context) {
        testContext = context;
        indexPage = testContext.getPageObjectManager().getTruckIndexPage();
    }

    @When("Admin user is on trucks index page")
    public void adminUserIsOnTrucksIndexPage() {
        indexPage.checkIfUserIsOnThisPage();
    }

    @Then("he clicks on the add new truck button")
    public void heClicksOnTheAddNewTruckButton() {
        indexPage.clickAddNewTruckButton();
    }

}
