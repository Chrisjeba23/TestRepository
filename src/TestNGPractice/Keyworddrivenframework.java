package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Keyworddrivenframework {

	WebDriver driver;
	String fpath="E:\\ChristopherSeleniumDemo\\MyAutomationproject\\src\\TestNGPractice\\Keyworddrivenfile";
	File f;
	FileInputStream fis;
	Properties prop;




	@Test
	public void f() {


		driver.findElement(By.id(prop.getProperty("usernamefield"))).sendKeys("student");
		driver.findElement(By.id(prop.getProperty("passwordfield"))).sendKeys("Password123");
		driver.findElement(By.id(prop.getProperty("Loginbutton"))).click();






	}
	@BeforeTest
	public void beforeTest() throws IOException {

		f=new File(fpath);
		fis=new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));





	}

	@AfterTest
	public void afterTest() {


		driver.close();
	}

}
