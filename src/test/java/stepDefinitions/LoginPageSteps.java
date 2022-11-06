package stepDefinitions;

import com.trucklagbe.cucumber.TestContext;
import com.trucklagbe.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
    TestContext testContext;
    LoginPage loginPage;
    public LoginPageSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }
    @Given("Admin user is on login page and he clicks the login button")
    public void adminUserIsOnLoginPageAndHeClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Given("Admin user is on login page")
    public void adminUserIsOnLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @Then("he clicks the login button")
    public void heClicksTheLoginButton() {
        loginPage.clickLoginButton();
    }
}
