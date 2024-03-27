package HandlingTables;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTablesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		List<WebElement> tablesize= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(tablesize.size());

		System.out.println(tablesize.get(0).getText());

		/*
		 * for(WebElement t:tablesize) { System.out.println(t.getText()); }
		 */




		Random rnd=new Random();
		int i=rnd.nextInt(tablesize.size());
		
		System.out.println(tablesize.get(i).getText());



	}




}
