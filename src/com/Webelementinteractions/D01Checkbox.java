package com.Webelementinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		WebElement checkbox=driver.findElement(By.cssSelector("input[name^='chk_alte']"));
		
		System.out.println("Selected is:" +checkbox.isSelected());
		
		if(checkbox.isSelected() == false)
		{
			checkbox.click();
			System.out.println("The Checkbox is now checked");
		}
		
		if(checkbox.isDisplayed() == true)
		{
			System.out.println("The Checkbox is Displayed");
		}
		
		
		driver.close();

	}

}
