package DataproviderPractices;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestcaseExelsheet {

	String fpath="D:\\ExcelQ\\Login Dataone.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i,j,index=1;


	WebDriver driver;
	String Acturl,Expurl;


	@Test(dataProvider = "Login")
	public void f(String un, String pwd,String rs) {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();


	}
	@AfterMethod
	public void afterMethod() {

		Acturl=driver.getCurrentUrl();
		Expurl="https://practicetestautomation.com/logged-in-successfully/";
		

		row=sheet.getRow(index);
		cell=row.getCell(2);

		if(Acturl.equals(Expurl))
		{
			System.out.println("Login happened");
			cell.setCellValue("Pass");
			driver.findElement(By.partialLinkText("Log")).click();

		}
		else
		{
			System.out.println("Login Failed");
			cell.setCellValue("Fail");
		}

		index++;

	}


	@DataProvider
	public Object[][] Login() {


		int r=sheet.getPhysicalNumberOfRows();
		int c=sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] logindata= new String[r-1][c];

		for(i=0;i<r-1;i++)
		{
			row=sheet.getRow(i+1);
			for(j=0;j<c;j++)
			{
				cell=row.getCell(j);
				logindata[i][j]=cell.getStringCellValue();
			}

		}
		return logindata;
	}

	@BeforeTest
	public void beforeTest() throws IOException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");

		fos=new FileOutputStream(file);

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");





	}

	@AfterTest
	public void afterTest() throws IOException {

		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
		driver.close();

	}

}
