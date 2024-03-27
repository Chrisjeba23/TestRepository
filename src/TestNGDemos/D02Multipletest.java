package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02Multipletest {

	@Test(priority = 0)
	public void Myntra() {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");	  

		System.out.println("The Title of Myntra Launch page is:" 	+driver.getTitle());

		driver.close();

	}

	@Test(priority = 1)
	public void Meesho() {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");	  

		System.out.println("The Title of Meesho Launch page is:" 	+driver.getTitle());

		driver.close();

	}

	@Test(priority =-2)
	public void openZepto() {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zeptonow.com/");	  

		System.out.println("The Title of OpenZepto Launch page is:" 	+driver.getTitle());

		driver.close();

	}









}
