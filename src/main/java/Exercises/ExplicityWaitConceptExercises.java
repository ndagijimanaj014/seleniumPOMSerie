package Exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitConceptExercises {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
By emailid=By.cssSelector("#input-email");
By passwordid= By.id("input-password");
By loginbutton=By.cssSelector("input[class^='btn ']");
//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//WebElement Email=wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//Email.sendKeys("john@gmail.com");
getElement(emailid).sendKeys("John@gmail.com");
getElement(passwordid).sendKeys("abc123");
getElement(loginbutton).click();

WaitElementPresent(passwordid,5);
WaitElementPresent(emailid,10);
WaitElementvisibility(loginbutton,7);
	}
	public static WebElement getElement(By locator) {
  return driver.findElement(locator);


	}
	public static  WebElement  WaitElementPresent(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

//			An expectation for checking that an element is present on the DOM of a page.
//			This does notnecessarily mean that the element is visible.
		
	}
	public static  WebElement  WaitElementvisibility(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//			An expectation for checking that an element is present on 
//			the DOM of a page and visible.Visibility means that the element is
//			not only displayed but also has a height and width that isgreater than 0.
	}
	
	

}
