package WebdriverPractice01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/buttons");
		
		Actions action=new Actions(driver);
		
		WebElement Rightclickbut=driver.findElement(By.id("rightClickBtn"));
		action.moveToElement(Rightclickbut).contextClick().perform();

	}

}
