package com.testNgAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	String filepath="E:\\ChristopherSeleniumDemo\\MyAutomationproject\\src\\com\\testNgAssignments\\KeywDrivenfile.properties";
	File file;
	FileInputStream fis;
	Properties prop;

	String Expectedurl="https://practicetestautomation.com/logged-in-successfully/",Actualurl;


	@Test
	public void LoginTest() {

		driver.findElement(By.xpath(prop.getProperty("usernamefieldxpath"))).sendKeys("student");
		driver.findElement(By.xpath(prop.getProperty("passwordfieldxpath"))).sendKeys("Password123");

		driver.findElement(By.xpath(prop.getProperty("Loginbuttonxpath"))).click();



	}
	@BeforeMethod
	public void beforeMethod() throws IOException {

		file=new File(filepath);
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));


	}

	@AfterMethod
	public void afterMethod() throws IOException {


		driver.getCurrentUrl();

		Actualurl=driver.getCurrentUrl();
		if(Expectedurl.equals(Actualurl))
		{
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login is not Successful");
		}
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
