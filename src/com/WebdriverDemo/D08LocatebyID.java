package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocatebyID {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailidfield=driver.findElement(By.id("email"));
		emailidfield.sendKeys("test@gmail.com");
		
		WebElement Passwordfield=driver.findElement(By.id("pass"));
		Passwordfield.sendKeys("12345678");
		
		WebElement Loginbuttonn=driver.findElement(By.id("u_0_5_pa"));
		Loginbuttonn.click();

	}

}
