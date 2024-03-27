package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BeforeandAfterTest {
	
	WebDriver driver;


	@Test
	public void Testcase1() {
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("studawre");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
	}
	
	@Test
	public void Testcase2() {
		
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		
	}
	
	@Test
	public void Testcase3() {
		
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("fswgrwg");
		driver.findElement(By.id("password")).sendKeys("Pfewfwe");
		driver.findElement(By.id("submit")).click();
		
		
		
	}
	
	
	
	
	
	@BeforeTest
	public void beforeTest() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		
	}

	@AfterTest
	public void afterTest() {
		
		driver.close();
	}

}
