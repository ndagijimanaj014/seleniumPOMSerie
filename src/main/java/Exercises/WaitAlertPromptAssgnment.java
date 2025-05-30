package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class WaitAlertPromptAssgnment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		// implicitlywait:applied all WebElement
		// explicitywait: (wait WebElement+Expectedconditions) + non- WebElement (e.g:url,title,alerts,frame,windowshandling,
		// implicitlywait syntax: driver.manager().timeouts().implicitlywait(10,duration.ofseconds);
		// Explicititywait syntax:1. WebDriverWait wait= new WebDriverWait(driver,duration.ofseconds(10);
		  //                           wait.until(Expectedconditions.visibityofElementLocator(locator);
		//                        2. WebDriverWait wait= new WebDriverWait(driver,duration.ofseconds(10);
		  //                           wait.until(Expectedconditions.presentofElementLocator(locator);
          //a.WebDriverWait
		   //b. Fluentwait
		ElementUtil util= new ElementUtil(driver);
		util.WaitForJSAlert(5);
		util.alertsSendKeys(7,"have good night...");
		//alert.sendKeys("hahahhah.....");
		//alert.dismiss();
		//alert.accept();
		
	}

}
