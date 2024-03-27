package DatadrivenusingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadExcelpractice {

	String fpath="D:\\ReadExcel\\Book1.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	



	@Test
	public void Logindetails() {

		

		for(int i=0;i<5;i++)
		{
			row=sheet.getRow(i);
		}
		for(int j=0;j<3;j++)
		{
			cell=row.getCell(j);
			String data=cell.getStringCellValue();
			System.out.println(data);
		}
		


	}

	@BeforeTest
	public void beforeTest() throws IOException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Book1");



	}

	@AfterTest
	public void afterTest() throws IOException {

		wb.close();
		fis.close();


	}

}
