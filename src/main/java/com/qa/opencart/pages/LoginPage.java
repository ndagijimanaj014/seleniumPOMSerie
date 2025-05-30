package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.AppConstants;
import com.qa.opencart.utils.TimeUtil;

import seleniumsessions.ElementUtil;

public class LoginPage {
	//1.page objects: By Locators:
		private WebDriver driver;
		private ElementUtil eleUtil;
		private By emailId=By.id("input-email");
		private By passwordId=By.id("input-password");
		private By forgotenpwd=By.xpath("//a[text()='Forgotten Password']");
		private By Register=By.xpath("//a[text()='Register']");
		private By LoginButton= By.xpath("//input[contains(@class,'btn ')]");
		By Logout=By.xpath("//a[text()='Logout']");
		//2. public construct...of the page
		
		public LoginPage(WebDriver driver) {
		this.driver=driver;
		 eleUtil= new ElementUtil(driver);
		}
		//3. public page actions/methods
		public String loginPageTitle() {
			String title=eleUtil.waitForTittleToBe(AppConstants.LOGIN_PAGE_TITLE,TimeUtil.DEFAULT_TIME);
			//String title=driver.getTitle();
			System.out.println("login page Tittle"+title);
			return title;
		}
		public String loginPageUrl() {
			//String url=driver.getCurrentUrl();
			String url=eleUtil.waitForUrlContains(AppConstants.LOGIN_PAGE_FRACTION_URL,TimeUtil.DEFAULT_TIME);
			System.out.println("login page Url"+url);
			return url;
		}
		public Boolean CheckForgotPwdLinkExist() {
			return eleUtil.doIsDisplayed(forgotenpwd);
			//return driver.findElement(forgotenpwd).isDisplayed();
			
		}
		public AccountPage doLogin(String username, String pwd) {
//			driver.findElement(emailId).sendKeys(username);
//			driver.findElement(passwordId).sendKeys(pwd);
//			driver.findElement(LoginButton).click();
			System.out.println("user credentials"+username+""+pwd);
			eleUtil.dosendkeys(emailId,username);
			eleUtil.dosendkeys(passwordId,pwd);
			eleUtil.doClick(LoginButton);
			return new AccountPage(driver);
			
		}
		

}
