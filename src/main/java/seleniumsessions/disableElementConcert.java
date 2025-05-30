package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disableElementConcert {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		// isDisplayed,isEnabled,isSelected
		//driver.findElement(By.id("pass")).click();// for click nothing will happen with no exception
		//driver.findElement(By.id("pass")).sendKeys("john");//ElementNotInteractableException:element not interactable
		boolean disbleEle = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(disbleEle);
		boolean enabledEle= driver.findElement(By.id("pass")).isEnabled();
		System.out.println(enabledEle);
		boolean selected = driver.findElement(By.id("pass")).isSelected();
		System.out.println(selected);
		

	}

}
