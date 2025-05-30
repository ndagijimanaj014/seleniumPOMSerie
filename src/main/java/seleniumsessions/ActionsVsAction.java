package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstname=driver.findElement(By.id("input-firstname"));
		Actions act= new Actions(driver);//Actions: is a class that can perform action
		                                 // Action: is an interface
		Action action = act.sendKeys(firstname,"peter").build();
		                Action actn = act.click(driver.findElement(By.partialLinkText("Wish List"))).build();
		                
		                action.perform();
		                actn.perform();

	}

}
