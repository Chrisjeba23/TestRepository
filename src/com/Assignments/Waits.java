package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://dash.bling-center.com/platform/signIn.html");

		WebElement Forgotpasswordlink=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[5]/button/p"));
		Forgotpasswordlink.click();

		WebElement Emailid=driver.findElement(By.id("email1"));
		Emailid.sendKeys("test@gmail.com");

		WebElement Resetbutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/button[2]"));
		Resetbutton.click();

		WebElement Errormessage= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/p[3]"));
		Thread.sleep(10000);
		String emsg=Errormessage.getText();
		Thread.sleep(10000);
		System.out.println("The error message is:" +emsg);


	}

}
