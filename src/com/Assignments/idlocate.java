package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement usernamefield=driver.findElement(By.id("txtCustomerID"));
		usernamefield.sendKeys("Christopher");

		WebElement Passwordfield=driver.findElement(By.id("txtPassword"));
		Passwordfield.sendKeys("12345678");
		
		WebElement Loginbutton=driver.findElement(By.id("Butsub"));
		Loginbutton.click();
		
	    String Actualurl=driver.getCurrentUrl();
	    
	    String Expectedurl="https://www.echotrak.com/Login.aspx?ReturnUrl=%2f";
	    
	    if(Actualurl.equals(Expectedurl))
	    {
	    	System.out.println("Wrong credentials-->Login does not happened");
	    }
	    else 
	    {
	    	System.out.println("Valid credentials-->Login has happened ");
	    	
	    }
	    
	    driver.close();
	    
	    
		
	
		
	}

}
