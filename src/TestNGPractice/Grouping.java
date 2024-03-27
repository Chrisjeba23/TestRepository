package TestNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Grouping {

	WebDriver driver;

	@Test(groups= {"Best Sellers"})
	public void test1() {

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();

		WebElement Bs= driver.findElement(By.xpath("//*[@id=\"CardInstancehle9TQSZwQB40UiNuermHQ\"]/div/div/div/div[1]/div[1]/h2"));
		String a=Bs.getText();
		System.out.println(a);


	}

	@Test(groups= {"Mobiles"})
	public void test2() {

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();

		WebElement Banner=driver.findElement(By.xpath("//*[@id=\"sobe_d_b_3_2\"]/a/div/img"));
		Banner.click();

		System.out.println("Banner Clicked");



	}

	@Test(groups= {"Best Sellers"})
	public void test3() {
		WebElement Bs= driver.findElement(By.xpath("//*[@id=\"CardInstancehle9TQSZwQB40UiNuermHQ\"]/div/div/div/div[1]/div[1]/h2"));
		String a=Bs.getText();
		System.out.println(a);
	}

	@Test(groups= {"Mobiles"})
	public void test4() {

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();


		WebElement Banner=driver.findElement(By.xpath("//*[@id=\"sobe_d_b_3_2\"]/a/div/img"));
		Banner.click();

		System.out.println("Banner Clicked");
	}

	@Test(groups= {"Best Sellers"})
	public void test5() {

		WebElement Bs= driver.findElement(By.xpath("//*[@id=\"CardInstancehle9TQSZwQB40UiNuermHQ\"]/div/div/div/div[1]/div[1]/h2"));
		String a=Bs.getText();
		System.out.println(a);
	}


	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		driver.get("https://www.amazon.in/");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {

		driver.close();
	}

}
