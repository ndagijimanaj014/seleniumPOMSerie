package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.searchResultPage;

public class BaseTest {
	WebDriver driver;
	protected DriverFactory df;
	protected Properties prop;
	protected LoginPage loginpage;
	protected AccountPage accountpage;
	protected searchResultPage searchresultpage;
	protected ProductInfoPage productInfoPage;
	
	@BeforeTest
	@Parameters
public void setUp(@Optional("chrome")String browserName) {
	 df= new DriverFactory();
	 prop = df.initPro();
	 if(browserName!=null) {
		 prop.setProperty("browser",browserName);
		 
	 }
		//df.initDriver("Chrome");
	driver=df.initDriver(prop);
	//df.loginCredential(prop);
	 loginpage = new LoginPage(driver);
	
}
	@AfterTest
public void tearDown() {
	driver.quit();
}
}
