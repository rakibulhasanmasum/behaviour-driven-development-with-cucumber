package com.alpine.runners.trips.bidding;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.alpine.stepDefinitions.trips.bidding"},
        features = "src/test/resources/functionalTests/trips/bidding/BiddingTripCreate.feature"
)
public class BiddingTripCreateRunner {
}
