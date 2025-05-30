package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class printAllLinks {
	static WebDriver driver;

	public static void main(String[] args) {
	driver= new ChromeDriver();
	driver.get("https://demo.opencart.com/en-gb?route=account/register");
	By register=By.cssSelector("#column-right > div > a:nth-child(2)");
	ElementUtil el= new ElementUtil(driver);
	el.doClick(register);
	driver.navigate().to("https://demo.opencart.com/en-gb/catalog/tablet");
	driver.navigate().back();
	driver.navigate().to("https://demo.opencart.com/en-gb/catalog/software");
	driver.navigate().back();
	driver.navigate().to("https://demo.opencart.com/en-gb/catalog/smartphone");
	driver.navigate().back();
	driver.navigate().to("https://demo.opencart.com/en-gb/catalog/cameras");
	driver.navigate().back();
	
	

	}

}
