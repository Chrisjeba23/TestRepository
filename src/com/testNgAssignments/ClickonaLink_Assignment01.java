package com.testNgAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonaLink_Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		WebElement SigninLink=driver.findElement(By.linkText("Sign in"));
		
		SigninLink.click();
		
		System.out.println("Amazon Signin Link was clicked");
		
		driver.close();
		
	}

}
