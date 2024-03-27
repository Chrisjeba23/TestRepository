package Uploadfile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadpic {

	public static void main(String[] args) throws AWTException, InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/app.php");

		driver.findElement(By.xpath("//*[@id=\"enterinsurantdata\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"open\"]")).click();

		Robot rb=new Robot();

		for(int i=1;i<=10;i++)
		{
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);

		}
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);

		for(int j=1;j<=14;j++)
		{	
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep		(2000);																					

		}	

		for(int k=1;k<52;k++)
		{
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);

		}












	}

}
