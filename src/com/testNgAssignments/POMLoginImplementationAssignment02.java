package com.testNgAssignments;

import org.testng.annotations.Test;

import com.testNgAssignments.POMLogicAssignment02;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class POMLoginImplementationAssignment02 {

	WebDriver driver;
	POMLogicAssignment02 p;

	@Test
	public void Login() {

		p.Usernamefield();
		p.Passwordfield();
		p.Loginbutton();

	}

	@BeforeMethod
	public void beforeMethod() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");

		p=new POMLogicAssignment02(driver);

	}

	@AfterMethod
	public void afterMethod() {

		String Actualurl=driver.getCurrentUrl();
		String Expectedurl="https://practicetestautomation.com/logged-in-successfully/";

		if(Actualurl.equals(Expectedurl))
		{
			System.out.println("Login is Successful");
		}
		else
		{
			System.out.println("Login is not successful");
		}
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
