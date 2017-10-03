package com.csp.config;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverFactory {

	public static WebDriver getdriverInstance() {
		
		WebDriver driver =null;
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priyadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://test.salesforce.com/");
		
       return driver;
	}

}