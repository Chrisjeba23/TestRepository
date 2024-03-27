package com.testNgAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Interactingwithmenus {

	WebDriver driver;


	@Test
	public void test1() {
		
		WebElement bs=driver.findElement(By.linkText("Best Sellers"));
		bs.click();
	}
	
	@Test
	public void test2()
	{
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		mob.click();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver.get("https://amazon.in/");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println(driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));





	}

	@AfterTest
	public void afterTest() {
		
		driver.close();
	}

}
