package DatadrivenusingExcel;

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

public class WritetoExcelPractice {

	String fpath="D:\\WritetheFileloginpractice.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index;

	@Test
	public void f() {

		row=sheet.createRow(index);

		cell=row.createCell(0);
		cell.setCellValue("Username");
		cell=row.createCell(1);
		cell.setCellValue("Password");
		cell=row.createCell(2);
		cell.setCellValue("Result");
		
		row=sheet.createRow(index+1);

		cell=row.createCell(0);
		cell.setCellValue("Username");
		cell=row.createCell(1);
		cell.setCellValue("Password");
		cell=row.createCell(2);
		cell.setCellValue("Result");
		
		row=sheet.createRow(index+2);
		
		cell=row.createCell(0);
		cell.setCellValue("Username");
		cell=row.createCell(1);
		cell.setCellValue("Password");
		cell=row.createCell(2);
		cell.setCellValue("Result");

		index++;







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
		wb.close();
		fos.close();
	}

}
