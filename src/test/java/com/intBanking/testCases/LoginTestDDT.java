package com.intBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.intBanking.pageObject.LoginPage;
import com.intBanking.utilities.XLUtils;


public class LoginTestDDT extends BaseClass {

	
	@Test(dataProvider="LoginData")
	public void LoginTest(String uname, String pswd) throws InterruptedException
	{
		LoginPage lg = new LoginPage(driver); 
		lg.setusermane(uname);
		log.info("Usename set");
		lg.setpassword(pswd);
		log.info("password set");
		lg.clicklogin();
		log.info("Login click");
	
		Thread.sleep(3000);
		
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		log.warn("Login failed");
	}
	else
	{
		Assert.assertTrue(true);
		log.info("Login passed");
		lg.clicklogout();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//close logout alert
		driver.switchTo().defaultContent();
	}
}
	
	private boolean isAlertPresent() {
		try
		{
			driver.switchTo().alert();
			return true;
		}catch (NoAlertPresentException e) {
			return false;
		}
		
	}



	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/intBanking/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}

	
}
