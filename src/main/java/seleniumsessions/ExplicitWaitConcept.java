package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
static WebDriver driver;
	public static void main(String[] args) {
		// wait().until();
		// implemented by fluentwait(c)---methods()+until()
		// extented by WebDriverWait(c)-->inherited methods+Individual methods
		 driver= new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 By emailid=By.cssSelector("input#input-email");
		 By passwordid=By.id("input-password");
		 By loginbutton=By.cssSelector("input[class^='btn ']");
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));//sel 4.x
//		WebElement email_ele=wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//		email_ele.sendKeys("testing@gmail.com");
		getElement(passwordid).sendKeys("1234");
		//  WaitForElementPresence(emailid,10).sendKeys("testing@gmail.com");
		  WaitForElementPresence( passwordid,7).sendKeys("abc123");

	}
	public  static WebElement getElement(By locator) { 
		  return driver.findElement(locator);
		
	  }
//	An expectation for checking that an element is present on the DOM of a page.
//	This does notnecessarily mean that the element is visible.
	public  static WebElement WaitForElementPresence(By locator,int timeout) { 
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	  
	  }
//	An expectation for checking that an element is present on 
//	the DOM of a page and visible.Visibility means that the element is
//	not only displayed but also has a height and width that isgreater than 0.
	public  static WebElement WaitForElementLocated(By locator,int timeout) { 
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	  
	  }
	

}
