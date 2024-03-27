package com.testNgAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationform_Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor a=(JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(0,550)");

		WebElement Firstnamefield=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		Firstnamefield.sendKeys("TestFullname");

		WebElement Lastnamefield=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		Lastnamefield.sendKeys("TestLastname");

		WebElement TestAddressfield=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		TestAddressfield.sendKeys("TestAdress,City,State");

		WebElement Emailidfield=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		Emailidfield.sendKeys("Test@gmail.com");

		WebElement Phonenofield=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		Phonenofield.sendKeys("9876543210");

		WebElement maleGenderradiobutton=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));

		if(!maleGenderradiobutton.isSelected())
		{
			maleGenderradiobutton.click();
		}

		WebElement CricketHobbiescheckboxes=driver.findElement(By.id("checkbox1"));

		if(!CricketHobbiescheckboxes.isSelected())
		{
			CricketHobbiescheckboxes.click();
		}

		//Thread.sleep(5000);

		WebElement MoviesHobbiescheckboxes=driver.findElement(By.id("checkbox2"));

		if(!MoviesHobbiescheckboxes.isSelected())
		{
			MoviesHobbiescheckboxes.click();
		}	

		WebElement Languagefield=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		Languagefield.click();

		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[25]/a")));

		new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]"))).selectByVisibleText("HTML");

		WebElement Selectcountrydropdown=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		Selectcountrydropdown.click();
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[11]")));
		
		
		



	}

}
