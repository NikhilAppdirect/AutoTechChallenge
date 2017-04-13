package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Testlistener implements ITestListener
{
	Reporterlogtest log;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult Result) {
		 log.info("The name of the testcase failed is :"+Result.getName());
		
	}

	public void onTestSkipped(ITestResult Result) {
		log.info("The name of the testcase Skipped is :"+Result.getName());
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult Result) {
		log.info("The name of the testcase passed is :"+Result.getName());
		
	}
	
	
}
