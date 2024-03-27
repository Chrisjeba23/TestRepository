import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
				
		
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		//Source
		WebElement Source=driver.findElement(By.id("src"));
		Source.sendKeys("Coim");
		
		Thread.sleep(5000);
		
		
		//Fill Source 
		WebElement Selectsource=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"));
		Selectsource.click();
		
		//Destination
		WebElement Destination=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		Destination.sendKeys("Chen");
		
		Thread.sleep(5000);
		
		//Fill Destination
		WebElement SelectDestination=driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text"));
		SelectDestination.click();
		
		Thread.sleep(5000);
		
		//Click Date-->Calender appeared Automatically so directly clicking the date
		WebElement date=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/span[1]/div[7]/span[1]"));
		date.click();
		
		
		


	}

}
