package com.WebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();  
		driver.get("https://www.meesho.com/"); 

		String PageTitle=driver.getTitle();
		String ExpectedTitle="Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		System.out.println("The page title is:" +PageTitle);

		if(ExpectedTitle.equals(PageTitle)) {

			System.out.println("Meesho Website launch is successful");

		}
		else {
			System.out.println("Website launch failed");
		}

		if(PageTitle.contains("Meesho"))
		{
			System.out.println("yes the Title contains the word Meesho");
		}
		else {
			System.out.println("the Website title does not contains Meesho");
		}

	}

}
