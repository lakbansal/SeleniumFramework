package com.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class commonfunctions {
	public enum objectid
	{
		xpath,id,css,name,className;
		}
   	WebDriver driver;
	commonfunctions(WebDriver driver) {
				this.driver=driver;
		}
	public void Click(String objectid , String element)
	{
		switch(objectid.valueOf(objectid))
		{
		case "xpath":
			driver.findElement(By.xpath(element)).click();
			break;
		case "id":
			driver.findElement(By.id(element)).click();
			break;
		case "css" :
			driver.findElement(By.cssSelector(element)).click();
			break;
		case "className" :
			driver.findElement(By.className(element)).click();
			break;
			default :
		     break;
			}}
	public void input(String objectid , String element,String data)
	{
		switch(objectid.valueOf(objectid))
		{
		case "xpath":
			driver.findElement(By.xpath(element)).sendKeys(data);
			break;
		case "id":
			driver.findElement(By.id(element)).sendKeys(data);
			break;
		case "css" :
			driver.findElement(By.cssSelector(element)).sendKeys(data);
			break;
		case "className" :
			driver.findElement(By.className(element)).sendKeys(data);
			break;
			default :
		     break;
			}}}