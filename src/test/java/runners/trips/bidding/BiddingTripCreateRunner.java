package runners.trips.bidding;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinitions.trips.bidding.create"},
        features = "src/test/resources/functionalTests/trips/bidding/BiddingTripCreate.feature",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html"},
        monochrome = true
)
public class BiddingTripCreateRunner {
}
