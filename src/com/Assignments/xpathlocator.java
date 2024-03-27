package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		WebElement Usernamefield=driver.findElement(By.xpath("//*[@id=\"txtCustomerID\"]"));
		Usernamefield.sendKeys("Christopher");

		WebElement Passwordfield=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		Passwordfield.sendKeys("12345678");

		WebElement Loginbutton=driver.findElement(By.xpath("//*[@id=\"Butsub\"]"));
		Loginbutton.click();

		String Errormessage="Invalid Username/Password";
		WebElement validationmsg=driver.findElement(By.xpath("//*[@id=\"lblMsg\"]"));
		String emsg=validationmsg.getText();

		if(Errormessage.equals(emsg))
		{
			System.out.println("Test Case passed as Login failed");
		}
		else {
			System.out.println("Test case failed as Login happened");
		}

		driver.close();



	}

}
