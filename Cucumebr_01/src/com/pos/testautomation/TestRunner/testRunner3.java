package com.pos.testautomation.TestRunner;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.TestNgReporter;
import io.cucumber.core.gherkin.vintage.internal.gherkin.events.PickleEvent;


@CucumberOptions(features = "./FeatureFile",
				glue = {"com.pos.testautomation.StepDefenation"},
				tags = {"@ExtentReport123"},
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","html:target/site/cucumber-pretty",
						"json:target/cucumber.json"})

public class testRunner3 {
	private TestNGCucumberRunner TNCRunner;
	
	@BeforeClass(alwaysRun = true)
	public void SetupClass() {
		TNCRunner = new TestNGCucumberRunner(this.getClass());
		
	}
	@Test(dataProvider = "features")
		public void feature(CucumberFeatureWrapper cucumberFeature) {
		TNCRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
		public Object[][] features(){
			return TNCRunner.provideFeatures();
			
		}
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception{
		TNCRunner.finish();
	}
	
}
