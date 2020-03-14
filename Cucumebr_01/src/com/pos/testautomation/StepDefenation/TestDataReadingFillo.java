package com.pos.testautomation.StepDefenation;

import java.util.Map;

import com.pos.testautomation.Utility.ExcelHandeler;

import cucumber.api.java.en.Given;
import cucumber.api.java.it.Ma;

public class TestDataReadingFillo {
	

@Given("^Read test Data for Test Case$")
public void read_test_Data_for_Test_Case() throws Throwable {
    
	Map<String, String> TestDataInMap  = ExcelHandeler.getTestDataInMap("./TestData_File/TestCaseDetails.xlsx", "Sheet1","TestCae_1");
	System.out.println(TestDataInMap.get("skil_4"));
	
}

}
