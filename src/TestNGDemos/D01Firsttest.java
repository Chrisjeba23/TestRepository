package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01Firsttest {


	@Test
	public void OpenMyntra() {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");	  

		System.out.println("The Title of Myntra Launch page is:" 	+driver.getTitle());

		driver.close();
	}








}
