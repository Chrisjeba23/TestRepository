package DatadrivenframeworkPractice;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Dataprovider {

	WebDriver driver;
	String Actualtitle,Expectedtitle;

	@Test(dataProvider = "Login")
	public void f(String un, String ps) {

		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(ps);
		driver.findElement(By.id("submit")).click();
		
		



	}
	@BeforeMethod
	public void beforemethod()
	{

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}


	@AfterMethod
	public void afterMethod() {

		Actualtitle=driver.getTitle();
		Expectedtitle="Logged In Successfully | Practice Test Automation";

		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Login is success");
		}
		else {
			System.out.println("Login failure");

		}

	}


	@DataProvider
	public Object[][] Login() {
		return new Object[][] {
			new Object[] { "John", "John123" },
			new Object[] { "Samuel", "sam123" },
			new Object[] { "student", "Password123" },
			new Object[] { "stude", "Password123" },
		};
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
