package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadomDomHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("testing");
		Thread.sleep(5000);
String jscript=" return document.querySelector(\"#glaf\")";
JavascriptExecutor js= (JavascriptExecutor)driver;
WebElement destin=(WebElement)js.executeScript(jscript);

destin.sendKeys("testing");
	}

}
