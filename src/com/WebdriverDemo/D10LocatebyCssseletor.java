package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocatebyCssseletor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement Emailidfield=driver.findElement(By.cssSelector("input[type='text']"));
		Emailidfield.sendKeys("hi");
		
		WebElement Passwordfield=driver.findElement(By.cssSelector("input[type$='word']"));
		Passwordfield.sendKeys("Hello");
		
		
	}

}
