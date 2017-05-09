package com.frame;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDriver {
	
	Sheet sheet;
    Workbook wb;
	
	public Sheet getsheet(String file , String sheet_ex) throws BiffException, IOException
	{ 
	File f=new File(file);	
	wb=Workbook.getWorkbook(f);
		
		sheet=wb.getSheet(sheet_ex);
		return sheet;
	}
	
	public int getrowcount()
	{
		
		return sheet.getRows();
	}
	
	public int getcolumncount()
	{
		
		return sheet.getColumns();
	}
	
	
	public String getcontent(int col ,int row)
	{
		return sheet.getCell(col, row).getContents().toString();
		
	}
	
	
	public static void main(String[] args) throws BiffException, IOException {
		
		ExcelDriver ex=new ExcelDriver();
		ex.getsheet("./files/TestFile.xls", "Sheet1");
		System.out.println(ex.getcontent(1, 2));
		System.out.println(ex.getcolumncount());
		System.out.println(ex.getrowcount());
	}

}
