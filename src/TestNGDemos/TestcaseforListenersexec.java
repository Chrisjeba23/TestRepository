package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestcaseforListenersexec {

	WebDriver driver;
	String Acturl,Expurl;


	@Test
	public void Testcase1() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("stud");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String Acturl=driver.getCurrentUrl();
		
		Assert.assertEquals(Acturl, Expurl);
		


	}

	@Test
	public void Testcase2() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();


	}


	@BeforeMethod
	public void beforeMethod() {

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterMethod
	public void afterMethod() {

		Acturl=driver.getCurrentUrl();
		Expurl="https://practicetestautomation.com/logged-in-successfully/";

		if(Acturl.equals(Expurl))
		{
			System.out.println("Login is passed");
		}
		else
		{
			System.out.println("Login is failed");
		}


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
