package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementConceptWithException {
static WebDriver driver;
	public static void main(String[] args) {
	driver= new ChromeDriver();
	driver.get("https://demo.opencart.com/en-gb?route=account/login");
	try {
	driver.findElement(By.id("input-email12")).sendKeys("thenextgenautomation@gmail.com");
	}
	catch(NoSuchElementException e) {
		e.printStackTrace();
	}
	driver.findElement(By.id("input-password")).sendKeys("john@123");
	driver.findElement(By.linkText("submit")).click();


	}

}
