package com.WebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13Tagnamelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();  
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//System.out.println(links.get(0).getText());
		//System.out.println(links.get(0).getText());
		
		for(int i=0;i<47;i++)
		{
			System.out.println(links.get(i).getTagName());
		}
		
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}

	}

}
