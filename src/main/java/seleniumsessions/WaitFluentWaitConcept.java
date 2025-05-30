package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitFluentWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		// by default pollingEvery 500ms
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		By pricing=By.xpath("//a[text()='Pricing']");
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
//		             .withTimeout(Duration.ofSeconds(10))
//		             .pollingEvery(Duration.ofSeconds(2))
//		             .ignoring(NoSuchElementException.class)
//		             .withMessage("=== element not found==");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(pricing)).click();
	          WaitForElementVisible(pricing,10,2);   

	}
	public static void WaitForElementVisible(By locator, int timeout, int intervaltime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
	             .withTimeout(Duration.ofSeconds( timeout))
	             .pollingEvery(Duration.ofSeconds(intervaltime))
	             .ignoring(NoSuchElementException.class)
	             .withMessage("=== element not found==");
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
	             
	}

}
