package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysAndClick {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname=By.cssSelector("#input-firstname");
		By clickvalue= By.linkText("My Account");
//		Actions act= new Actions(driver);
//		act.sendKeys(driver.findElement(firstname),"testing").perform();
		//act.click(driver.findElement(By.linkText("My Account"))).perform();
		doActionsSendkeys(firstname,"testing");
		doActionsClick(clickvalue);
	}
	public static void doActionsSendkeys(By locator,String value) {
		Actions act= new Actions(driver);
		act.sendKeys(driver.findElement(locator),value).perform();
	}
	public static void doActionsClick(By locator) {
		Actions act= new Actions(driver);
		act.click(driver.findElement(locator)).perform();
	}

}
