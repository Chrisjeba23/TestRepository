package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Methods {

	WebDriver driver;


	@Test
	public void Test1() {

		driver.findElement(By.id("username")).sendKeys("studawre");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}

	@Test
	public void Test2() {

		driver.findElement(By.id("username")).sendKeys("studawre");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}

	@Test
	public void Test3() {

		driver.findElement(By.id("username")).sendKeys("studawre");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}





	@BeforeMethod
	public void beforeMethod() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();


	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
