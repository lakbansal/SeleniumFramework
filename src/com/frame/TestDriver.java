package com.frame;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDriver {
	
	public static WebDriver driver;
public static void main(String[] args) throws IOException {
		
		
		Driver driver1=new Driver();
		driver=driver1.loaddriver("firefox");
		driver.get(Environmentsetting.getUrl());
		driver.findElement(By.className(ObjecrRepository.gmaillink)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id(ObjecrRepository.signuplink)).click();
		driver.findElement(By.id(ObjecrRepository.firstname)).sendKeys("lakshya");
		driver.findElement(By.id(ObjecrRepository.lastname)).sendKeys("bansal");
		driver.findElement(By.id(ObjecrRepository.GmailAddress)).sendKeys("lak3108");
		driver.findElement(By.id(ObjecrRepository.Passwd)).sendKeys("lakbansal");
        driver.findElement(By.id(ObjecrRepository.PasswdAgain)).sendKeys("lakbansal");
        driver.findElement(By.id(ObjecrRepository.BirthDay)).sendKeys("31");
		driver.findElement(By.id(ObjecrRepository.BirthYear)).sendKeys("1993");
		driver.findElement(By.id(ObjecrRepository.RecoveryPhoneNumber)).sendKeys("9999999999");
		driver.findElement(By.id(ObjecrRepository.RecoveryEmailAddress)).sendKeys("lakbansal@gmail.com");
        driver.findElement(By.xpath("//div[@class='goog-inline-block goog-flat-menu-button jfk-select']")).click();
		List<WebElement> x=driver.findElements(By.xpath("//div[@class='goog-menuitem']"));	
		for (int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i).getText());
		}
		x.get(7).click();
	    driver.close();
	    
	    Properties p=new Properties();
	    
	    
}

}
