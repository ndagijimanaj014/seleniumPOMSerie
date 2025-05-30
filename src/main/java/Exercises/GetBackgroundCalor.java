package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundCalor {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement chartcart=driver.findElement(By.cssSelector("img[class*='responsive']"));
		String color=chartcart.getCssValue("background-color");
		System.out.println(color);
	}

}
