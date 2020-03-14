package com.pos.testautomation.Listener;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.sitture.ExtentReporter;

public class ExtentListener {
	
	public static ExtentHtmlReporter report = null;
	public static ExtentReports extent = null;
	public static ExtentTest test = null;
	
	public static ExtentReports setUp() {
		
		String reportLocation = "./Report_Extent/Extent_Report.html";
		report = new ExtentHtmlReporter(reportLocation);
		report.config().setDocumentTitle("Automation Test Report ");
		report.config().setReportName("Autometion test report");
		report.config().setTheme(Theme.STANDARD);
		System.out.println("Extent Report Location Initialized .....");
		report.start();
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Application","Youtube");
		extent.setSystemInfo("OperatingSystem",System.getProperty("os.name"));
		extent.setSystemInfo("User Name",System.getProperty("user.name"));
		System.out.println("System Information set in Extent Report ");
			
		return extent;
	}
	
		public static void testStepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) 
		{
			switch (teststatus) {
			
			case "FAIL":
				extenttest.fail(MarkupHelper.createLabel("Test Case is Failed:",ExtentColor.RED));
				//extenttest.fail(MarkupHelper.createLabel("Test Case is Failed:",ExtentColor.RED));
				extenttest.error(throwable.fillInStackTrace());
				try {
					extenttest.addScreencastFromPath(captureScreenShot(driver));
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				if(driver != null) {
					driver.quit();
				}
				break;
			case "PASS":
				extenttest.pass(MarkupHelper.createLabel("Test Case is Passed:",ExtentColor.GREEN));
				break;

			default:
				break;
			}}
		
		public static String captureScreenShot(WebDriver driver) throws IOException {
			TakesScreenshot screen =(TakesScreenshot)driver;
			File source = screen.getScreenshotAs(OutputType.FILE);
			String dest = "./Report_Extent/"+getCurrentdayeandtime()+ ".png";
			File target = new File(dest);
			FileUtils.copyFile(source, target);
			return dest;
		}
		private static String getCurrentdayeandtime() {
			String str = null;
			try
			{
				DateFormat dateformate = new SimpleDateFormat("MM/DD/YYYY HH:MM:SS:SSS");
				Date date = new Date();
				str = dateformate.format(date);
				str = str.replace(" ","").replaceAll("/"," ").replaceAll(":","");
			}
			catch (Exception e) {
				
			}
			return str;
		}
		
		
	}


