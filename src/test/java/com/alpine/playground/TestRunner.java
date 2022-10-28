package com.alpine.playground;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        glue = "."
)
//public class TestRunner extends AbstractTestNGCucumberTests {
public class TestRunner {
    public static void main(String[] args) {

    }
}
