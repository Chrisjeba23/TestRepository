package com.WebdriverDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		
		List<WebElement> menus=driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul"));

		for(WebElement m:menus)
		{
			System.out.println(m.getText());
		}
		
	}

}
