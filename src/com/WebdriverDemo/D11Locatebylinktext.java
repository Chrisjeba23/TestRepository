package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11Locatebylinktext {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com/");
		
		WebElement Gmaillink=driver.findElement(By.linkText("Gmail"));
		Gmaillink.click();
		
		

	}

}
