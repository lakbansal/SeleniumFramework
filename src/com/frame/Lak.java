package com.frame;
import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Lak {

	Sheet sheet;
    Workbook wb;
   

public Sheet getsheet(String file , String sheet_ex) throws BiffException, IOException
	{ 
	File f=new File(file);	
	wb=Workbook.getWorkbook(f);
	
		sheet=wb.getSheet(sheet_ex);
		return sheet;
	}
	
	public  int getrowcount()
	{
		
	  return sheet.getRows();
	}
	
	public  void content(int row)
	{
		int sum=0;
		int[] prices=new int[row];
		
		int[] qty=new int[row];
		 for (int a=1;a<row;a++)
	       {
	    	  prices[a-1]=Integer.parseInt(sheet.getCell(1,a).getContents());
	  	}
		 for (int b=1;b<row;b++)
	       {
	    	  qty[b-1]=Integer.parseInt(sheet.getCell(3,b).getContents());
	  	}
	int[] total=new int[row];
	for (int a=0;a<row-1;a++)
    {
 	  total[a]=prices[a]*qty[a];
      sum=sum+total[a];
  	        }
	System.out.println(sum);
		
	   // return sheet.getCell(col, row).getContents().toString();
		
	}
	

	public static void main(String[] args) throws BiffException, IOException {
		 int row;
		    int col;

		Lak l=new Lak();
		l.getsheet("./files/TestFile.xls", "Sheet1");
		row=l.getrowcount();
	    l.content(row);
	}
}
