package com.frame;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;

public class EnvironmentSetting2 {

	public static String browser;
	public static String chromedriverpath;
    static HashMap <String,String> h=new HashMap<String,String>();
    static String  s;
    static String[] var= new String [2];
    
    
    public static void loadbufferreader() throws IOException
    {
		FileReader f=new FileReader("./config/config.txt");
		BufferedReader br=new BufferedReader(f);
		while((s = br.readLine()) != null){
        var = s.split("=");
		System.out.println(var[0]);
		System.out.println(var[1]);
	    h.put(var[0],var[1]);
	}
		br.close();
    	//System.out.println(h.get(browser));
		    }
 public static void main(String[] args) {
		
    	try {
			EnvironmentSetting2.loadbufferreader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
