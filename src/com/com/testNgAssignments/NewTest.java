package com.com.testNgAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class NewTest {

	String fpath="D:\\ReadExcel\\Book1.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;


	@Test(dataProvider = "LogintoOHRM")
	public void Login(String un, String pwd) {
		
		System.out.println(un + "\t" + pwd);
	}

	@DataProvider
	public Object[][] LogintoOHRM() {

		String[][] logindata=new String[5][2];

		for(int i=0;i<5;i++)
		{
			row=sheet.getRow(i);
			for(int j=0;j<2;j++)
			{
				cell=row.getCell(j);
			}


		}
		return logindata;
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {

		file=new File(fpath);
		fis=new FileInputStream(file);
		wb=new XSSFWorkbook();
		sheet=wb.getSheet("Book1");



	}

	@AfterTest
	public void afterTest() throws IOException {
		
		wb.close();
		fis.close();
		
	}

}
