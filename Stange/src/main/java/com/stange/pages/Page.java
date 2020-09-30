package com.stange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page 
{
	public static WebDriver driver;
	public WebDriverWait wait;
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
		wait = new WebDriverWait(driver,10);
	}
	
	public abstract void setvalues(WebElement e , String value);
	
	public abstract String getPagetitle();
	
	public abstract void waitfortitle(String title);
	
	
	
	
	
	

}
