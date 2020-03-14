package com.pos.testautomation.StepDefenation;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestHooks {
	
	@Before
	public void BeforeScenario(Scenario scenarion) {
		System.out.println("Started Execution for the Scenario : "+scenarion.getName());
	}
	@Before("@TestCase2")
	public void BeforeTestCase2(Scenario scemario) {
		System.out.println("=================================");
		System.out.println(" Tis The AI Condiotion Test Case of The File ");
		System.out.println("=================================");
	}
	@After
	public void AfterScenario(Scenario scenario) {
		System.out.println("Completed executio for the Scenario : "+scenario.getName());
		
	}

}
