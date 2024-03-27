package DataproviderPractices;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dataprovider {


	WebDriver driver;
	String Acttitle,ExpTitle;



	@Test(dataProvider = "Logindetails")
	public void Login(String un, String pwd) {
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();



	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");


	}



	@DataProvider
	public Object[][] Logindetails() {
		return new Object[][] {
			new Object[] { "Christopher", "Christo@23" },
			new Object[] { "Samuel", "sam@123" },
			new Object[] { "student", "Password123" },
			new Object[] { "David", "david@123" },
		};
	}


	@AfterMethod
	public void afterMethod() throws IOException {
		
		Acttitle=driver.getTitle();
		ExpTitle="Logged In Successfully | Practice Test Automation";
		
		if(Acttitle.equals(ExpTitle))
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

	@AfterTest
	public void afterTest() {
		
		driver.close();
	}

}
