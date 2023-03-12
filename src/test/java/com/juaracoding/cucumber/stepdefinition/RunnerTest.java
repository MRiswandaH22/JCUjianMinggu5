package com.juaracoding.cucumber.stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/2.Order.feature",
        "src/main/resources/features/1.ValidLogin.feature"},
        glue = {"com.juaracoding.cucumber"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
