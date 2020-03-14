package com.pos.testautomation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	public static WebDriver OpenBrowser(WebDriver driver, String browsername,String url) throws InterruptedException {
		if(browsername.equals("Chrome"))
		{
			System.setProperty("WebDriver.chrome.driver","E:\\Java_Projrams\\Selenium_Programs\\Cucumebr_01\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
		}
		else
		if(browsername.equals("IE"))
		{
			System.setProperty("WebDriver.ie.driver", "E:\\Java_Projrams\\Selenium_Programs\\Cucumebr_01\\Browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
		}
		else if (browsername.equals("Firefox")) {
			System.setProperty("WebDriver.ie.driver", "E:\\Java_Projrams\\Selenium_Programs\\Cucumebr_01\\Browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
			
			
		}
		return null;
		
	}

}
