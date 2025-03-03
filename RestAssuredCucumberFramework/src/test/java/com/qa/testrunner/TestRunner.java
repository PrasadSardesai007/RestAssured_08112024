package com.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "com.qa.stepdefinations" }, 
plugin = {
		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags = "@Test")
public class TestRunner {

}
