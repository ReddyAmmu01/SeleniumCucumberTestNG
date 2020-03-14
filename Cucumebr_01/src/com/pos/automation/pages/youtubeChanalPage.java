package com.pos.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class youtubeChanalPage {
	
	WebDriver driver;
	public youtubeChanalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using="Sudhakar")
	public WebElement SearchClick;
	public String getTitle1() throws Exception {
		Thread.sleep(2000);
		return driver.getTitle();
	}
	

}
