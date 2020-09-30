package com.stange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) 
	{
		super(driver);
		
	}

	@Override
	public String getPagetitle()
	{	
		return  driver.getTitle();
		
	}

	@Override
	public void waitfortitle(String title) {
	 try
	 {
		 
		 wait.until(ExpectedConditions.titleContains(title));
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error occured while waiting for element "+ title);
	 }
		
	}
	
	public void setvalues(WebElement e , String value)
	{
		e.sendKeys(value);
	}

}
