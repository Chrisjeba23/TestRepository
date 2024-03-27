package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PageObjectModel {

	WebDriver driver;
	POMclass p;


	@Test
	public void Login() {

		p.username();
		p.password();
		p.Loginbutton();


	}
	
	
	
	
	@BeforeTest
	public void beforeTest() {

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");

		p=new POMclass(driver);

	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}
