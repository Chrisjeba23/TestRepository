package com.WebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06getpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gets u rendered html of the webpage
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String pagesource=driver.getPageSource();
		System.out.println("Page source is:" +pagesource);

	}

}
