package com.csp.system;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.csp.config.DriverFactory;

import com.pangaea.ui.LoginPage;
import com.pangaea.ui.Program;
import com.pangaea.ui.ShowAllTabs;
import com.pangaea.util.GetData;
import com.pangaea.util.Picklists;

public class TestProgram {
	
	
	
	WebDriver driver =DriverFactory.getdriverInstance();
	
	LoginPage login =new LoginPage(driver);
	ShowAllTabs sat=new ShowAllTabs(driver);
	Program pgm=new Program(driver);
	
	String un= GetData.fromExcel("Test1", "Sheet1",1, 0);
	String pwd=GetData.fromExcel("Test1","Sheet1",1, 1);
	
	
	
	@Test
	public void verifyRequiredFields() throws Exception
	{
		login.getUserNameTextBox().sendKeys(un);
		login.getPasswordTextBox().sendKeys(pwd);
		login.getLoginButton().click();
		//Expand tabs
		sat.getAllTabs().click();
		
		
		//Scroll down to Programs
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scroll(0,1000)");
		
		//Click on programs
		sat.getPrograms().click();
		
		//click new button
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		Thread.sleep(5000);
		//Click save
		pgm.getSaveButton().click();
		
		//Get Error message
		String actual=driver.findElement(By.xpath("//strong[contains(text(),'Error:')]")).getText();
		String expected="Error:";
		
		//capture screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./Screenshots/Error_on_program.png"));
		
		//compare error
		Assert.assertEquals(actual,expected);
		
		
		}
	
	@Test
	public void createProgram() throws InterruptedException
	{
		
		driver.get("https://gso3--deltest3.cs23.my.salesforce.com/a1G/e?&nooverride=1&retURL=/a1G/o");
		
		Thread.sleep(5000);
		
		
		Picklists.selectPicklistByValue(pgm.getAffiliatePicklist(),"UK");
		
		pgm.getPatientLookup().click();
		
	Set<String> handles=driver.getWindowHandles();
	
	Iterator<String> itr=handles.iterator();
	String parent=itr.next();
	String child=itr.next();
	
		
		driver.switchTo().window(child);
		
		driver.switchTo().frame("searchFrame");
		driver.findElement(By.xpath("//input[@id='lksrch'])")).sendKeys("test",Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("resultsFrame");
		driver.findElement(By.xpath("//a[contains(text(),'Test123')]")).click();
		
		
		
		pgm.getAssignedClaudiaLookup().click();
		
		
	}
	
	}
