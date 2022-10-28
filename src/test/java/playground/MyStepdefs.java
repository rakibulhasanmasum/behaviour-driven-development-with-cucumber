package playground;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private WebDriver driver;
    @Given("User is on google home page")
    public void userIsOnGoogleHomePage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://google.com");
        assertEquals(driver.getTitle(), "Google");
    }

    @When("User search for facebook")
    public void userSearchForFacebook() {
    }

    @And("click on the link containing facebook.com")
    public void clickOnTheLinkContainingFacebookCom() {
        
    }

    @Then("User should be redirected to facebook.com")
    public void userShouldBeRedirectedToFacebookCom() {
        driver.quit();
    }
}
