package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.TimeUtil;

import seleniumsessions.ElementUtil;

public class searchResultPage {
private WebDriver driver;
private ElementUtil eleUtil;
By searchResults=By.cssSelector("div.product-thumb");
public searchResultPage(WebDriver driver) {
	this.driver=driver;
	 eleUtil= new ElementUtil(driver);
}
public int getSearchResultsCount() {
	List<WebElement> resultList = eleUtil.WaitForElementVisible1(searchResults,TimeUtil.DEFAULT_TIME);
	int resultCount=resultList.size();
	System.out.println(resultCount);
	return resultCount;
}
public ProductInfoPage selectProduct(String productName) {
	eleUtil.doClick(By.linkText(productName),TimeUtil.DEFAULT_TIME);
	return new ProductInfoPage(driver);
}
}
