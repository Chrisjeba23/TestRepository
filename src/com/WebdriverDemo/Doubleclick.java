package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		
		WebElement DOubleclickbutton=driver.findElement(By.id("doubleClickBtn"));
		act.moveToElement(DOubleclickbutton).doubleClick().perform();
		
		String a=DOubleclickbutton.getText();
		
		System.out.println(a);
		
		WebElement Rightclick=driver.findElement(By.id("rightClickBtn"));
		act.moveToElement(Rightclick).contextClick().perform();
		
		String b=Rightclick.getText();
		System.out.println(b);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions act1=new Actions(driver);
		
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		
		act1.dragAndDrop(Source, Target).perform();
		
		System.out.println("Done");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
