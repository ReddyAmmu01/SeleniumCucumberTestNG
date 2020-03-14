package com.pos.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class youtubeResultPage {
	WebDriver driver;
	public youtubeResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using="Bakkappa N - TheTechie AutomationLaboratory")
	public WebElement SearchClick1;
	
	public void NavigationChannalPage() throws InterruptedException{
		Thread.sleep(3000);
		SearchClick1.click();
		Thread.sleep(3000);
	}
	
	

}
