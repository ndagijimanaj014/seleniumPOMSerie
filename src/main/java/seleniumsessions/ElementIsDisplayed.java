package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.id("input-email1")).isDisplayed();
//		System.out.println(flag);
		By EmailId=By.id("input-email1");
		By forgottenpwd=By.linkText("Forgotten Password");
		By logo=By.className("img-responsive");
		//doIsDisplayed(EmailId);
//		if(doIsDisplayed(EmailId)) {
//			System.out.println("PASS");
//			
//		} else {
//			System.out.println("FAIL");
//		}
//		List<WebElement> emailidlist = driver.findElements(By.id("input-email1"));
//		if(emailidlist.size()==1) {
//			System.out.println("emailid is present on  page");
//			
//		} else {
//			System.out.println("emailid is coming more than two times or not present on page");
//		}
		//isElementDisplayed(EmailId);
		isElementDisplayed(forgottenpwd,5);
		//isElementDisplayed(logo);
		//System.out.println(isElementDisplayed(forgottenpwd,5));

	}
	public static boolean isElementDisplayed(By locator,int times) {
		int elementcount = driver.findElements(locator).size();
		if( elementcount==1) {
			System.out.println("single element is displayed"+locator);
			return true;
		} else {
			System.out.println("multiple or empty element is displayed"+locator);
			return false;
		}
	}
	public static boolean doIsDisplayed(By locator) {
		try {
		boolean flag = GetElement(locator).isDisplayed();
		System.out.println("element with locator:"+locator+"is displayed");
		return true;
		}
		catch(NoSuchElementException e){
			System.out.println("element with locator:"+locator+"is not displayed");
			return false;
		}
	}
	public static WebElement GetElement(By locator) {
		return driver.findElement(locator);
		
	}

}
