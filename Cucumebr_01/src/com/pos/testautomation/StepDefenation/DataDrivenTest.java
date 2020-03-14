package com.pos.testautomation.StepDefenation;

import java.util.Properties;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;

import com.pos.automation.pages.youtubeChanalPage;
import com.pos.automation.pages.youtubeResultPage;
import com.pos.automation.pages.youtubesearchpage;
import com.pos.automation.pages.youtubesearchpage2;
import com.pos.testautomation.Utility.BrowserUtility;
import com.pos.testautomation.Utility.propertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenTest {

	private WebDriver driver;
	propertyFileReader obj = new propertyFileReader();
	
	@Given("^Open the browser and enter the URL$")
	public void open_the_browser_and_enter_the_URL() throws Throwable {
	  Properties prop = obj.getProperty();
	  driver = BrowserUtility.OpenBrowser(driver,prop.getProperty("browsername"),prop.getProperty("browser"));
	  
	}

	@When("^search the Selenium Tutorial \"([^\"]*)\"$")
	public void search_the_Selenium_Tutorial(String SearchString) throws Throwable {
	  new youtubesearchpage2(driver).NavigationResultPage1(SearchString);
	  
		
	}

	@When("^Click on Channel$")
	public void click_on_Channel() throws Throwable {
	    new youtubeResultPage(driver).NavigationChannalPage();
	}

	@Then("^Validation Channel Name$")
	public void validation_Channel_Name() throws Throwable {
		new youtubeChanalPage(driver).getTitle1();
		
	}
}
