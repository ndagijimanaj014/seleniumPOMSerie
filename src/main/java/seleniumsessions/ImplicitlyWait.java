package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
		//1. impicitlywait: 
		//global wait: It will be applied for all the web element by default
		//2. Explicitywait:
		//2.a WebDriverWait
		//2.b FluentWait
		WebDriver driver= new ChromeDriver();
		//login:10secs
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel4.x
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");//10s:2secs
		// implicitwait can not used for non web element : URL,TITLE,ALERTS...
		

	}

}
