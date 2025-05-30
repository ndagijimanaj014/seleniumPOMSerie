package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcerts {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login	");
		// 1.create webelement+perform
		// action(click,sendkeys,gettext,isdisplayed(0...etc)
		// driver.findElement(ById.id("input-email")).sendKeys("thenextgenautomation@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("ved@123");
		// 2.

		/*
		 * WebElement Emailadress=driver.findElement(ById.id("input-email")); WebElement
		 * Password=driver.findElement(By.id("input-password"));
		 * Emailadress.sendKeys("thenextgenautomation@gmail.com");
		 * Password.sendKeys("veda@123");
		 */

		// 3. By locator
		/*
		 * By Emailid = By.id("input-email"); WebElement emailid =
		 * driver.findElement(Emailid);
		 * emailid.sendKeys("thenextgenautomation@gmail.com"); By
		 * password=By.id("input-password"); WebElement
		 * Password=driver.findElement(password); Password.sendKeys("veda@123");
		 */
		// 4. By locator + Generic fuction for WebElement
		/*
		 * By emailid=By.id("input-email");
		 * getElement(emailid).sendKeys("thenextgenautomation@gmail.com"); By
		 * password=By.id("input-password"); getElement(password).sendKeys("veda@123");
		 */
		// 5. By locator + Generic fuction for WebElement and sendkeys
		
		  By emailid = By.id("input-email"); By password = By.id("input-password");
		  dosendkeys(emailid,"thenextgenautomation@gmail.com");
		  dosendkeys(password,"veda@123");
		 
		// 5. By locator + Generic fuction for WebElement and sendkeys: ElementUtil
		/*
		 * By emailid=By.id("input-email"); By password=By.id("input-password");
		 * ElementUtil util= new ElementUtil(driver);
		 * util.dosendkeys(emailid,"thenextgenautomation@gmail.com");
		 * util.dosendkeys(password,"veda@123");
		 */
	}

	
	  public static WebElement getElement(By locator) { return
	  driver.findElement(locator);
	  
	  }
	  
	  public static void dosendkeys(By locator, String value) {
	  driver.findElement(locator).sendKeys(value);
	  
	  }
	 
}
