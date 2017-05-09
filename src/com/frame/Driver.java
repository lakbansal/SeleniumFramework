package com.frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	WebDriver genricdriver;
	//String browser;
	
	public WebDriver loaddriver(String browser) throws IOException
	{
		Environmentsetting.loadProperyies();
		if(browser.equalsIgnoreCase(Environmentsetting.getBrowser())){
		System.setProperty("webdriver.gecko.driver",Environmentsetting.getFirefoxdriverpath());
		genricdriver=new FirefoxDriver();
		genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		genricdriver.manage().window().maximize();
		
		}else if(browser.equalsIgnoreCase(Environmentsetting.getBrowser()))
		{
			System.setProperty("webdriver.chrome.driver",Environmentsetting.getChromedriverpath());
			genricdriver=new ChromeDriver();
			genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			genricdriver.manage().window().maximize();
				
			
		}else
		{
			System.setProperty("webdriver.ie.driver",Environmentsetting.getInternetexplorerdriverpath());
			genricdriver=new InternetExplorerDriver();
			genricdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			genricdriver.manage().window().maximize();
			
			
		}
		return genricdriver;
		
	}
	
	

}
