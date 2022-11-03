package stepDefinitions.trips.creation;

import com.trucklagbe.cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks {
    static TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL STARTED");
    }

    @Before
    public void BeforeSteps() {
    }

    @After
    public void AfterSteps() {
//        testContext.getWebDriverManager().closeDriver();
    }

    @AfterAll
    public static void before_or_after_all() {
        System.out.println("F IN IS ED");
        WebDriver driver = testContext.getWebDriverManager().getDriver();
        if (!driver.toString().contains("null")) {
            testContext.getWebDriverManager().closeDriver();
        } else {
            System.out.println("QUIT EARLIER");
        }
    }
}
