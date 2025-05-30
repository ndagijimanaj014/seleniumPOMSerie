package Exercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeSettingsShadowDom {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("chrome://settings");
	String jsscript="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
	JavascriptExecutor js= 	(JavascriptExecutor)driver;
	WebElement chromesearch=(WebElement)js.executeScript(jsscript);
	chromesearch.sendKeys("notification");
	}

}
