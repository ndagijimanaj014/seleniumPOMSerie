package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomElementHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		//driver.findElement(By.xpath("//input[@id='pizza']")).sendKeys("veg pizza")
		
		String jsScript= "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
JavascriptExecutor js= (JavascriptExecutor)driver;
WebElement pizza=(WebElement)js.executeScript(jsScript);
Thread.sleep(3000);
pizza.sendKeys("veg pizza");
	}

}
