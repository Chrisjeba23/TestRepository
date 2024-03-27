package com.WebdriverDemo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class D02LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
		
	}

}
