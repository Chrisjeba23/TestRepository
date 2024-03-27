package TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D03BeforeAftertest {

	WebDriver driver;
	
	@Test
	public void Amazon() {

		driver.get("https://www.amazon.in/");

		WebElement Signin=driver.findElement(By.linkText("Sign in"));
		Signin.click();

		WebElement Emailfield=driver.findElement(By.id("ap_email"));
		Emailfield.sendKeys("Chrisjeba01@gmail.com");

		WebElement Continuebutton=driver.findElement(By.id("continue"));
		Continuebutton.click();

		WebElement Passwordfield=driver.findElement(By.id("ap_password"));
		Passwordfield.sendKeys("Christo@230594");

		WebElement Signinbutton=driver.findElement(By.id("signInSubmit"));
		Signinbutton.click();

		System.out.println("Test Case 1 passed");


	}

	@Test
	public void amazon2()
	{

		driver.get("https://www.amazon.in/");

		WebElement Signin=driver.findElement(By.linkText("Sign in"));
		Signin.click();

		WebElement Emailfield=driver.findElement(By.id("ap_email"));
		Emailfield.sendKeys("Chrisjeba01@gmail.com");

		WebElement Continuebutton=driver.findElement(By.id("continue"));
		Continuebutton.click();

		WebElement Passwordfield=driver.findElement(By.id("ap_password"));
		Passwordfield.sendKeys("Christo@23");

		WebElement Signinbutton=driver.findElement(By.id("signInSubmit"));
		Signinbutton.click();

		WebElement Errormessage=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div"));
		String emsg=Errormessage.getText();
		System.out.println(emsg);

		System.out.println("test Case 2 passed");


	}

	@BeforeTest
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest
	public void afterTest() {

		System.out.println("After test");
		driver.close();
	}

}
