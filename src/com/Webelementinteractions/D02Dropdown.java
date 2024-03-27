package com.Webelementinteractions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D02Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		/*
		 * WebElement Dropdown=driver.findElement(By.xpath(
		 * "/html/body/center/form/div/table[2]/tbody/tr[26]/td[3]/select[1]"));
		 * 
		 * Select s=new Select(Dropdown);
		 * 
		 * System.out.println("Selected Country:"
		 * +s.getFirstSelectedOption().getText()); //returns the selected one
		 * 
		 * List<WebElement> L= s.getOptions();
		 * 
		 * System.out.println("Total COuntries:" +L.size()); //No of Countries
		 * 
		 * for(int i=0;i<=247;i++) { System.out.println(L.get(i).getText()); }
		 * 
		 * 
		 * int i=0; for(WebElement li:L) { System.out.println(i+"." +li.getText());
		 * //get the list of countries i++; }
		 * 
		 * 
		 * s.selectByVisibleText("Canada"); System.out.println("Selected Country:"
		 * +s.getFirstSelectedOption().getText());
		 * 
		 * s.selectByValue("38"); System.out.println("Selected Country:"
		 * +s.getFirstSelectedOption().getText());
		 * 
		 * s.selectByIndex(5); System.out.println("Selected Country:"
		 * +s.getFirstSelectedOption().getText());
		 */

	}

}
