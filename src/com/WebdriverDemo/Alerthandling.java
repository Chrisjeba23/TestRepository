package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");

		/*
		 * Alert alt;
		 * 
		 * WebElement clickbutton=driver.findElement(By.id("alertButton"));
		 * clickbutton.click();
		 * 
		 * alt=driver.switchTo().alert();
		 * System.out.println("The text in the alert box is:"+alt.getText());
		 * alt.accept();
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()",driver.findElement(By.id(
		 * "timerAlertButton")));
		 * 
		 * //WebElement fivesecalert=driver.findElement(By.id("timerAlertButton"));
		 * //fivesecalert.click();
		 * 
		 * Thread.sleep(6000);
		 * 
		 * System.out.println("The text displayed in 5sec alertbox is:" +alt.getText());
		 * 
		 * alt.accept();
		 * 
		 * JavascriptExecutor js1=(JavascriptExecutor) driver;
		 * js1.executeScript("arguments[0].click()",
		 * driver.findElement(By.id("confirmButton")));
		 * 
		 * //WebElement Confirmbox=driver.findElement(By.id("confirmButton"));
		 * //Confirmbox.click();
		 * 
		 * System.out.println("The text in Confirm box is:" +alt.getText());
		 * 
		 * alt.accept();
		 * 
		 * driver.close();
		 */
		
		Alert alt;
		
		WebElement alertbutton=driver.findElement(By.id("alertButton"));
		alertbutton.click();
		
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		System.out.println("First alert is Working");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",driver.findElement(By.id("timerAlertButton")));
		
		//WebElement fivesecalert=driver.findElement(By.id("timerAlertButton"));
		//fivesecalert.click();
		
		Thread.sleep(6000);
		
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.close();
		
		
		
	
		

	}

}
