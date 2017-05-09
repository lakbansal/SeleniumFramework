package com.frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ScannerSearch {
static Scanner sc;
static int z=0;
	public static  void loadscanner() throws FileNotFoundException
	{
		String scstring;
	
		
		File f=new File("./config/config.txt");
        
        	try {
				sc = new Scanner(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		while(sc.hasNext())
			{
			scstring=sc.next();
			search(scstring);
					}
			sc.close();
   	}
	
	public static void search(String scstr)
	{
        z = z+1;
	    String SearchString="google";
		String Result="";
		Scanner sc=new Scanner(scstr);
		Result=sc.findInLine(SearchString);
	    
		if ( Result!=null)
		{
			System.out.println(Result+" found at line "+z);
		}
				}

public static void main(String[] args) throws FileNotFoundException {
	ScannerSearch.loadscanner();
}	
}
