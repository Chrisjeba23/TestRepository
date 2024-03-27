package com.testNgAssignments;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor a=(JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(0,600)");
		System.out.println("down");
		//a.executeScript("window.scrollBy(0,-600)");
		//System.out.println("up");
		
	}

}
