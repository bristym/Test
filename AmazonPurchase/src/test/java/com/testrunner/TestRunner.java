package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunner {


@CucumberOptions(
		
		features = "Feature",
		glue = "com.stepdef"
		
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}

}
