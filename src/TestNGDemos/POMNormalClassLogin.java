package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMNormalClassLogin {
	
	WebDriver driver;
	
	public POMNormalClassLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Usernamefield()
	{
		driver.findElement(By.id("username")).sendKeys("student");;
	}
	
	public void Passwordfield()
	{
		driver.findElement(By.id("password")).sendKeys("Password123");;
	}
	
	public void Loginbutton()
	{
		driver.findElement(By.id("submit")).click();;
	}
	
	
	
	
	
	
	

}
