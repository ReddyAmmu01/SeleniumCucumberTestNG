package com.pos.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class youtubesearchpage2 {

	WebDriver driver;
	public youtubesearchpage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID,using="search") public WebElement SearchTextBox1;
	
	@FindBy(how = How.CSS,using="#search-icon-legacy" ) public WebElement Button;
	
	public void NavigationResultPage1(String SearchString) throws InterruptedException 
	{
		Thread.sleep(3000);
		SearchTextBox1.sendKeys(SearchString);
		Button.click();
	}
}
