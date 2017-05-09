package com.frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
public class Environmentsetting1
{

	public static String browser;
	public static String chromedriverpath;
	Scanner sc;
	static HashMap <String,String> h=new HashMap<String,String>();
	

	public  void loadscanner()
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
			setdemilter(scstring);
			
			}
			
       sc.close();
   	

	}
	
	
	public void setdemilter(String scstr)
	{
		Scanner sc=new Scanner(scstr);
		Scanner sc1=sc.useDelimiter("=");
		
		while (sc1.hasNext())
		{
			String a1=sc1.next();
			String b1=sc1.next();
			h.put(a1,b1);
			
		}
	}
	
	public static String getBrowser() {
		return h.get("browser");
	}

	public static String getChromedriverpath() {
		return chromedriverpath;
	}

	public static void main(String[] args) {
		
		
		Environmentsetting1 es=new Environmentsetting1();
		es.loadscanner();
        
        
	}

}
