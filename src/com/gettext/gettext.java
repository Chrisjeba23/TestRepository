package com.gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		WebElement usernamefield=driver.findElement(By.id("txtCustomerID"));
		usernamefield.sendKeys("Christopher");

		WebElement Passwordfield=driver.findElement(By.id("txtPassword"));
		Passwordfield.sendKeys("12345678");

		WebElement Loginbutton=driver.findElement(By.id("Butsub"));
		Loginbutton.click();

		
		WebElement Errormessage=driver.findElement(By.id("lblMsg"));
		String emsg=Errormessage.getText();
		String Expectedmessage="Invalid Username/Password";

		System.out.println("The Error message is:" +emsg);

		if(emsg.equals(Expectedmessage))
		{
			System.out.println("test case is passed as error message appeared");

		}

		else {
			System.out.println("test case failed as error message is not appeared");
		}
		
		driver.close();

	}

}
