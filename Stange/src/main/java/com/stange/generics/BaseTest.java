package com.stange.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public static WebDriver driver;
	
	static 
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./src/test/resources/driver/geckodriver.exe");
	}
	
	@BeforeClass
    @Parameters(value= {"browser"})
	public void openbrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if( browser.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Check browser parameter");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void openapp()
	{
		driver.get("http://localhost/login.do");
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}
