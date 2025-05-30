package com.qa.opencart.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest1;
import com.qa.opencart.pages.accountPage1;

public class loginPageTest1 extends BaseTest1{
	@Test(priority=1)
	public void checkloginPageTitleTest() {
		String currenttitle=loginpage1.checkLoginPageTtle();
		Assert.assertEquals(currenttitle,"Account Login","===PASS THE RIGHT PAGE TITLE===");
	}
	@Test(priority=2)
	public void checkloginPageUrlTest() {
		String currentUrl=loginpage1.checkLoginPageUrl();
		Assert.assertTrue(currentUrl.contains("route=account/login"),"===PASS CORRECT URL===");
	}
	@Test(priority=3)
	public void enterUsername() {
		loginpage1.loginCredentials("veda@gmail.com","veda@123");
		
		
	}


}
