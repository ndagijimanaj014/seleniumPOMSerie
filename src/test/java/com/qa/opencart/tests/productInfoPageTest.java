package com.qa.opencart.tests;


	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.qa.opencart.base.BaseTest;
	import com.qa.opencart.errors.AppError;

	public class productInfoPageTest extends BaseTest{
		@BeforeClass
		public void productInfPageSetUp() {
			accountpage =loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		}
		@DataProvider
	public Object[][] getProductHeaderData() {
		return new Object[][] {
			{"macbook","MacBook Pro"},
			{"imac","iMac"},
			{"iphone","iPhone"}
			
		};
		}
		@Test(dataProvider="getProductHeaderData",priority=1)
		public void productHeaderTest(String searchKey, String productName) {
			searchresultpage=accountpage.doSearch( searchKey);
			productInfoPage=searchresultpage.selectProduct(productName);
			Assert.assertEquals(productInfoPage.getProductHeader(),productName,AppError.HEADER_NOT_FOUND);
		}
		@DataProvider
		public Object[][] getproductImageData() {
			return new Object[][] {
				{"macbook","MacBook Pro",4},
				{"imac","iMac",3},
				{"iphone","iPhone",6}
				
			};
		}
		@Test(dataProvider="getproductImageData",priority=2)
		public void productImagesCount(String searchKey,String productName,int imageCount) {
			searchresultpage=accountpage.doSearch(searchKey);
			productInfoPage=searchresultpage.selectProduct(productName);
			Assert.assertEquals(productInfoPage.getProductImageCount(),imageCount,AppError.IMAGE_COUNT_NOT_MATCHED);
		}
		
	}


