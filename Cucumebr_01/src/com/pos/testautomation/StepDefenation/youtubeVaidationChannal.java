package com.pos.testautomation.StepDefenation;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.pos.automation.pages.youtubeChanalPage;
import com.pos.automation.pages.youtubeResultPage;
import com.pos.automation.pages.youtubesearchpage;
import com.pos.testautomation.Listener.ExtentListener;
import com.pos.testautomation.Utility.BrowserUtility;
import com.pos.testautomation.Utility.propertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class youtubeVaidationChannal extends ExtentListener{
	public WebDriver driver;
	propertyFileReader obj = new propertyFileReader();
	
	@Given("^open the browser and open the ur$")
	public void open_the_browser_and_open_the_ur() throws Throwable {
		ExtentTest logInfo = null;
		try {
			test = extent.createTest(Feature.class,"Youtube Search validation");
			test = test.createNode(Scenario.class,"Youtube search positive scenari");
			logInfo = test.createNode(new GherkinKeyword("Given"),"open_the_browser_and_open_the_ur");
			Properties prop = obj.getProperty();
			driver = BrowserUtility.OpenBrowser(driver,prop.getProperty("browsername"),prop.getProperty("browser"));
			logInfo.pass("Open Firefox Browser and Enter URL" );
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		}
		catch (AssertionError | Exception e) 
		{
			testStepHandle("FAIL",driver, logInfo,e);
		}
	}

	@When("^search selenium tutorial$")
	public void search_selenium_tutorial() throws Throwable {
	
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("When"),"search selenium tutoria");
			new youtubesearchpage(driver).NavigationResultPage();
			logInfo.pass("Seach Selenim Tutorial");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			
		}
		catch (AssertionError | Exception e) 
		{
			testStepHandle("FAIL", driver, logInfo,e);
		}
	}

	@When("^Click on Channal Name$")
	public void click_on_Channal_Name() throws Throwable {
	
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("When"),"Click on Channal Name");
			new youtubeResultPage(driver).NavigationChannalPage();
			logInfo.pass("Click On Channel  ");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			
		}
		catch (AssertionError | Exception e) 
		{
			testStepHandle("FAIL", driver, logInfo,e);
		}
   	}

	@Then("^Validate Chanal Name$")
	public void validate_Chanal_Name() throws Throwable {
		
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),"Validate Chanal Name");
			String eChannelName = "Bakkappa N - TheTechie AutomationLaboratory -  Youtube";
			String aChannelName = new youtubeChanalPage(driver).getTitle1();
			Assert.assertEquals(aChannelName, eChannelName,"Channel Name are not Match of the Page" );
		
			logInfo.pass("Validate The Channel Name ");
			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
			driver.quit();
		}
		catch (AssertionError | Exception e) 
		{
			testStepHandle("FAIL", driver, logInfo,e);
		}
   	}
}
