package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTittleAndUrl {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		By pricing=By.linkText("Pricing");
		ElementUtil el=  new ElementUtil(driver);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
//		String frag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'")).toString();//"true"
//		if(Boolean.parseBoolean(frag)) {
//			System.out.println("page is complete loaded");
//		} else {
//			System.out.println("page is not complete loaded");
//		}
		el.isPageLoading(2);
		el.clickWhenReady(pricing, 5);
		String title=el.waitForTittleToBe("Free CRM Pro PRICING",3);
		System.out.println(title);
		System.out.println(title.contains("Free CRM Pro PRICING"));
//		String title=waitForTittleContains("PRICING",7);
//		System.out.println(title);
//		System.out.println(title.contains("PRICING"));
		String url=waitForUrlContains("pricing.html",7);
		System.out.println(url);
		System.out.println(url.contains("pricing.html"));
		
		//isPageLoading(5);
		
	}
//	public  static void isPageLoading(int timeout) {
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
//		String frag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete'")).toString();//"true"
//		if(Boolean.parseBoolean(frag)) {
//			System.out.println("page is complete loaded");
//		} else {
//			System.out.println("page is not complete loaded");
//		}
	

public  static String waitForTittleContains(String titleFraction,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	try{if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
		return driver.getTitle();
	}
	
		
	}  catch(TimeoutException e) {
		System.out.println(" title is not correct");
	}
	return driver.getTitle();
}
public  static String waitForUrlContains(String urlFraction,int timeout) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
	try {
	if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
	
		return driver.getCurrentUrl();	
	}
	}catch(TimeoutException e) {
		
	
	System.out.println(" url is not correct");
	

	} 
		
		return driver.getCurrentUrl();
	}



}
