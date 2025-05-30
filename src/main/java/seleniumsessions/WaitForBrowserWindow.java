package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		By linkedin=By.xpath("//a[@target='_blank']");
		ElementUtil ut= new ElementUtil(driver);
		ut.clickWhenReady(linkedin, 10);//child
		WaitForWindowToBe(2,7);

	}
	public static void WaitForWindowToBe(int totalwindow,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.numberOfWindowsToBe(totalwindow));
		
	}

}
