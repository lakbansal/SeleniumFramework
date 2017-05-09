package com.frame;

import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;
import java.util.Properties;

public class Environmentsetting {

	public static String browser;
	public static String url;
	
	public static String firefoxdriverpath;
	public static String internetexplorerdriverpath;


	public static String getFirefoxdriverpath() {
		return property.get("firefoxdriverpath").toString();
		}

	public static String getInternetexplorerdriverpath() {
		return property.get("internetexplorerdriverpath").toString();
		}


	public static String chromedriverpath;
	public static Properties property;
	
	public static void loadProperyies() throws IOException

{
		property =new Properties();
		//InputStream in=property.getClass().getClassLoader().getResourceAsStream("config.properties");
		InputStream in=property.getClass().getClassLoader().getSystemResourceAsStream("config.txt");
		property.load(in);
		System.out.println(property.get("Browser"));
        

		
		
	}
	
	public static String getUrl() {
		return property.get("url").toString();
	}
	public static String getBrowser() {
		return property.get("Browser").toString();
	}
	
	public static String getChromedriverpath() {
		return property.get("chromedriverpath").toString();
	}
	
	
	public static void main(String[] args) {
		
		try {
			Environmentsetting.loadProperyies();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
