package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://echoecho.com/htmlforms09.htm");
		/*
		 * driver.get("https://echoecho.com/");
		 * 
		 * WebElement tutoriallink=driver.findElement(By.linkText("Tutorials"));
		 * tutoriallink.click();
		 * 
		 * WebElement htmllink=driver.findElement(By.linkText("HTML"));
		 * htmllink.click();
		 * 
		 * WebElement htmlforms=driver.findElement(By.linkText("HTML FORMS"));
		 * htmlforms.click();
		 * 
		 * WebElement Checkboxmenu=driver.findElement(By.xpath(
		 * "/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[10]/td/a"
		 * )); Checkboxmenu.click();
		 * 
		 * WebElement milk=driver.findElement(By.name("option1")) ;
		 * 
		 * if(milk.isSelected() == false) {
		 * 
		 * milk.click(); System.out.println("Milk checkbox is now selected"); } else {
		 * System.out.println("The Milk checkbox is already selected"); }
		 * 
		 * WebElement butter=driver.findElement(By.name("option2")) ;
		 * 
		 * if(butter.isSelected() == false) {
		 * 
		 * butter.click(); System.out.println("Butter checkbox is now selected"); } else
		 * { System.out.println("The Butter checkbox is already selected"); }
		 * 
		 * WebElement cheese=driver.findElement(By.name("option3")) ;
		 * 
		 * if(cheese.isSelected() == false) {
		 * 
		 * cheese.click(); System.out.println("cheese checkbox is now selected"); } else
		 * { System.out.println("The cheese checkbox is already selected"); }
		 * 
		 * driver.close();
		 */

		List<WebElement> Checkboxes=driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		for(WebElement c:Checkboxes)
		{
			System.out.println("before");
			System.out.println("Selected:" +c.isSelected());
			System.out.println("Displayed:" +c.isDisplayed());
			System.out.println("Enabled:" +c.isEnabled());

			if(!c.isSelected())
			
				c.click();
			

			System.out.println("\nAfter");
			System.out.println("Selected:" +c.isSelected());
			System.out.println("Displayed:" +c.isDisplayed());
			System.out.println("Enabled" +c.isEnabled());
			







		}






	}








}
