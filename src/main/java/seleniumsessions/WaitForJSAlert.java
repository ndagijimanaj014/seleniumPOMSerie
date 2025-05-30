package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlert {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(4));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//WaitForJSAlert(5);
//		String text = getAlertText(6);
//		System.out.println(text);
		alertsSendKeys(7," I am unvailable on call....");
	}
	public static Alert WaitForJSAlert(int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	public static  String getAlertText(int timeout) {
		Alert alert=WaitForJSAlert(timeout);
		String text=alert.getText();
		//System.out.println(text);
		alert.accept();
		return text;
	}
	public static void acceptAlert(int timeout) {
		WaitForJSAlert(timeout).accept();
	}
	public static void dismissAlert(int timeout) {
		WaitForJSAlert(timeout).dismiss();
	}
	public static void alertsSendKeys(int timeout, String value) {
		Alert alert=WaitForJSAlert(timeout);
		alert.sendKeys(value);
		//alert.accept();
		alert.dismiss();
		
	}

}
