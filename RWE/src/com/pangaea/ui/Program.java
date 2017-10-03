package com.pangaea.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Program {
	
	WebDriver driver;
	
	public Program(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public WebElement getPatientLookup()
	{
		
		return(driver.findElement(By.xpath("//img[contains(text(),'Patient Lookup')]")));
		
	}
	public WebElement getAffiliatePicklist()
	{
		
		return(driver.findElement(By.id("00N60000002zkij")));
		
	}
	public WebElement getBrandProgramPicklist()
	{
		
		return(driver.findElement(By.id("00N60000002zkis")));
		
	}
	public WebElement getAssignedClaudiaLookup()
	{
		
		return(driver.findElement(By.xpath("//img[contains(text(),'Assigned Claudia Lookup')]")));
		
	}
	public WebElement getSaveButton()
	{
		
		return (driver.findElement(By.xpath("//input[@title='Save'][1]")));
	}
	public WebElement getCancelButton()
	{
		
		return (driver.findElement(By.xpath("//input[@title='Cancel'][1]")));
	}
	
	
}