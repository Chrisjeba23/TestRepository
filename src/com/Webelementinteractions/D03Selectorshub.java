package com.Webelementinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D03Selectorshub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
				
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement Source=driver.findElement(By.id("src"));
		Source.sendKeys("Coim");
		
		Thread.sleep(5000);
		
		WebElement Selectsource=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"));
		Selectsource.click();
		
		
		
		
		

	}

}
