package com.intBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="uid") @CacheLookup WebElement textusename;
	@FindBy(name="password") @CacheLookup WebElement textpassword;
	@FindBy(name="btnLogin") @CacheLookup
	WebElement btnlogin;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setusermane(String usename)
	{
		textusename.sendKeys(usename);
	}
	public void setpassword(String password)
	{
		textpassword.sendKeys(password);
	}
	public void clicklogin()
	{
		btnlogin.click();
	}
	public void clicklogout()
	{
		lnkLogout.click();
	}
	

}
