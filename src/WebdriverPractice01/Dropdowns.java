package WebdriverPractice01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");


		WebElement Dropdown=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select s=new Select(Dropdown);
		System.out.println("The Default selected option in Dropdown is:" +s.getFirstSelectedOption().getText());

		List<WebElement> Options=  s.getOptions();

		System.out.println("The number of options in dropdown is:" +Options.size());

		System.out.println("The Dropdown options are as follows");

		for(WebElement op:Options)
		{
			System.out.println(op.getText());  
		}

		s.selectByIndex(3);
		System.out.println("The selected option of index is:" +s.getFirstSelectedOption().getText());
		s.selectByValue("BHR");
		System.out.println("The selected option of value is:" +s.getFirstSelectedOption().getText());
		s.selectByVisibleText("India");
		System.out.println("The selected option of visible text is:" +s.getFirstSelectedOption().getText());

		driver.close();



	}

}
