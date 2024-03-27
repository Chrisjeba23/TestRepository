package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMclass {
	
	
	WebDriver driver;
	
	public POMclass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void username()
	{
		
		
		driver.findElement(By.id("username")).sendKeys("student");
		
	}
	

	public void password()
	{
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
	

	public void Loginbutton()
	{
		driver.findElement(By.id("submit")).click();
	}
	

}
