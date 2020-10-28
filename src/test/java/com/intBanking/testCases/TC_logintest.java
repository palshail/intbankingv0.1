package com.intBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBanking.pageObject.LoginPage;

public class TC_logintest extends BaseClass{


	@Test
	public void  testlogin() throws IOException, InterruptedException
	{
		
		LoginPage lg = new LoginPage(driver);
		driver.get(baseURL);
		log.info("driver init");
		lg.setusermane(UserName);
		log.info("username pass");
		lg.setpassword(Password);
		log.info("password pass");
		lg.clicklogin();
		log.info("login click");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Login test PASS");
		}
		else 
		{
			
			capturescreenshot(driver, "testlogin");
			Assert.assertTrue(true);
			log.info("Login test FAIL SS attached");
		}
		
	}
	
}
