package com.pos.testautomation.StepDefenation;

import java.util.Map;
import java.util.Properties;

import com.pos.testautomation.Utility.ExcelHandeler;
import com.pos.testautomation.Utility.TestDataHandeler;
import com.pos.testautomation.Utility.propertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

public class TestDataReadingFillo2 {
TestDataHandeler testdata = new TestDataHandeler();
propertyFileReader obj = new propertyFileReader();

@Given("^Read test Data for Test$")
public void read_test_Data_for_Test() throws Throwable {

	Properties prop = obj.getProperty();
	Map<String, String> TestDataInMap  = ExcelHandeler.getTestDataInMap(prop.getProperty("testdata.filepath"),prop.getProperty("sheetnameofthefile"),"TestCae_2");
	System.out.println(TestDataInMap.get("skil_1"));
	testdata.setTestDataInMap(TestDataInMap);
	
}

@When("^Rest test data for skiltwo$")
public void rest_test_data_for_skiltwo() throws Throwable {
	
	Map<String, String> testDataInMap = testdata.getTestDataInMap();
	System.out.println(testDataInMap.get("Skil_2"));
	
	
	}

@Then("^Read Test Data fpr Skilthre$")
public void read_Test_Data_fpr_Skilthre() throws Throwable {
	
	Map<String,String> test2 = testdata.getTestDataInMap();
	System.out.println(test2.get("Skil_3"));
	
	
	
}




}