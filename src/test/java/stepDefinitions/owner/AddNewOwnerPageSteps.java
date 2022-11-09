package stepDefinitions.owner;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.owner.AddNewOwnerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewOwnerPageSteps {
    private TestContext testContext;
    private AddNewOwnerPage addNewOwnerPage;

    public AddNewOwnerPageSteps(TestContext context) {
        testContext = context;
        addNewOwnerPage = testContext.getPageObjectManager().getAddNewOwnerPage();
    }

    @Then("opens add new owner page")
    public void opensAddNewOwnerPage() {
        addNewOwnerPage.checkIfUserIsOnThisPage();
    }

    @And("he enters {string} as owner name")
    public void heEntersAsOwnerName(String ownerName) {
        addNewOwnerPage.enterGivenValueOnInputField("Name", ownerName);
    }

    @And("he types {string} as owner phone")
    public void heTypesAsOwnerPhone(String ownerPhone) {
        addNewOwnerPage.enterGivenValueOnInputField("Phone Number", ownerPhone);
    }

    @And("he clicks type drop down button and selects {string} as owner type")
    public void heClicksTypeDropDownButtonAndSelectsAsOwnerType(String ownerType) {
        addNewOwnerPage.clickOwnerTypeDropDownButton();
        addNewOwnerPage.selectOwnerType(ownerType);
    }

    @Then("he clicks on the create account button")
    public void heClicksOnTheCreateAccountButton() {
        addNewOwnerPage.clickCreateAccountButton();
    }
}
