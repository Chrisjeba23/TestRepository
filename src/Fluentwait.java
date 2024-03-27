import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);

		driver.get("https://www.redbus.in/");

		//Source
		WebElement Source=driver.findElement(By.id("src"));
		Source.sendKeys("Coim");

		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();


		//Fill Source 
		//WebElement Selectsource=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"));
		//Selectsource.click();

		//Destination
		WebElement Destination=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		Destination.sendKeys("Chen");

		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[7]"))).click();


		//Fill Destination
		//WebElement SelectDestination=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text"));
		//SelectDestination.click();



		//Click Date-->Calender appeared Automatically so directly clicking the date
		WebElement date=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span[1]/div[7]/span[1]"));
		date.click();

	}

}
