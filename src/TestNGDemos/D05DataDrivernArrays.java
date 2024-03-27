package TestNGDemos;

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

public class D05DataDrivernArrays {

	WebDriver driver;
	String Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String Actualurl;

	@Test(dataProvider = "getLoginData")
	public void LogintoHRM(String un,String pwd) {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(Actualurl, Expectedurl);
		

	}



	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {

			new Object[] { "admin", "admin123" },
			new Object[] { "kavya", "kavya123"},
			new Object[] {"pratyush","pratyush123"},
			new Object[] { "admin", "admin123" },

		};
	}
	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

	@AfterMethod
	public void afterMethod() {
		if(Actualurl.equals(Expectedurl))
		{
			System.out.println("Login Successful");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		}
		else {
			System.out.println("Invalid Credentials-->Login not happened");
		}
	}

}
