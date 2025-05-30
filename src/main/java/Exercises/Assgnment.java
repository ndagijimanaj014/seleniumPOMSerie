package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assgnment {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
WebElement firstname = driver.findElement(By.id("input-firstname"));
Actions act= new Actions(driver);
act.sendKeys(firstname,"john").build().perform();
	
}
	}


