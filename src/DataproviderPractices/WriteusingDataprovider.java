package DataproviderPractices;

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

public class WriteusingDataprovider {

	String fpath="D:\\WriteintoExcelpractice\\Exceltwo.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index=0;




	@Test(dataProvider = "LoginD")
	public void f(String un, String pwd,String rs) {

		row=sheet.createRow(index);

		cell=row.createCell(0);
		cell.setCellValue(un);
		cell=row.createCell(1);
		cell.setCellValue(pwd);
		cell=row.createCell(2);
		cell.setCellValue(rs);

		index++;



	}

	@DataProvider
	public Object[][] LoginD() {
		return new Object[][] {
			new Object[] { "Username", "Password","Result"},
			new Object[] { "Christopher", "Christo@23","Not Run" },
			new Object[] { "student", "Password123","Not Run" },
			new Object[] { "Arun", "Arun@23","Not Run" },
		};
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
