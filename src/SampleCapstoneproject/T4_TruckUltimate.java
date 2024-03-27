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

public class T4_TruckUltimate {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/index.php#"); 
		//Launch browser

		driver.findElement(By.xpath("//*[@id=\"nav_truck\"]")).click();
		//Click Truck Main menu

		WebElement Entervehdata=driver.findElement(By.xpath("//*[@id=\"entervehicledata\"]"));
		String Vh=  Entervehdata.getText();
		System.out.println("The First tab name is:" +Vh);
		//ENter Vehicle data tab

		new Select(driver.findElement(By.xpath("//*[@id=\"make\"]"))).selectByValue("Audi");
		//Select make from Dropdown

		driver.findElement(By.xpath("//*[@id=\"engineperformance\"]")).sendKeys("1254");
		//Enter Engine Performance

		driver.findElement(By.xpath("//*[@id=\"dateofmanufacture\"]")).sendKeys("03/26/2024");
		//Enter Date of manufacture

		new Select(driver.findElement(By.xpath("//*[@id=\"numberofseats\"]"))).selectByValue("4");
		//Select the Number of Seats

		new Select(driver.findElement(By.xpath("//*[@id=\"fuel\"]"))).selectByValue("Petrol");
		//Select Fuel type

		driver.findElement(By.xpath("//*[@id=\"payload\"]")).sendKeys("87");
		//Enter payload
		driver.findElement(By.xpath("//*[@id=\"totalweight\"]")).sendKeys("380");
		//Enter Total Weight
		driver.findElement(By.xpath("//*[@id=\"listprice\"]")).sendKeys("20000");
		//Enter List price
		driver.findElement(By.xpath("//*[@id=\"licenseplatenumber\"]")).sendKeys("TN34TR3455");
		//Enter  License Plate number
		driver.findElement(By.xpath("//*[@id=\"annualmileage\"]")).sendKeys("30000");
		//Enter the Annual mileage

		driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();

		//--------------------------------------------------------------------------------//
		//Click Next button

		System.out.println();

		WebElement Insurantdata=driver.findElement(By.xpath("//*[@id=\"enterinsurantdata\"]"));
		String Id=  Insurantdata.getText();
		System.out.println("The second tab is:" +Id);

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Vignesh");
		//Enter First Name

		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("RG");
		//Enter Last name

		driver.findElement(By.xpath("//*[@id=\"birthdate\"]")).sendKeys("08/24/1996");
		//Enter the DOB

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
		//Select Gender

		driver.findElement(By.xpath("//*[@id=\"streetaddress\"]")).sendKeys("Test Street08");
		//Enter the Street

		new Select(	driver.findElement(By.xpath("//*[@id=\"country\"]"))).selectByValue("India");
		//Select the Country

		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("641030");
		//Enter Zipcode

		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Coimbatore");
		//Enter the City

		new Select(	driver.findElement(By.xpath("//*[@id=\"occupation\"]"))).selectByValue("Employee");
		//Select occupation

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();
		//Select Hobbies

		driver.findElement(By.xpath("//*[@id=\"website\"]")).sendKeys("test01website.com");
		//Enter the Website

		driver.findElement(By.xpath("//*[@id=\"open\"]")).click();
		//Upload the Picture

		Robot rbt=new Robot();

		for(int i=1;i<=10;i++)
		{
			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}

		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rbt.keyPress(KeyEvent.VK_ENTER);
		//Picture got uploaded

		driver.findElement(By.xpath("//*[@id=\"nextenterproductdata\"]")).click();
		//Click Next button

		//-------------------------------------------------------------------------------------//

		System.out.println();

		WebElement Enterproddata=driver.findElement(By.xpath("//*[@id=\"enterproductdata\"]"));
		String EPD=  Enterproddata.getText();
		System.out.println("The third tab name is:" +EPD);
		//Read the Third tab name

		driver.findElement(By.xpath("//*[@id=\"startdate\"]")).sendKeys("07/09/2024");
		//Enter the Start Date

		new Select(driver.findElement(By.xpath("//*[@id=\"insurancesum\"]"))).selectByValue("3000000");
		//Select Insurance Sum

