package com.testNgAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmazonLogin {

	WebDriver driver;



	@Test
	public void LoginPositive() {

		driver.get("https://amazon.in/");
		WebElement Signin=driver.findElement(By.partialLinkText("Sign"));
		Signin.click();

		WebElement emailidfield=driver.findElement(By.id("ap_email"));
		emailidfield.sendKeys("Chrisjeba01@gmail.com");

		WebElement Continue=driver.findElement(By.id("continue"));
		Continue.click();


		WebElement passwordfield=driver.findElement(By.id("ap_password"));
		passwordfield.sendKeys("Christo@230594");

		WebElement Signinbutton=driver.findElement(By.id("signInSubmit"));
		Signinbutton.click();

		System.out.println("Login Passed");



	}

	@Test
	public void Loginnegative()
	{
		driver.get("https://amazon.in/");
		WebElement Signin=driver.findElement(By.partialLinkText("Sign"));
		Signin.click();

		WebElement emailidfield=driver.findElement(By.id("ap_email"));
		emailidfield.sendKeys("Chrisjeba01@gmail.com");

		WebElement Continue=driver.findElement(By.id("continue"));
		Continue.click();

		WebElement passwordfield=driver.findElement(By.id("ap_password"));
		passwordfield.sendKeys("Christo");

		WebElement Signinbutton=driver.findElement(By.id("signInSubmit"));
		Signinbutton.click();

		System.out.println("Login failed");


	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.amazon.in/");
		
	}

	@AfterTest
	public void afterTest() {

		System.out.println("After test");
		driver.close();
	}

}
