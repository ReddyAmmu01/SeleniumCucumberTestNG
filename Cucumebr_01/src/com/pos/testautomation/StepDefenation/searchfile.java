package com.pos.testautomation.StepDefenation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pos.testautomation.Utility.propertyFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class searchfile {
	
	public static WebDriver driver;
	propertyFileReader obj = new propertyFileReader();
	@Given("^Open the browser and open the url$")
	public void open_the_browser_and_open_the_url() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","D:\\Selinum\\Browesers_List\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Properties prop = obj.getProperty();
		driver.get(prop.getProperty("browser"));
		Thread.sleep(5000);
		
	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^Enter Search Criteria$")
	public void enter_Search_Criteria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.findElement(By.name("search_query")).sendKeys("Selenium ");
		Thread.sleep(5000);
	}

	@Then("^Click on Search buttons$")
	public void click_on_Search_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

	

}
