package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.AppConstants;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;
import com.qa.opencart.pages.AccountPage;

public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void loginPageTitleTest() {
		String ActualTitle=loginpage.loginPageTitle();
		Assert.assertEquals(ActualTitle,AppConstants.LOGIN_PAGE_TITLE,AppError.BROWSER_NOT_FOUND);
	}
	@Test(priority=2)
	public void loginPageUrlTest() {
		String ActualUrl=loginpage.loginPageUrl();
		Assert.assertTrue(ActualUrl.contains(AppConstants.LOGIN_PAGE_FRACTION_URL),AppError.URL_NOT_FOUND);
		
		
	}
	@Test(priority=3)
	public void CheckForgotPwdLinkExistTest() {
		Assert.assertTrue(loginpage.CheckForgotPwdLinkExist(),AppError.ELEMENT_NOT_FOUND);
	}
	@Test(priority=4)
public void loginTest() {
		accountpage =loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(accountpage.accountPageTitle(),AppConstants.ACCOUNT_PAGE_TITLE,AppError.PAGE_TITLE_NOT_FOUND);

	
}

}
