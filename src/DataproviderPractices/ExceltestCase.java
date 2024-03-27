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

public class ExceltestCase {

	String fpath="D:\\Excelpractice\\Exceltwo.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	FileOutputStream fos;

	XSSFRow row;
	XSSFCell cell;
	int i,j,index=1;
	WebDriver driver;
	String Actualtitle,Expectedtitle;


	@Test(dataProvider = "Login")
	public void f(String un, String ps,String rs) {

		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(ps);
		driver.findElement(By.id("submit")).sendKeys(rs);	

	}


	@AfterMethod
	public void afterMethod() {

		Actualtitle=driver.getTitle();
		Expectedtitle="Logged In Successfully | Practice Test Automation";

		row=sheet.getRow(index);
		cell=row.getCell(2);

		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Login is passed");
			cell.setCellValue("Pass");
		}
		else {
			System.out.println("Login is failed");
			cell.setCellValue("Fail");
		}

		index++;


	}


	@DataProvider
	public Object[][] Login() {

		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] logindata=new String[rows-1][cells];

		for(i=0;i<rows;i++)
		{
			row=sheet.getRow(i+1);

			for(j=0;j<cells;j++)
			{
				cell.getRow().getCell(j);
				logindata[i][j]=  cell.getStringCellValue();
			}	

		}
		return logindata;
	}

	@BeforeTest
	public void beforeTest() throws IOException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Exceltwo");

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
		fis.close();
		

		driver.close();
	}

}
