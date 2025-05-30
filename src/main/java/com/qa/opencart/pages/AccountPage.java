package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.AppConstants;
import com.qa.opencart.utils.TimeUtil;

import seleniumsessions.ElementUtil;

public class AccountPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
private By Logout=By.linkText("Logout");
private By searchText=By.xpath("//div[@id='search']/input");
private By searchIcon=By.cssSelector("div#search button");
private By headers= By.cssSelector("div#content h2");

public AccountPage(WebDriver driver) {
	this.driver=driver;
	 eleUtil= new ElementUtil(driver);
}

public String accountPageTitle() {
	//String title=driver.getTitle();
	String title=eleUtil.waitForTittleToBe(AppConstants.LOGIN_PAGE_TITLE,TimeUtil.DEFAULT_TIME);
	System.out.println("account page Tittle"+title);
	return title;
}
public String accountPageUrl() {
	//String url=driver.getCurrentUrl();
	String url=eleUtil.waitForUrlContains(AppConstants.LOGIN_PAGE_FRACTION_URL,TimeUtil.DEFAULT_TIME);
	System.out.println("account page Url"+url);
	return url;
}

public boolean isLogoutLinkExist() {
	//return driver.findElement(Logout).isDisplayed();
	return eleUtil.doIsDisplayed(Logout);
}
public void logout() {
	//driver.findElement(Logout).click();
	eleUtil.doClick(Logout);
}
public List<String> getPageHeaders() {
	//List<WebElement> headerList = driver.findElements(headers);
	List<WebElement> headerList = eleUtil.WaitForElementVisible1(headers, TimeUtil.DEFAULT_TIME);
	List<String>headersValList= new ArrayList<String>();
	for(WebElement e:headerList) {
		String Text=e.getText();
		headersValList.add(Text);
		
	}
	return headersValList;
}
public boolean isSearchExist() {
	//return driver.findElement(searchText).isDisplayed();
	return eleUtil.doIsDisplayed(searchText);
}
public searchResultPage doSearch(String searchkey) {
	if(isSearchExist()) {
	//driver.findElement(searchText).sendKeys(searchkey);
	//driver.findElement(searchIcon).click();
		eleUtil.dosendkeys(searchText, searchkey);
		eleUtil.doClick(searchIcon);
		
	return new searchResultPage(driver);
	}
	else {
		System.out.println("search field is not on the current page");
	return null;
	}
	
}






}
