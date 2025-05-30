package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeSettingsShadowDomHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("chrome://settings");
		Thread.sleep(5000);
		String jscript=" return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#background\")";
JavascriptExecutor js= (JavascriptExecutor)driver;
WebElement chrome=(WebElement)js.executeScript(jscript);

chrome.sendKeys("notification");
	}

}
