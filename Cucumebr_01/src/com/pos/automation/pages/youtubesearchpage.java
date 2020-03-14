package com.pos.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class youtubesearchpage {

	WebDriver driver;
	public youtubesearchpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID,using="search") public WebElement SearchTextBox;
	
	@FindBy(how = How.CSS,using="#search-icon-legacy" ) public WebElement Button;
	
	public void NavigationResultPage() throws InterruptedException 
	{
		Thread.sleep(3000);
		SearchTextBox.sendKeys("selenium By Bakkappa N ");
		Button.click();
	}
}
