package DatadrivenusingExcel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class Dataprovider {


	String fpath="D:\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow rw;
	XSSFCell cl;
	int index=0;


	@Test(dataProvider = "getLoginDetails")
	public void f(String un, String pw,String rs) {

		rw=sh.createRow(index);

		cl=rw.createCell(0);
		cl.setCellValue(un);

		cl=rw.createCell(1);
		cl.setCellValue(pw);

		cl=rw.createCell(2);
		cl.setCellValue(rs);

		index++;

	}

	@DataProvider
	public Object[][] getLoginDetails() {
		return new Object[][] {
			new Object[] { "Username", "Password","Result" },
			new Object[] { "admin", "admin123","Not Run" },
			new Object[] { "Christo", "chris123","Not Run" },
			new Object[] { "samuel", "sam123","Not Run" },
			new Object[] { "admin", "admin123","Not Run" },
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		file=new File(fpath);
		fos=new FileOutputStream(file);
		wb=new XSSFWorkbook();
		sh=wb.createSheet("Login Data");



	}

	@AfterTest
	public void afterTest() throws IOException {

		wb.write(fos);
		wb.close();
		fos.close();
	}

}
