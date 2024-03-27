package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamelocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		List<WebElement> Links=driver.findElements(By.tagName("div"));
		System.out.println("The number of links are:" +Links.size());

		System.out.println(Links.get(0).getTagName());

		try {
		for(int i=0;i<32;i++)
		{
         System.out.println(Links.get(i).getTagName());
		}}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		for(WebElement l:Links)
		{
			System.out.println(l.getText());
		}



	}

}
