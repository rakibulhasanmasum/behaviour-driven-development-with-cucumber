package stepDefinitions.owner;

import com.trucklagbe.cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndexPageSteps {
    private TestContext testContext;
    private com.trucklagbe.pageObjects.owner.IndexPage indexPage;

    public IndexPageSteps(TestContext context) {
        testContext = context;
        indexPage = testContext.getPageObjectManager().getOwnerIndexPage();
    }

    @Then("Admin user is on owner list page")
    public void adminUserIsOnOwnerListPage() {
        indexPage.checkIfUserIsOnThisPage();
    }

    @When("he clicks on the add owner button")
    public void heClicksOnTheAddOwnerButton() {
        indexPage.clickAddOwnerButton();
    }
}
