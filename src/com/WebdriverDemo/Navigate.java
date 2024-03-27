package com.WebdriverDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/gmail/about/");

		driver.navigate().to("https://www.google.com/");

		driver.get("https://www.google.com/gmail/about/");

		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();

	}

}
