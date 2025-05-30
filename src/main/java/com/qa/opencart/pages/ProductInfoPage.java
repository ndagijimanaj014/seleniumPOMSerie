package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.TimeUtil;

import seleniumsessions.ElementUtil;

public class ProductInfoPage {
	private WebDriver driver;
	private ElementUtil ele;
	By productImagesCount=By.cssSelector("a.thumbnail");
	By productHeader=By.cssSelector("div#content h1");
public ProductInfoPage(WebDriver driver) {
	this.driver= driver;
	ele= new ElementUtil(driver);
}
public int getProductImageCount() {
	List<WebElement >productimagecount = ele.WaitForElementVisible1(productImagesCount, TimeUtil.LONGER_TIME);
	int resultcount=productimagecount.size();
	return resultcount; 
}
public String getProductHeader() {
String header=ele.doGetText(productHeader);
System.out.println("product header.."+header);
return header;
}
}
