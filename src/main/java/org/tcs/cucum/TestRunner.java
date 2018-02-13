package org.tcs.cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\org\\tcs\\cucum\\demoqa.feature", glue = {
		"org.tcs.cucum" })

public class TestRunner {

}
