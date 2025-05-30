package com.qa.opencart.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.AppConstants;
import com.qa.opencart.errors.AppError;
import com.qa.opencart.exceptions.FrameworkException;

import seleniumsessions.BrowserException;

public class DriverFactory {
WebDriver driver;
Properties prop;
public static ThreadLocal<WebDriver>tLDriver= new ThreadLocal<WebDriver>();
//this is used to init the driver on the basis on given browserName
public WebDriver initDriver(Properties pro) {
	//prop= new Properties();
	String browsername=prop.getProperty("browser");
	System.out.println(" browser name is:"+ browsername);
	switch ( browsername.toLowerCase().trim()) {
	case "chrome":
		//driver= new ChromeDriver();
		tLDriver.set(new ChromeDriver());
		break;
	case "Firefox":
		//driver= new FirefoxDriver();
		tLDriver.set(new FirefoxDriver());
		break;
	case "Edge":
		//driver= new EdgeDriver();
		tLDriver.set(new EdgeDriver());
		break;
	case "Safari":
	//	driver= new SafariDriver();
		tLDriver.set(new SafariDriver());
		break;

	default:
		System.out.println("please pass the right browser:"+browsername);
		
		throw new BrowserException(AppError.BROWSER_NOT_FOUND);
		//break;
	}
	getDriver().manage().window().maximize();
	getDriver().manage().deleteAllCookies();
	//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	getDriver().get(prop.getProperty("url"));
	return getDriver();
	
}
public static WebDriver getDriver() {
	return tLDriver.get();
}
public Properties initPro() {
	prop= new Properties();
	FileInputStream ip= null;
	//mvn clean install-Denv="qa"
	String envName=System.getProperty("env");
	if(envName==null) {
		System.out.println("env name is not given ,hence running it on qa environment");
		
		try {
			ip = new FileInputStream(AppConstants.CONFI_QA_FILE_PATH);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} else {
		try {
		switch (envName.trim().toLowerCase()) {
		case "qa":
			ip = new FileInputStream(AppConstants.CONFI_QA_FILE_PATH);
			
			break;
		case "dev":
			ip = new FileInputStream(AppConstants.CONFI_DEV_FILE_PATH);
			
			break;
		case "stages":
			ip = new FileInputStream(AppConstants.CONFI_STAGES_FILE_PATH);
			
			break;
		case "uat":
			ip = new FileInputStream(AppConstants.CONFI_UAT_FILE_PATH);
			
			break;

		default:
			System.out.println("please pass the right env Name.."+envName);
			throw new FrameworkException("===WRONG ENV PASSED====");
			
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	try {
		prop.load(ip);
	}catch (IOException e) {
		e.printStackTrace();
	}
	
return prop;
}
public static String getScreenShort(String methodName) {

	// get the driver instance

	TakesScreenshot screenshotTaker = (TakesScreenshot) getDriver();

	// Take the screenshot and save it to a temporary location

	File scrFile = screenshotTaker.getScreenshotAs(OutputType.FILE);

	// Define the path for the screenshot folder

	String screenshotDirPath = System.getProperty("user.dir") + "/screenShots";

	// create the screenshots folder if it doesn't exist

	File screenShotDir = new File(screenshotDirPath);
	if (!screenShotDir.exists()) {
		if (screenShotDir.mkdir()) {
			System.out.println("Folder 'screenShots' created successfully at :" + screenShotDir);
		} else {
			System.out.println("Failed to create the folder 'screenshots' at " + screenShotDir);
		}
	}

	// Define the destination path for the screenshot

	String screenshotPath = screenshotDirPath + "/" + methodName + "_" + System.currentTimeMillis() + ".png";

	File destination = new File(screenshotPath);

	// copy the screenshot to the destination path
	try {
		FileHandler.copy(scrFile, destination);
	} catch (IOException e) {
		e.printStackTrace();
	}

	return destination.getAbsolutePath();

}


}
