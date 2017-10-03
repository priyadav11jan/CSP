package com.pangaea.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShowAllTabs {
	
	WebDriver driver;
	
	public ShowAllTabs(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getAllTabs()  
	{
	return driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]"));
	}

	 public WebElement getPatients()  
		{
		return driver.findElement(By.xpath("//a[contains(@class,'Custom71Block title')]"));
		}

	public WebElement getPrograms()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'Custom15Block title')]"));
	}
	
	public WebElement getParticipants()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'accountBlock title')]"));
	}
	
	public WebElement getAffiliateProgram()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject Custom50Block title')]"));
	}
	
	public WebElement getCases()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'caseBlock title')]"));
	}
	
	public WebElement getCommHistory()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'Custom83Block title')]"));
	}
	
	public WebElement getFullfilmentProduct()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'Custom32Block title')]"));
	}
	public WebElement getTaskPlan()  
	{
	return driver.findElement(By.xpath("//a[contains(@class,'Custom62Block title')]"));
	}
	public WebElement getRegistration()  
	{
	return driver.findElement(By.xpath("//a[contains(@href,'/a1H/o')]"));
	}
	
	
}
