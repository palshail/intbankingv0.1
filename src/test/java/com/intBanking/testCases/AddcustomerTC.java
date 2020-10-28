package com.intBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBanking.pageObject.Addcustomer;
import com.intBanking.pageObject.LoginPage;

public class AddcustomerTC extends BaseClass {



	@Test
	public void Addcustomermethod() throws InterruptedException, IOException
	{
		LoginPage lg = new LoginPage(driver);
		log.info("driver init");
		lg.setusermane(UserName);
		log.info("username pass");
		lg.setpassword(Password);
		log.info("password pass");
		lg.clicklogin();
		log.info("login click");

		Thread.sleep(4000);
		
		Addcustomer add = new Addcustomer(driver);
		add.Newcxbtn();
		log.info("New cx");
		add.cxname("shailendra");
		log.info("cx name fils");

		add.mfradio("female");
		log.info("Gender fils");

		add.dob("12", "21", "1995");
		log.info("DOD fils");

		add.cxaddress("rto sai baba nagar dahisar");
		log.info("cx adress fils");

		add.cxcity("Mumbai");
		log.info("cx city fils");

		add.cxstate("Maha");
		log.info("cx state fils");

		add.cxname("shailendra");
		log.info("cx name fils");

		add.cxpin("400068");
		log.info("cx pin fils");

		add.cxphone("9167737318");
		log.info("cx Mobile fils");

		String email=randomestring()+"@gmail.com";
		add.cxemai(email);

		add.cxpassw("palshail");
		log.info("cx passw fils");

		add.addsub();
		log.info("from submit");

		Thread.sleep(3000);

		log.info("validation started....");

		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(res==true)
		{
			Assert.assertTrue(true);
			log.info("test case passed....");

		}
		else
		{
			log.info("test case failed....");
			capturescreenshot(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
}
