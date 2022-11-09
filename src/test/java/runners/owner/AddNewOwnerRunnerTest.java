package runners.owner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinitions"},
        features = "src/test/resources/functionalTests/owner/AddNewOwner.feature",
        plugin = {
//                "support.GlobalHook",
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html",
        },
        monochrome = true
)
public class AddNewOwnerRunnerTest {}
