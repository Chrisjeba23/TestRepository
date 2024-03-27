package DatadrivenframeworkPractice;

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

public class ReadExcel {

	String fpath="D:\\Excelpractice\\Exceltwo.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wbo;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;



	@Test
	public void ReadLogindata() {

		/*
		 * row=sheet.getRow(0);
		 * 
		 * cell=row.getCell(0); System.out.println(cell.getStringCellValue());
		 * cell=row.getCell(1); System.out.println(cell.getStringCellValue());
		 * cell=row.getCell(2); System.out.println(cell.getStringCellValue());
		 */
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cells=sheet.getRow(0).getPhysicalNumberOfCells();
			
		
		for(int i=0;i<rows;i++)
		{
			row=sheet.getRow(i);
			
			for(int j=0;j<cells;j++)
			{
				cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}

	}
	@BeforeTest
	public void beforeTest() throws IOException{

		file=new File(fpath);
		fis=new FileInputStream(file);
		wbo=new XSSFWorkbook(fis);
		sheet=wbo.getSheet("Exceltwo");
		
		
	}

	@AfterTest
	public void afterTest() throws IOException {


		wbo.close();
		fis.close();
	}

}
