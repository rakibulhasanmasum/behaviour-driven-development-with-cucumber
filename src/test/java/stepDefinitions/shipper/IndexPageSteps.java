package stepDefinitions.shipper;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.shipper.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndexPageSteps {
    private TestContext testContext;
    private IndexPage indexPage;
    public IndexPageSteps(TestContext context) {
        testContext = context;
        indexPage = testContext.getPageObjectManager().getShipperIndexPage();
    }

    @When("Admin user is on shipper index page")
    public void adminUserIsOnShipperIndexPage() {
        indexPage.userIsOnThisPage();
    }

    @Then("he clicks the add shipper button")
    public void heClicksTheAddShipperButton() {
        indexPage.clickAddNewShipperButton();
    }
}
