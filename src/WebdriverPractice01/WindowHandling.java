package WebdriverPractice01;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		WebElement ad1=driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a"));
		ad1.click();

		WebElement ad2=driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a"));
		ad2.click();

		WebElement Loginnow=driver.findElement(By.xpath("//*[@id=\"loginId\"]/img"));
		Loginnow.click();
		
		Set<String> Windows=driver.getWindowHandles();
		
		Iterator<String> itr=Windows.iterator();
		
		String window1=itr.next();
		String window2=itr.next();
		
		driver.switchTo().window(window2);
		
		driver.findElement(By.id("User_Id")).sendKeys("Hello");
		
		driver.close();
		
		driver.switchTo().window(window1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
