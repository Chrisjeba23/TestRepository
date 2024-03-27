package DatadrivenframeworkPractice;

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

public class WritedataDataprovider {

	String fpath="D:\\Excelpractice\\Exceltwo.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;
	int index;



	@Test(dataProvider = "Logindata")
	public void f(String un, String pwd,String rs) {

		row=sh.createRow(index);

		cell=row.createCell(0);
		cell.setCellValue(un);
		cell=row.createCell(1);
		cell.setCellValue(pwd);
		cell=row.createCell(2);
		cell.setCellValue(rs);

		index++;




	}

	@DataProvider
	public Object[][] Logindata() {

		return new Object[][] {
			new Object[] { "Username", "Password","Result" },
			new Object[] { "student", "Passsword123" ,"Not run"},
			new Object[] { "Pradeep", "Passsword125" ,"Not run"},
			new Object[] { "Fazil", "Passsword1256" ,"Not run"},
		};
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
		fos.close();
		wb.close();


	}

}
