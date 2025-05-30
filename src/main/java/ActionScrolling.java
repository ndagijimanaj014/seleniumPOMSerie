import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act= new Actions(driver);
		//partial scrolling
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		//CMD/CONTROL + ARROW KEY UP/DOWN
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		
		act.scrollToElement(driver.findElement(By.partialLinkText("Contact Us"))).click(driver.findElement(By.partialLinkText("Contact Us"))).perform();
	}

}
