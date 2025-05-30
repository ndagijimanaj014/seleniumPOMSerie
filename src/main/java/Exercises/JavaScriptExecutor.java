package Exercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.JavaScriptUtil;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		//CD,ED,SafariD,FirefoxD->RemoteWD Extends->JavaScriptExecutor:interface
		//A:Abraction
		//P: p
		//I:
		//E:
		//executeScript();
		//RemoteWD Extends->webdriver:interface
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/pricing");
		//JavaScriptExecutor js= (JavaScriptExecutor)driver;
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String url=js.executeScript("return document.URL").toString();
//		System.out.println(url);
		JavaScriptUtil jsu= new JavaScriptUtil(driver);
		String url=jsu.getcurrentUrlByJs();
		System.out.println(url);
		String title=jsu.getTitleByJs();
		System.out.println(title);
		//jsu.generateJsAlert("i am thanksful");
		//jsu.generateJsConfirm("God is good");
		jsu.generateJsPrompt("selenium","testing");
		jsu.goForwardWithJs();
		
		
		
		

	}

}
