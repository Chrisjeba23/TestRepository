package SampleCapstoneproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_AutomobileGold {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/index.php#");  
		//Launch Website

		WebElement Automobilemenu=driver.findElement(By.id("nav_automobile"));
		Automobilemenu.click();   //Click Automobile menu

		System.out.println("Enter Vehicle Data 7");

		new Select(driver.findElement(By.xpath("//*[@id=\"make\"]"))).selectByVisibleText("Honda");
		//Select Make from Make Dropdown

		driver.findElement(By.xpath("//*[@id=\"engineperformance\"]")).sendKeys("1260");
		//Enter Engine Performance[kW]

		driver.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]")).sendKeys("03/26/2024");
		//Enter Manufacture date

		new Select(driver.findElement(By.xpath("//*[@id=\"numberofseats\"]"))).selectByValue("3");
		//Select Number of Seats

		new Select(driver.findElement(By.xpath("//*[@id=\"fuel\"]"))).selectByVisibleText("Petrol");
		//Select Fuel Type

		driver.findElement(By.xpath("//*[@id=\"listprice\"]")).sendKeys("10000");
		//Enter List price $

		driver.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]")).sendKeys("TN38BW1577");
		//Enter License Plate number

		driver.findElement(By.xpath("//*[@id=\"annualmileage\"]")).sendKeys("1000");
		//Enter Annual Mileage

		driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();
		//Click Next button

		//----------------------------------------------------------------------------//


		System.out.println("Enter insurant Data");

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Christopher");
		//Enter First name

		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("RS");
		//Enter Last name

		driver.findElement(By.xpath("//*[@id=\"birthdate\"]")).sendKeys("05/23/1997");
		//Enter DOB

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		//Select gender

		driver.findElement(By.xpath("//*[@id=\"streetaddress\"]")).sendKeys("test Street Address");
		//Enter Street Address

		WebElement Countrydropdown=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select s=new Select(Countrydropdown);
		s.selectByVisibleText("India");
		//Select the Country from Dropdown

		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("641030");
		//Enter Zipcode

		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Coimbatore");
		//Enter City

		WebElement Occupationdropdown=driver.findElement(By.xpath("//*[@id=\"occupation\"]"));
		Select ocp=new Select(Occupationdropdown);
		ocp.selectByValue("Employee");

		//Select Occupation from Dropdown

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")).click();
		//Select Hobbies

		driver.findElement(By.xpath("//*[@id=\"website\"]")).sendKeys("TestWebsite.com");
		//Provide Website

		driver.findElement(By.xpath("//*[@id=\"open\"]")).click();

		Robot rbt=new Robot();
		//rbt.keyPress(KeyEvent.VK_TAB);

		for(int i=1;i<=10;i++)
		{
			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);

		}

		for(int j=1;j<=3;j++)
		{
			rbt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}

		rbt.keyPress(KeyEvent.VK_ENTER);


		driver.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]")).click();


		//----------------------------------------------------------------------------//


		System.out.println("Enter Product Data");

		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys("05/26/2024");
		//Enter Start Date

		new Select(driver.findElement(By.xpath("//*[@id=\"insurancesum\"]"))).selectByValue("5000000");
		//Select Insurance Sum($)

		new Select(driver.findElement(By.xpath("//*[@id=\"meritrating\"]"))).selectByValue("Bonus 3");
		//Select Merit rating

		new Select(driver.findElement(By.xpath("//*[@id=\"damageinsurance\"]"))).selectByValue("Full Coverage");
		//Select Damage Insurance

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
		//Select optional products

		new Select(driver.findElement(By.xpath("//*[@id=\"courtesycar\"]"))).selectByValue("Yes");
		//Select Courtesy car

		driver.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]")).click();
		//Click Next button


		//-------------------------------------------------------------------------------//

		System.out.println("Select Price Option");

		WebElement Goldplan=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/thead/tr/th[3]"));
		String G= Goldplan.getText();
		System.out.println("The txt of the Gold plan is:" +G);

		if(G.equals(Goldplan.getText()))
		{
			System.out.println("Pass--The plan is Gold");
		}

		else
		{
			System.out.println("Fail--The plan is not Gold");
		}

		WebElement Goldpriceperyear=driver.findElement(By.xpath("//*[@id=\"selectgold_price\"]"));
		String GPY=Goldpriceperyear.getText();
		System.out.println("The Text of the Price per year is:" +GPY);

		if(GPY.equals(Goldpriceperyear.getText()))
		{
			System.out.println("Pass-The Price per year of Gold is $709");
		}
		else {
			System.out.println("Fail-The price per year of Gold is not $709");
		}

		WebElement GoldOnlineclaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]"));
		String GOC= GoldOnlineclaim.getText();
		System.out.println("The txt of the Online claim is:" +GOC);

		if(GOC.equals(GoldOnlineclaim.getText()))
		{
			System.out.println("Pass-Online claim is Submit");
		}

		else
		{
			System.out.println("Fail-Online Claim is not Submit");
		}

		WebElement GoldClaimdiscount=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]"));
		String GCD= GoldClaimdiscount.getText();
		System.out.println("The txt of the Online claim is:" +GCD);

		if(GCD.equals(GoldClaimdiscount.getText()))
		{
			System.out.println("Pass-Claim Discount is 2");
		}

		else
		{
			System.out.println("Fail-Claim Discount is not 2");
		}

		WebElement GoldWorldwidecover=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]"));
		String GWW= GoldWorldwidecover.getText();
		System.out.println("The txt of the Online claim is:" +GWW);

		if(GWW.equals(GoldWorldwidecover.getText()))
		{
			System.out.println("Pass-WorldWide cover is Limited");
		}

		else
		{
			System.out.println("Fail-World wide cover is not Limited");
		}


		WebElement Goldplanbutton=  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span"));
		//Select Gold Plan button

		if(!Goldplanbutton.isSelected())
		{
			Goldplanbutton.click();
			System.out.println("Pass-The Gold plan button is selected");
		}
		else
		{
			System.out.println("Fail-The Gold plan button is not selected");
		}

		driver.findElement(By.xpath("//*[@id=\"nextsendquote\"]")).click();
		//Click Next button

		//-----------------------------------------------------------------------------//

		System.out.println("Send Quote");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Christo@gmail.com");
		//Enter Email id

		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9876543214");
		//Enter phone number

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Chrisjeba");
		//ENter Username

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Christo@23");
		//Enter Password

		driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]")).sendKeys("Christo@23");
		//Enter Confirm Password

		driver.findElement(By.xpath("//*[@id=\"Comments\"]")).sendKeys("Christo@23");
		//Enter Comments

		driver.findElement(By.xpath("//*[@id=\"sendemail\"]")).click();
		//Click Send button

		WebElement Successmessage=driver.findElement(By.xpath("/html/body/div[4]/h2"));
		String sm= Successmessage.getText();

		System.out.println("The Success message displayed is:" +sm);

		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();

		driver.close();



	}

}
