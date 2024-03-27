package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class parameterization {

	WebDriver driver;



	@Parameters({"Username","Password"})
	@Test
	public void Login(String un,String pwd) {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();




	}
	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");


	}

	@AfterTest
	public void afterTest() {
	}

}
