package TestNGDemos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersClass implements ITestListener {
	
	WebDriver driver;
	
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test case Execution is initialized");
		
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Login Test Case execution is started");
		
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Case is passed");
		
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Case Failed");
		
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Some test case is getting Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Case is skipped");
		
		
	}
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Case Execution is completed");
		
		
	}
	
}
