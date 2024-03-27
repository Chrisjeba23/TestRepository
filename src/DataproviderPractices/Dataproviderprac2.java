package DataproviderPractices;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class Dataproviderprac2 {

	WebDriver driver;
	String Actualtitle,Expectedtitle;


	@Test(dataProvider = "Login")
	public void f(String un, String pwd) {

		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
		
		Actualtitle=driver.getTitle();
		
		Assert.assertEquals(Actualtitle, Expectedtitle);


	}
	@BeforeMethod
	public void beforeMethod() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterMethod
	public void afterMethod() throws IOException {

		Actualtitle=driver.getTitle();
		Expectedtitle="Logged In Successfully | Practice Test Automation";

		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Login is passed");

			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("D:\\Loginsuccess.jpeg"));


		}
		else {
			System.out.println("Login is failed");

			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("D:\\Loginfailed.jpeg"));


		}
	}


	@DataProvider
	public Object[][] Login() {
		return new Object[][] {
			new Object[] { "Christopher", "Christo@23" },
			new Object[] { "Samuel", "sam@123" },
			new Object[] { "student", "Password123" },
			new Object[] { "David", "david@123" },
		};
	}


	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
