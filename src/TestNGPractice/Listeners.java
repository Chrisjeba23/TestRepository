package TestNGPractice;

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

public class Listeners implements ITestListener {
	
	WebDriver driver;


	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testcase execution is started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("Test case is passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase is failed");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test is failed  ut within Success percentage");
	}
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Before Everything");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("After Everything	");
	}
	
	
}
