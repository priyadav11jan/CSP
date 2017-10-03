package com.pangaea.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Patient {
	
	WebDriver driver;
	
	public Patient(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFirstNameTextBox()
	{
		
		return driver.findElement(By.id("00N60000002zkgz"));
	}
	
	public WebElement getLastNameTextBox()
	{
		
		return driver.findElement(By.id("00N60000002zkh4"));
	}
	
	public WebElement getDOBCalenderpopup()
	{
		
		return driver.findElement(By.id("00N60000002zkgy"));
	}
	
	public WebElement getPh1TextBox()
	{
		
		return driver.findElement(By.id("00N60000002zkhY"));
	}
	public WebElement getPh1TypePicklist()
	{
		
		return driver.findElement(By.id("00N60000002zkhS"));
	}
	public WebElement getGenderPicklist()
	{
		
		return driver.findElement(By.id("00N60000002zkh1"));
	}
	
	public WebElement getEmailTextBox()
	{
		
		return driver.findElement(By.id("00N60000002zkhA"));
	}
	public WebElement getSaveButton()
	{
		
		return driver.findElement(By.xpath("//input[@title='Save'][1]"));
	}
	
	
	

}
