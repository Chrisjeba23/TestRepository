package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		
		Actions act=new Actions(driver);
		
		WebElement obj=  driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[2]/a"));
		
		act.moveToElement(obj).build().perform();

	}

}
