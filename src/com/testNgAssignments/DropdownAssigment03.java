package com.testNgAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssigment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement Dropdown= driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

		Select s=new Select(Dropdown);

		System.out.println("The deafult selected option of the Dropdown is:" +s.getFirstSelectedOption().getText());

		List<WebElement> options=s.getOptions();
		System.out.println("The number of options in Dropdown is:" +options.size());

		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		System.out.println("Working to select Options from Dropdown:");

		s.selectByValue("ATG");  
		System.out.println("The select by value from Dropdown is:" +s.getFirstSelectedOption().getText());
		s.selectByIndex(12);
		System.out.println("The select by index from Dropdown is:" +s.getFirstSelectedOption().getText());
		s.selectByVisibleText("India");
		System.out.println("The select by visible text from Dropdown is:"+s.getFirstSelectedOption().getText());
			
	}

}
