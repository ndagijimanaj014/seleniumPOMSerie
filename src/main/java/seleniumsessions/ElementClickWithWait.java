package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementClickWithWait {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		By signup=By.linkText("Sign Up");
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(signup)).click();
		clickWhenReady(signup,10);
	}
	public static void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

	}

}
