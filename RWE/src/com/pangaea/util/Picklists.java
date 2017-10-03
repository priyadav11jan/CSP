package com.pangaea.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Picklists {

	public static void selectPicklistByIndex(WebElement element,int index)
	
	{
		Select sct= new Select(element);
		sct.selectByIndex(index);
		
	}
	
	public static void selectPicklistByValue(WebElement element,String value)
	
	{
		Select sct= new Select(element);
		sct.selectByValue(value);
		
	}
	
	public static void selectPicklistByVisibleText(WebElement element,String visibleText)
	
	{
		Select sct= new Select(element);
		sct.selectByVisibleText(visibleText);
		
	}
	
	public static void deselectPicklistByIndex(WebElement element,int index)
	
	{
		Select sct= new Select(element);
		sct.deselectByIndex(index);
		
	}
	public static void deselectAll(WebElement element)
	
	{
		Select sct= new Select(element);
		sct.deselectAll();
		
	}
	
	public static void deselectPicklistByVisibleText(WebElement element,String visibleText)
	
	{
		Select sct= new Select(element);
		sct.deselectByVisibleText(visibleText);
		
	}
	public static void deselectPicklistByValue(WebElement element,String value)
	
	{
		Select sct= new Select(element);
		sct.deselectByValue(value);
		
	}
	public static boolean isMultiple(WebElement element)
	{
		Select sct= new Select(element);
		boolean status= sct.isMultiple();
		
		return status;
		
	}
}
