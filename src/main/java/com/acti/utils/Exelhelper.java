package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelhelper {
XSSFWorkbook excel;
	
	public Exelhelper()
	{
		try{
			File src = new File("C:\\Rehma workspace\\Selenium_Automation\\Testdata");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook excel = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("excel failed to upload"+ e.getMessage());
			
		}
	}
	
	//get the count of active rows
	public int getrowcount(int sheetnum)
	{
		return excel.getSheetAt(sheetnum).getLastRowNum()+1;
		}
		//get the values from the cell
	public String getcelldata(int sheetnum,int row,int col)
	{
		return excel.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
	}
}


