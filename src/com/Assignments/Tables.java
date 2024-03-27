package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> wi= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		
		System.out.println("The number of rows in forst column is:" +wi.size());
		
		System.out.println(wi.get(0).getText());
		
		/*
		 * for(int i=0;i<=236;i++) { System.out.println(wi.get(i).getText()); }
		 */
		
		for(WebElement w:wi)
		{
			System.out.println(w.getText());
		}
		
		
	}

}
