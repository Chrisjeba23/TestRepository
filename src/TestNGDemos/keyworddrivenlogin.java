package TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class keyworddrivenlogin {

	WebDriver driver;
	String fpath="E:\\ChristopherSeleniumDemo\\MyAutomationproject\\src\\TestNGDemos\\Keyworddrivernfile";
	File file;
	FileInputStream fis;
	Properties prop; 



	@Test
	public void Login() {


		driver.findElement(By.xpath(prop.getProperty("usernamefieldxpath"))).sendKeys("Veera");
		driver.findElement(By.xpath(prop.getProperty("passwordfieldxpath"))).sendKeys("veera123");
		driver.findElement(By.xpath(prop.getProperty("Loginbutonxpath"))).click();





	}
	@AfterMethod
	public void afterMethod() {


		System.out.println(driver.findElement(By.id(prop.getProperty("Errormessage"))).getText());


	}

	@BeforeTest
	public void beforeTest() throws IOException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
