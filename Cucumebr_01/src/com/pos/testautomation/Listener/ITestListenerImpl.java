package com.pos.testautomation.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImpl implements ITestListener

{	
	public void onTestStart(ITestResult result) {
		
	}


	public void onTestFail(ITestResult result) {
		System.out.println("FAILL");
		
	}

	public void onTestSucces(ITestResult result) {
		System.out.println("PASS");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
	}
	public void onTestFailedBuiltIthSuccessPercentage(ITestResult result) {
		
	}


	public void onStart(ITestContext context) {
		System.out.println("Execution Compleated on UAT env...");
	}

	
	public void OnFinish(ITestContext context) {
		System.out.println("Execution Compleated on UAT env...");
		
	}
	
}
