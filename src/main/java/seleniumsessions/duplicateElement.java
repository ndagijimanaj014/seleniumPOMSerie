package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicateElement {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		//driver.findElement(By.className("form-control")).sendKeys("John12@gmail.com");
		/*
		 * By forgetpassword=By.linkText("Forgotten Password"); ElementUtil el= new
		 * ElementUtil(driver); el.doClick(forgetpassword); By
		 * login=By.linkText("submit"); el.doClick(login);
		 */
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
