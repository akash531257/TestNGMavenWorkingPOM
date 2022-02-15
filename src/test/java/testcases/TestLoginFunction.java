package testcases;

import org.testng.annotations.Test;

import data.DataFile;
import data.DataProviderFile;

import pages.PageLogin;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestLoginFunction {
	
	PageLogin pg=new PageLogin(); 
	DataFile df=new DataFile();
 
  @BeforeMethod
  public void beforeMethod() {
	  pg.openBrowser();
	  pg.opnLoginPage();
	  
  }
  @AfterMethod
  public void afterMethod() {
	  pg.closeBrowser();
  }
  
  @Test
  public void InvalidLogintest() throws InterruptedException{
	  pg.invalidLogin(df.wrongEmail,df.wrongPassword);
	 String actual= pg.readError();
	 System.out.println(actual);
	 Assert.assertEquals(df.ExpectedError,actual);
  }
//  @DataProvider
//  public Iterator<Object[]> dataprov() {
//	  ArrayList<Object[]> testdata=DataProviderFile.testdata();
//	  return testdata.iterator();
//  }
  
  
  

}
