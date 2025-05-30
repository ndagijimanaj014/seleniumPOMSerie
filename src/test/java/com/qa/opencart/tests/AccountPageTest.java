package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.AppConstants;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;

public class AccountPageTest extends BaseTest{
	@BeforeClass
	public void accSetUp() {
		accountpage =loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		}
	@Test(priority=1)
	public void accountPageTitleTest() {
		String ActualTitle=accountpage.accountPageTitle();
		Assert.assertEquals(ActualTitle,AppConstants.ACCOUNT_PAGE_TITLE,AppError.ACCOUNT_NOT_MATH);
	}
	@Test(priority=2)
	public void accountPageUrlTest() {
		String ActualUrl=accountpage.accountPageUrl();
		Assert.assertTrue(ActualUrl.contains(AppConstants.ACCOUNT_PAGE_FRACTION_URL),AppError.URL_NOT_FOUND);
		}
	@Test(priority=3)
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(accountpage.isLogoutLinkExist(),AppError.ELEMENT_NOT_FOUND);
	}
	@Test(priority=4)
	public void pageHeadersTest() {
		List<String> accountPageHeadersList = accountpage.getPageHeaders();
		Assert.assertEquals(accountPageHeadersList,AppConstants.PAFE_HEADERS_LIST,AppError.LIST_IS_NOT_MATCHED);
	}

	@DataProvider
public Object[][] getSearchData() {
		return new Object[][]{
			{"macbook",3},
			{"imac",1},
			{"iphone",1},
			{"car",0},
		};
	
}
	@Test(dataProvider="getSearchData",priority=5)
	public void searchTest(String searchKey,int resultCount) {
		searchresultpage=accountpage.doSearch(searchKey);
		Assert.assertEquals(searchresultpage.getSearchResultsCount(),resultCount,AppError.ACCOUNT_NOT_MATH);
		
	}
}
