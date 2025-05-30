package com.qa.opencart.pages;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import com.qa.opencart.pages.loginPage1.accountPage;
import com.qa.opencart.utils.ElementUtil;

public class loginPage1 {
	public class accountPage implements WebElement {

		@Override
		public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void click() {
			// TODO Auto-generated method stub

		}

		@Override
		public void submit() {
			// TODO Auto-generated method stub

		}

		@Override
		public void sendKeys(CharSequence... keysToSend) {
			// TODO Auto-generated method stub

		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub

		}

		@Override
		public String getTagName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public @Nullable String getAttribute(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isSelected() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getText() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<WebElement> findElements(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebElement findElement(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Point getLocation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Dimension getSize() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Rectangle getRect() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getCssValue(String propertyName) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	private  WebDriver driver;
	//private ElementUtil ele;
	private By EmailId=By.xpath("(//input[@class='form-control'])[1]");
	private By passwordId=By.xpath("(//input[@type='text'])[2]");
	private By loginButton=By.xpath("//input[@class='btn btn-primary']");
	
public loginPage1(WebDriver driver) {
this.driver=driver;
	//ele= new ElementUtil();
}
public String checkLoginPageUrl() {
	String currentUrl=driver.getCurrentUrl();
	System.out.println("the current url is:"+currentUrl);
	return currentUrl;
}
public String checkLoginPageTtle() {
	String title=driver.getTitle();
	System.out.println("login page Tittle"+title);
	return title;
}
public accountPage1 loginCredentials(String username,String pwd) {
	driver.findElement(EmailId).sendKeys(username);
	driver.findElement(passwordId).sendKeys(pwd);
	driver.findElement(loginButton).click();
	return new accountPage1(driver);

}

}
