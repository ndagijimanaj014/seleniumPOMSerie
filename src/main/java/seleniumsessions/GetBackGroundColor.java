package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackGroundColor {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement shopcart=driver.findElement(By.cssSelector("button[class^='btn ']"));
		String color=shopcart.getCssValue("background-color");
		System.out.println(color);
	}

}
