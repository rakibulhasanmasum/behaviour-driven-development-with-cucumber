package runners.trips.bidding;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDefinitions.trips.bidding"},
        features = "src/test/resources/functionalTests/trips/bidding/BiddingTripCreate.feature"
)
public class BiddingTripCreateRunner {
}
