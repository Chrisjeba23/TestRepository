package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataproviderprac {
	
	
	WebDriver driver;
	String Acttit,Exptit;
	
	
	
	@Test(dataProvider = "Logindata")
	public void Login(String un, String pwd) {
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(un);
		
		
		
	}

	@DataProvider
	public Object[][] Logindata() {
		return new Object[][] {
			new Object[] { "Christo", "Chrrit" },
			new Object[] { "student", "Password123" },
			new Object[] { "Johnny", "Johnny123" },
			new Object[] { "Vishnu", "vishnu123" },
		
		};
	}
	@BeforeTest
	public void beforeTest() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	

	@AfterTest
	public void afterTest() {
		
		Acttit=driver.getTitle();
		Exptit="Logged In Successfully | Practice Test Automation";
		
		if(Acttit.equals(Exptit))
		{
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login failed");
		}
		
		
		
	}

}
