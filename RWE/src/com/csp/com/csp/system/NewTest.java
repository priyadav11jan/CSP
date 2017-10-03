package com.csp.com.csp.system;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f1() {
	  
	  System.out.println("test f1 executing");
  }
  
  @Test
  public void f2() {
	  
	  System.out.println("test f2 executing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method executing");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method executing");
	  
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class executing");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class executing");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test executing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test executing");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit executing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit executing");
  }

}
