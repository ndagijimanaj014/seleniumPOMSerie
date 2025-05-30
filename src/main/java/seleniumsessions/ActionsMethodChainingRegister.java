package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstname=driver.findElement(By.id("input-firstname"));
		Actions act= new Actions(driver);
		act.sendKeys(firstname,"john")
		.sendKeys(Keys.TAB)
		.pause(3000)
		.sendKeys("ndagijimana")
		.sendKeys(Keys.TAB)
		.pause(3000)
		.sendKeys("abd@gmail.com")
		.pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys("0783445")
		.pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys("abc")
		.pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys("abc")
		.pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).build().perform();
	}

}
