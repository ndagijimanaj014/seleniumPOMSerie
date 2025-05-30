package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomElementInsideIframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		//browser--page--frame--shadowDom--element
		driver.switchTo().frame("pact");
		Thread.sleep(3000);
		String jsscript= "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript(jsscript);
		tea.sendKeys("masala tea");
	}

}
