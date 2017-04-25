package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class ExcelLib {
	
	String filePAth = System.getProperty("user.dir")+
			"//testData//testdata.xlsx";

	public String getExcelData(String sheetName, int rowNum,
			int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(filePAth);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
		return data;
	}
	
	public void setExcelData(String sheetName, int rowNum, 
			int colNum, String data)throws Throwable{
		FileInputStream fis = new FileInputStream(filePAth);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePAth);
		wb.write(fos);
		wb.close();
		
	}

}
