package com.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	WebDriver genricdriver;
	String browser;
	
	public WebDriver loaddriver(String browser)
	{
		
		if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver","E://seleniumgeeko//geckodriver.exe");
		genricdriver=new FirefoxDriver();
		genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		genricdriver.manage().window().maximize();
		
		}else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E://seleniumgeeko//chromedriver.exe");
			genricdriver=new ChromeDriver();
			genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			genricdriver.manage().window().maximize();
				
			
		}else
		{
			System.setProperty("webdriver.ie.driver","E://seleniumgeeko//IEDriverServer.exe");
			genricdriver=new InternetExplorerDriver();
			genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			genricdriver.manage().window().maximize();
			
			
		}
		return genricdriver;
		
	}
	
	

}
