package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver= new ChromeDriver();
		driver.get("https://www.formsite.com/templates/example-form-templates/file-upload-example/");
		driver.findElement(By.xpath("//img[@title='File-Upload-Demo-Forms-and-Examples']")).click();
		By iframelocator=By.xpath("//iframe[contains(@id,'frame')]");
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframelocator));
		WaitForFrameByLocator(iframelocator,11);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("john");
		driver.switchTo().defaultContent();//back in the main page
		String title=driver.findElement(By.xpath("//h1[text()='File Upload Example Form']")).getText();
System.out.println(title);
}
	public static void WaitForFrameByLocator(By locator,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	public static void WaitForFrameByIndex(int frameindex,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
	}
	public static void WaitForFrameByIdorName(String NameorId,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(NameorId));
	}
	public static void WaitForFrameByWebElement(WebElement frameElement,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}