		new Select(driver.findElement(By.xpath("//*[@id=\"damageinsurance\"]"))).selectByValue("Full Coverage");
		//Select Damage Insurance

		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span")).click();
		//Select optional Products

		driver.findElement(By.xpath("//*[@id=\"nextselectpriceoption\"]")).click();	
		//Click next Button

		//-----------------------------------------------------------------------------------//

		System.out.println();

		WebElement UltimateSelectpriceopt=  driver.findElement(By.xpath("//*[@id=\"selectpriceoption\"]"));
		String pspo=  UltimateSelectpriceopt.getText();
		System.out.println("The Fourth tab name is:" +pspo);
		//REad the fourth tab name

		WebElement TruckUltimate=  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/thead/tr/th[5]"));
		String ts=  TruckUltimate.getText();
		System.out.println("The Plan name of Truck Ultimate is:" +ts);

		if(ts.equals(TruckUltimate.getText()))
		{
			System.out.println("Pass--The plan name is Ultimate");
		}
		else 
		{
			System.out.println("Fail--The Plan name is not Ultimate");
		}

		WebElement TruckUltimatePriceperyear=  driver.findElement(By.xpath("//*[@id=\"selectultimate_price\"]"));
		String tupy=  TruckUltimatePriceperyear.getText();
		System.out.println("The Price per year of Truck Ultimate is:" +tupy);

		if(tupy.equals(TruckUltimatePriceperyear.getText()))
		{
			System.out.println("Pass-The price per year of Ultimate is $3834");
		}
		else 
		{
			System.out.println("Fail-The Plan name of Ultimate is not $3834");
		}

		WebElement TruckUltimateOnlineclaim=  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]"));
		String tuoc=  TruckUltimateOnlineclaim.getText();
		System.out.println("The Truck Online claim of Truck Ultimate is:" +tuoc);

		if(tuoc.equals(TruckUltimateOnlineclaim.getText()))
		{
			System.out.println("Pass--The Truck Online claim of Ultimate is Submit");
		}
		else 
		{
			System.out.println("Fail--The Truck Online claim of Ultimate is No");
		}

		WebElement TruckUltimateclaimsDiscount=  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]"));
		String tucd=  TruckUltimateclaimsDiscount.getText();
		System.out.println("The Claims Discount of Truck Ultimate is:" +tucd);

		if(tucd.equals(TruckUltimateclaimsDiscount.getText()))
		{
			System.out.println("Pass--The Truck Claims Discount of Ultimate is 10");
		}
		else 
		{
			System.out.println("Fail--The Truck Claims Discount of Ultimate is not 10");
		}

		WebElement TruckUltimateWorldwidecover=  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]"));
		String tuwwc=  TruckUltimateWorldwidecover.getText();
		System.out.println("The World wide cover of Truck Ultimate is:" +tuwwc);

		if(tuwwc.equals(TruckUltimateWorldwidecover.getText()))
		{
			System.out.println("Pass--The Truck World wide cover of Ultimate is UnLimited");
		}
		else 
		{
			System.out.println("Fail--The Truck World wide cover of Ultimate is Yes");
		}


		WebElement TruckUltimatebutton= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));

		if(!TruckUltimatebutton.isSelected())
		{
			TruckUltimatebutton.click();
			System.out.println("Truck Ultimate button is selected");
		}
		else {
			System.out.println("Truck Ultimate button is not selected");
		}


		driver.findElement(By.xpath("//*[@id=\"nextsendquote\"]")).click();
		//CLick Next Button

		
		//---------------------------------------------------------------------------------//

		System.out.println();
		System.out.println("Send Quote");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Vicky65@gmail.com");
		//Enter email id

		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9876545678");
		//Enter Phone number

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("VickyR");
		//Enter USername

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vicky@123");
		//Enter Password

		driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]")).sendKeys("Vicky@123");
		//Enter Confirm Password

		driver.findElement(By.xpath("//*[@id=\"Comments\"]")).sendKeys("Test Comments");
		//Enter the Comments

		driver.findElement(By.xpath("//*[@id=\"sendemail\"]")).click();
		//Click Next button

		WebElement Sucessmessage=driver.findElement(By.xpath("/html/body/div[4]/h2"));
		String smg=Sucessmessage.getText();

		System.out.println("The  success message displayed is:" +smg);

		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();


	}

}
