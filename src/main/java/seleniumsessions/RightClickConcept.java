package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightclickEl=By.xpath("//span[text()='right click me']");
		
//		Actions act= new Actions(driver);
//		act.contextClick(driver.findElement(rightclickEl)).perform();
//		List<WebElement> optionlist = driver.findElements(By.cssSelector("ul.context-menu-list>li.context-menu-icon>span"));
//         for(WebElement e:optionlist) {
//        	 String text=e.getText();
//        	 System.out.println(text);
//        	 if(text.equals("copy")) {
//        		 e.click();
//        		 break;
//        		 
//        	 }
//        	 
//         }
		doRightClick(rightclickEl,"copy");
	}
	public static void doRightClick(By locator,String value) {
		Actions act= new Actions(driver);
		act.contextClick(driver.findElement(locator)).perform();
		List<WebElement> optionlist = driver.findElements(By.cssSelector("ul.context-menu-list>li.context-menu-icon>span"));
         for(WebElement e:optionlist) {
        	 String text=e.getText();
        	 System.out.println(text);
        	 if(text.equals(value)) {
        		 e.click();
        		 break;
        		 
        	 }
        	 
         }
		
	}

}
