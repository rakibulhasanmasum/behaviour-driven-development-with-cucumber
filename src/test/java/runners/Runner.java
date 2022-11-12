package runners;


import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;


// @RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinitions"},
        features = "src/test/resources/functionalTests",
        plugin = {
//                "support.GlobalHook",
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html",
        },
//        tags = "@add_new_shipper",
        tags = "@bidding_trip_create and @using_shipper_id",
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {}
