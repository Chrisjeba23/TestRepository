package com.WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07findelement {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement Emailaddressfield=  driver.findElement(By.name("email"));
		Emailaddressfield.sendKeys("Chrisjeba03@gmail.com");

		WebElement passwordfield=driver.findElement(By.name("pass"));
		passwordfield.sendKeys("Christo@230594");

		WebElement Loginbutton=driver.findElement(By.name("login"));
		Loginbutton.click();

		Thread.sleep(5000);

		String Actualtitle=driver.getTitle();	
		System.out.println("Actual title is:" +Actualtitle);

		String Expectedtitle="(10) Facebook";

		System.out.println("The Expected title is:" +Expectedtitle);

		if(Actualtitle.contains(Expectedtitle))
		{
			System.out.println(("Login Successful" ));
		}
		else {
			System.out.println(("Login not successful" ));
		}
		
		System.out.println("First test case passed");
		
		

		


	}

}
