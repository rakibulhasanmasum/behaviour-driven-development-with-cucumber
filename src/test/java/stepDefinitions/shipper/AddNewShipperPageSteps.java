package stepDefinitions.shipper;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.shipper.AddNewShipperPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddNewShipperPageSteps {
    private TestContext testContext;
    private AddNewShipperPage addNewShipperPage;
    public AddNewShipperPageSteps(TestContext context) {
        testContext = context;
        addNewShipperPage = testContext.getPageObjectManager().getAddNewShipperPage();
    }

    @Then("opens add new shipper page")
    public void opensAddNewShipperPage() {
        addNewShipperPage.userIsOnThisPage();
    }


    @And("he enters {string} in name input field")
    public void heEntersInNameInputField(String shipperName) {
//        addNewShipperPage.enterNewShipperName(shipperName);
        addNewShipperPage.enterValuesInInputField("Name", shipperName);
    }

    @And("he enters {string} in company name field")
    public void heEntersInCompanyNameField(String shipperCompany) {
        addNewShipperPage.enterValuesInInputField("Company Name", shipperCompany);
    }

    @And("he enters {string} in phone number field")
    public void heEntersInPhoneNumberField(String shipperPhone) {
        addNewShipperPage.enterValuesInInputField("Phone Number", shipperPhone);
    }

    @And("he selects {string} as shipper type")
    public void heSelectsAsShipperType(String shipperType) {
        addNewShipperPage.selectShipperType(shipperType);
    }

    @And("clicks create account button")
    public void clicksCreateAccountButton() {
        addNewShipperPage.clickCreateAccountButton();
    }
}
