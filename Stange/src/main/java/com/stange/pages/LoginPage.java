package com.stange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends BasePage
{
	@FindBy(xpath="//input[@id='username']")
	private WebElement untb;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwtb;
	
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement lgcb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgb;
	
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errormessg;

	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void set_username(String un)
	{
		setvalues(untb, un);
	}
	public void set_password(String pw)
	{
		setvalues(pwtb, pw);
	}
	public void login(String un ,String pw)
	{
		setvalues(untb, un);
		setvalues(pwtb, un);
	     lgb.click();	
	}
	
	public void logincheckbox()
	{
		lgcb.click();
	}
	
	public String geterrormessage()
	{
		return errormessg.getText();
		
	}

}
