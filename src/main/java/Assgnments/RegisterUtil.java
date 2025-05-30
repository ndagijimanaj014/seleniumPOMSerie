package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUtil {
	private WebDriver driver;
	public RegisterUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void doSendkeys(By locator,String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public void doclick(By locator) {
		driver.findElement(locator).click();
	}
	
	

}
