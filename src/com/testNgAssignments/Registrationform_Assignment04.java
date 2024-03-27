package com.testNgAssignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registrationform_Assignment04 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mytestingthoughts.com/Sample/home.html");
		
		WebElement Firstnamefield=driver.findElement(By.name("first_name"));
		Firstnamefield.sendKeys("Test first Name");
		
		WebElement lastnamefield=driver.findElement(By.name("last_name"));
		lastnamefield.sendKeys("Test last Name");
		
		WebElement maleradiobutton=driver.findElement(By.id("inlineRadioMale"));
		
		if(!maleradiobutton.isSelected())
		{
			maleradiobutton.click();
		}
		
		WebElement Dropdown1=driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect2\"]"));
		Select select1=new Select(Dropdown1);
		
		select1.selectByVisibleText("Reading");
		select1.selectByVisibleText("Singing");
		select1.selectByVisibleText("Running");
		
		WebElement Dropdown2=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/select"));
		Select select2=new Select(Dropdown2);
		select2.selectByVisibleText("Department of Engineering");
		
		WebElement Usernamefield=driver.findElement(By.name("user_name"));
		Usernamefield.sendKeys("Test Username");
		
		WebElement Passwordfield=driver.findElement(By.name("user_password"));
		Passwordfield.sendKeys("Password@123");
		
		WebElement ConfirmPasswordfield=driver.findElement(By.name("confirm_password"));
		ConfirmPasswordfield.sendKeys("Password@123");
		
		WebElement Emailfield=driver.findElement(By.name("email"));
		Emailfield.sendKeys("testemail@gmail.com");
		
		WebElement Contactnumberfield=driver.findElement(By.name("contact_no"));
		Contactnumberfield.sendKeys("(415)8439023");
		
		WebElement Additionalinfofield=driver.findElement(By.id("exampleFormControlTextarea1"));
		Additionalinfofield.sendKeys("test Information");
		
		WebElement Submitbutton=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
		Submitbutton.click();
		
		WebElement successmessage=  driver.findElement(By.id("success_message"));
		String sucmsg= successmessage.getText();
		System.out.println("The Success message displayed is:" +sucmsg);
		
		System.out.println("Registration is success");
		
		
		
		

	}

}
