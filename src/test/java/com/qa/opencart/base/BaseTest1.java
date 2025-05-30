package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory1;
import com.qa.opencart.pages.accountPage1;
import com.qa.opencart.pages.loginPage1;

public class BaseTest1 {
	protected WebDriver driver;
	protected DriverFactory1 df;
	protected loginPage1 loginpage1;
	protected accountPage1 accountpage1;
	@BeforeTest
public void setUp() {
		driver= new ChromeDriver();
	 df= new DriverFactory1();
	df.initDriver("chrome");
	loginpage1=new loginPage1(driver);
}
	@AfterTest
public void tearDown() {
	//driver.close();
	driver.quit();
}

}
