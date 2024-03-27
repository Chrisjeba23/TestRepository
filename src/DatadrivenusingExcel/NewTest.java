package DatadrivenusingExcel;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	String fpath="D:\\Login Data";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i,j;

	@Test(dataProvider = "Logindata")
	public void Logindata(String un, String pwd) {

		System.out.println(un + "\t" + pwd);

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hi");
	}


	@DataProvider
	public Object[][] Logindata() {

		int rows=sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] logindata=new String[rows-1][2];

		for(int i=0;i<rows;i++)
		{
			row=sheet.getRow(i+1);

			for(int j=0;j<2;j++)
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
		sheet=wb.getSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {

		wb.close();
		fis.close();
	}

}
