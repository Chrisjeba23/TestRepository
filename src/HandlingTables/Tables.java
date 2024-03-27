package HandlingTables;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		for(WebElement r:rows)
		{
			System.out.println(r.getText());
		
		}
		
		List<WebElement> numberofrows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(numberofrows.size());
		
		System.out.println(numberofrows.get(9).getText());
		
		Random rnd=new Random();
		int i=rnd.nextInt(rows.size());
		
		System.out.println(numberofrows.get(i).getText());
		
		
		
		
		
		
		//driver.close();
		

	}

}
