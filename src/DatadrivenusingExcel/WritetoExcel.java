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

public class WritetoExcel {

	String fpath="D:\\LDF.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;
	int Index=0;

	@Test
	public void f() {

		row=sh.createRow(Index);

		cell=row.createCell(0);
		cell.setCellValue("Username");

		cell=row.createCell(1);
		cell.setCellValue("Password");

		cell=row.createCell(2);
		cell.setCellValue("Result");
		
		row=sh.createRow(Index+1);
		
		cell=row.createCell(0);
		cell.setCellValue("admin");

		cell=row.createCell(1);
		cell.setCellValue("admin123");

		cell=row.createCell(2);
		cell.setCellValue("Fail");

		Index++;

	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		file=new File(fpath);
		fos=new FileOutputStream(file);
		wb=new XSSFWorkbook();
		sh=wb.createSheet();


	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
