package DataproviderPractices;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class WritedatausingExcel {

	String fpath="D:\\WriteintoExcelpractice\\Excelone.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	



	@Test
	public void Writedata() {
		
		row=sheet.createRow(0);
		
		cell=row.createCell(0);
		cell.setCellValue("USername");
		cell=row.createCell(1);
		cell.setCellValue("Password");
		cell=row.createCell(2);
		cell.setCellValue("Result");
		
		row=sheet.createRow(1);
		
		
		cell=row.createCell(0);
		cell.setCellValue("student");
		cell=row.createCell(1);
		cell.setCellValue("Password123");
		cell=row.createCell(2);
		cell.setCellValue("Pass");
		
		
		
		
		


	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		file=new File(fpath);
		fos=new FileOutputStream(file);
		wb=new XSSFWorkbook();
		sheet=wb.createSheet();



	}

	@AfterTest
	public void afterTest() throws IOException {
		
		wb.write(fos);
		fos.close();
		wb.close();
	}

}
