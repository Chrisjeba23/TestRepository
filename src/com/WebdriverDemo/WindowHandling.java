package com.WebdriverDemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");

		/*
		 * WebElement
		 * ad1closebutton=driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a"));
		 * ad1closebutton.click();
		 * 
		 * WebElement
		 * ad2closebutton=driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a"));
		 * ad2closebutton.click();
		 * 
		 * WebElement
		 * Loginbuttobn=driver.findElement(By.xpath("//*[@id=\"loginId\"]/img"));
		 * Loginbuttobn.click();
		 * 
		 * String Titleofpage=driver.getTitle(); System.out.println(Titleofpage);
		 * //Reads the Title of 1st Window
		 * 
		 * 
		 * 
		 * Set<String> Windows=driver.getWindowHandles();
		 * 
		 * Iterator<String> itr=Windows.iterator();
		 * 
		 * String Window1= itr.next(); String Window2= itr.next();
		 * 
		 * driver.switchTo().window(Window2);
		 * 
		 * driver.switchTo().window(Window1);
		 * 
		 * WebElement
		 * Loginbuttobn1=driver.findElement(By.xpath("//*[@id=\"loginId\"]/img"));
		 * Loginbuttobn1.click();
		 * 
		 * String Titleofpage1=driver.getTitle(); System.out.println(Titleofpage1);
		 */

		WebElement ad1=driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a"));
		ad1.click();

		WebElement ad2=driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a"));
		ad2.click();

		WebElement Loginnow=driver.findElement(By.xpath("//*[@id=\"loginId\"]/img"));
		Loginnow.click();

		/*
		 * Set<String> Windows=driver.getWindowHandles();
		 * 
		 * Iterator<String> itr=Windows.iterator();
		 * 
		 * String win1=itr.next(); String win2=itr.next();
		 * 
		 * driver.switchTo().window(win2);
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * 
		 * 
		 */


		Set<String> Windows=driver.getWindowHandles();

		Iterator<String> itr=Windows.iterator();

		String window1=itr.next();
		String window2=itr.next();

		driver.switchTo().window(window2);

		driver.findElement(By.id("User_Id")).sendKeys("Hello");









	}

}
