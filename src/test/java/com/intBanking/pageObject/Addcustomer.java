package com.intBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcustomer {
	
	WebDriver ldriver;
	
	public Addcustomer(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name ="closeBtn") @CacheLookup WebElement closeadd;
	@FindBy(xpath ="/html/body/div[3]/div/ul/li[2]/a") @CacheLookup WebElement Addcx;
	@FindBy(name ="name") @CacheLookup WebElement cxname;
	@FindBy(name ="rad1") @CacheLookup WebElement mfradio;
	@FindBy(name ="dob") @CacheLookup WebElement dob;
	@FindBy(name ="addr") @CacheLookup WebElement cxaddress;
	@FindBy(name ="city") @CacheLookup WebElement cxcity;
	@FindBy(name ="state") @CacheLookup WebElement cxstate;
	@FindBy(name ="pinno") @CacheLookup WebElement cxpin;
	@FindBy(name ="telephoneno") @CacheLookup WebElement cxphone;
	@FindBy(name ="emailid") @CacheLookup WebElement cxemai;
	@FindBy(name ="password") @CacheLookup WebElement cxpassw;
	@FindBy(name ="sub") @CacheLookup WebElement addsub;
	@FindBy(name ="res") @CacheLookup WebElement addres;
	
	public void closead()
	{
		closeadd.click();
	}
	
	public void Newcxbtn()
	{
		Addcx.click();
	}
	public void cxname(String name)
	{
		cxname.sendKeys(name);
	}
	public void mfradio(String gen)
	{
		mfradio.sendKeys(gen);
	}
	public void dob(String mm,String dd,String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	public void cxaddress(String adress)
	{
		cxaddress.sendKeys(adress);
	}
	public void cxcity(String city)
	{
		cxcity.sendKeys(city);
	}
	public void cxstate(String State)
	{
		cxstate.sendKeys(State);
	}
	public void cxpin(String pin)
	{
		cxpin.sendKeys(pin);
	}
	public void cxphone(String phone)
	{
		cxphone.sendKeys(phone);
	}
	public void cxemai(String email)
	{
		cxemai.sendKeys(email);
	}
	public void cxpassw(String pwd)
	{
		cxpassw.sendKeys(pwd);
	}
	public void addsub()
	{
		addsub.click();
	}
	public void addres()
	{
		addres.clear();
	}
	
}
