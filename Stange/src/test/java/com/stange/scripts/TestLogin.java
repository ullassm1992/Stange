package com.stange.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.stange.generics.BaseTest;
import com.stange.pages.LoginPage;

public class TestLogin extends BaseTest
{
	@Test
	public void testlogin()
	{
		LoginPage lp = new LoginPage(driver);
		System.out.println("Title of page :"+ lp.getPagetitle());
		
		lp.login("admin" ,"manager");
		
		String exptitle = "actiTIME - Enter Time-Track";
		
		lp.waitfortitle(exptitle);
		String acttitle=lp.getPagetitle();
		Assert.assertEquals(exptitle, acttitle);
	}

}
