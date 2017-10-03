package com.csp.system;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.csp.config.DriverFactory;
import com.pangaea.ui.LoginPage;
import com.pangaea.ui.ShowAllTabs;
import com.pangaea.util.GetData;


public class Firstclass {
	
	
	
		WebDriver driver=DriverFactory.getdriverInstance();
		LoginPage login = new LoginPage(driver);
		ShowAllTabs sat=new ShowAllTabs(driver);
		
		String un= GetData.fromExcel("Test1", "Sheet1",1, 0);
		String pwd=GetData.fromExcel("Test1","Sheet1",1, 1);
		
		
	@Test
	public void TC001()
	
	{
		//Invalid login to verify Error message
		login.getUserNameTextBox().sendKeys("Test");
		login.getPasswordTextBox().sendKeys(pwd);
		Assert.assertTrue(login.getLoginButton().isDisplayed(),"Button is not displayed");
		login.getLoginButton().click();
		String actualError=driver.findElement(By.xpath("//div[contains(text(),'Please check')]")).getText();
		String expectedError="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualError, expectedError);
		System.out.println("Invalid login verified");
		
		//Verify forgot Password Page
		login.getForgotPasswordLink().click();
		String actualtitleFP=driver.getTitle();
		String expectedtitleFP="Forgot Your Password | Salesforce";
		Assert.assertEquals(actualtitleFP,expectedtitleFP);
		System.out.println("Forgot password page is displayed");
		
		
		
		
		//Valid Login 
		driver.navigate().back();
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeSelected(login.getUserNameTextBox()));
		login.getUserNameTextBox().sendKeys(un);
		login.getPasswordTextBox().sendKeys(pwd);
		Assert.assertTrue(login.getLoginButton().isDisplayed(),"Button is not displayed");
		login.getLoginButton().click();
		String actualTitle=driver.getTitle();
		String expectedTitle= "Salesforce - Performance Edition";
		Assert.assertEquals(actualTitle, expectedTitle,"Title does not match");
		System.out.println("Valid login verified");
		}
	
	
	
	
		
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}

}