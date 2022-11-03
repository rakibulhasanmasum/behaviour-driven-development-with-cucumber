package stepDefinitions.trips.creation;

import com.alpine.cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class Hooks {
    static TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
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
//        System.out.println("F IN IS ED");
        testContext.getWebDriverManager().closeDriver();
    }
}
