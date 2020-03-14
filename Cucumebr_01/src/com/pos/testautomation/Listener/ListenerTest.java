package com.pos.testautomation.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class ListenerTest extends ExtentListener implements ITestListener {

	private static ExtentReports extent ;

	public void onFinish(ITestContext context) {
	
		extent.flush();
		System.out.println("Execution Completed On UAT ...");
	}

	public void onStart(ITestContext context) {
		extent = setUp();
		System.out.println("Execution Started On UAT...");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("PASS");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

}
