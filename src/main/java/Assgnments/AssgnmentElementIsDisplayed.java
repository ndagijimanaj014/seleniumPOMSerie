package Assgnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnmentElementIsDisplayed {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.linkText("Continue")).isDisplayed();
//		System.out.println(flag);
		  List<WebElement> loginbutton = driver.findElements(By.xpath("//input[@value='Login']"));
		if(loginbutton.size()==1) {
			System.out.println("count single login button is displayed");
		
		} else {
			System.out.println("count multipe or empty times login button is not displayed");
		}
//		List<WebElement> loginpagelist = driver.findElements(By.xpath("//div[@class='list-group']/a"));
//		System.out.println(loginpagelist.size());
//		for(WebElement e:loginpagelist) {
//			String text = e.getText();
//			System.out.println(text);
//			
//		}
//		List<WebElement> password = driver.findElements(By.id("input-password"));
//		System.out.println(password.size());
//		for(WebElement e:password) {
//			String text = e.getText();
//			System.out.println(text);
//			
//		}
		}

	}


