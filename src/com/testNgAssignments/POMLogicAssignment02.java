package com.testNgAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMLogicAssignment02 {

	WebDriver driver;

	public POMLogicAssignment02(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Usernamefield()
	{
		driver.findElement(By.id("username")).sendKeys("student");;
	}
	
	public void Passwordfield()
	{
		driver.findElement(By.id("password")).sendKeys("Password123");;
	}
	
	public void Loginbutton()
	{
		driver.findElement(By.id("submit")).click();
	}
	
	
	









}
