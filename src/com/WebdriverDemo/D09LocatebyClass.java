package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocatebyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement GoogleSearchfield=driver.findElement(By.className("gLFyf"));
		GoogleSearchfield.sendKeys("Tom and Jerry images");
		GoogleSearchfield.sendKeys(Keys.ENTER);
		

	}

}
