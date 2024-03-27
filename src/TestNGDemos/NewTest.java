package TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	POMNormalClassLogin p;






	@Test
	public void Login() {
		
		p.Usernamefield();
		p.Passwordfield();
		p.Loginbutton();
	
	}
	

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		p=new POMNormalClassLogin(driver);


	}

	@AfterTest
	public void afterTest() {
		
		driver.close();
	}

}
