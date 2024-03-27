package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Methodandtest {

	WebDriver driver;


	@Test
	public void test1() {

		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement Loginbutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Loginbutton.click();

		System.out.println("@Test1");

	}

	@Test
	public void test2() {

		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement Loginbutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Loginbutton.click();

		System.out.println("@Test2");

	}
	@BeforeMethod
	public void beforeMethod() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("@Before Method");

	}

	@AfterMethod
	public void afterMethod() {

		WebElement profileicon=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		profileicon.click();

		WebElement Logoutbutton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
		Logoutbutton.click();

		System.out.println("@After Method");




	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("@Before Test");



	}

	@AfterTest
	public void afterTest() {

		driver.close();
		System.out.println("@After Test");

	}

}
