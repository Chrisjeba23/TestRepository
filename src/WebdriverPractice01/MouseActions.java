package WebdriverPractice01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		
		Actions act=new Actions(driver);
		
		WebElement Aboutus=driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[2]"));
		
		act.moveToElement(Aboutus).perform();
		
		System.out.println(Aboutus.getText());

	}

}
