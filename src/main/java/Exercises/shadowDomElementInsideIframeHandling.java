package Exercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomElementInsideIframeHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.switchTo().frame("pact");
		String jscript=" return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript(jscript);
	Thread.sleep(5000);
		tea.sendKeys("greentea");

	}

}
