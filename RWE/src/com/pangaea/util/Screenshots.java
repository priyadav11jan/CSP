package com.pangaea.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Screenshots {
	
	

	public static void captureScreenshots(WebDriver driver, String screenshotName) throws Exception {
		
		try{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./Screenshots/"+screenshotName+".png"));
		
		System.out.println("Screenshot taken ");
		
		}
		
		catch(Exception e)
		
		{
			
			e.printStackTrace();
		}
		
		
		}

	

}
