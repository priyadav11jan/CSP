package com.pangaea.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class GetData {

	public static String fromExcel(String fname,String sname,int rindex,int cindex) {
		
		String data= null;
		
		try{
			
		
		File f= new File("C:\\Users\\priyadav\\Desktop\\"+fname+".xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s =wb.getSheet(sname);
		Row r =s.getRow(rindex);
		Cell c=r.getCell(cindex);
		data=c.toString();
		}
		
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		
       return data;
	
	}
	
	public static String fromProperty(String fname,String key)
	{
		String data= null;
		
		try{
		File f= new File("C:\\Users\\priyadav\\Desktop"+fname+".property");
		
		FileInputStream fis= new FileInputStream(f);
		
		Properties prop= new Properties();
		
		prop.load(fis);
		
		data=prop.getProperty(key);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return data;
	}
}
