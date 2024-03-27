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

public class ReadData {

	String fpath= "D:\\Login Data.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;


	@Test
	public void readdata() {

		//row=sh.getRow(0);

		//cell=row.getCell(0);
		//String data=cell.getStringCellValue();
		//System.out.println(data);

		int rows=sh.getPhysicalNumberOfRows();
		int cells=sh.getRow(0).getPhysicalNumberOfCells();



		for(int i=0;i<rows;i++)
		{
			row=sh.getRow(i);

			for(int j=0;j<cells;j++)
			{
				cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}




	}
	@BeforeTest
	public void beforeTest() throws IOException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet("Login Data");



	}

	@AfterTest	
	public void afterTest() throws IOException {

		wb.close();
		fis.close();


	}

}
