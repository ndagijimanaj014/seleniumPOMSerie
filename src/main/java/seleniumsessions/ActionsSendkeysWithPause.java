package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By searchbox=By.name("search");
//		String searchkey= "macbook";
//		Actions act= new Actions(driver);
//		char ch[]=searchkey.toCharArray();
//		for(char e:ch) {
//		act.sendKeys(driver.findElement(searchbox),e+"").pause(500).perform();
	//	act.sendKeys(driver.findElement(searchbox),String.valueOf(e)).pause(500).perform();
//			
//		}
//	
		doActionsSendkeysWithPause(searchbox,"macbook",500);
}
	public static void doActionsSendkeysWithPause(By locator,String value,long pausetime) {
		String searchkey= value;
		Actions act= new Actions(driver);
		char ch[]=searchkey.toCharArray();
		for(char e:ch) {
		//act.sendKeys(driver.findElement(locator),e+"").pause(500).perform();
		act.sendKeys(driver.findElement(locator),String.valueOf(e)).pause(pausetime).perform();
			
		}
		
	}
}
