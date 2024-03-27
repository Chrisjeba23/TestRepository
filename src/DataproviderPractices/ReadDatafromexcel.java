package DataproviderPractices;

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

public class ReadDatafromexcel {

	String fpath="D:\\Excel\\Excel file.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;




	@Test
	public void Login() {
		
		int rows=sht.getPhysicalNumberOfRows();
		int cells=sht.getRow(0).getPhysicalNumberOfCells();


		for(int i=0;i<rows;i++)
		{
			row=sht.getRow(i);

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
		sht=wb.getSheet("Excel file");


	}

	@AfterTest
	public void afterTest() throws IOException {
		
		
		wb.close();
		fis.close();

	}

}
