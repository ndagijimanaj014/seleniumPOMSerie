package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/");
        Actions act= new Actions(driver);
        act.moveToElement(driver.findElement(By.cssSelector("a.menulink"))).build().perform();//selenium3.x
        act.moveToElement(driver.findElement(By.cssSelector("a.menulink"))).perform();//selenium4.x
//        By parentLocator= By.cssSelector("a.menulink");
driver.findElement(By.xpath("(//a[text()='Courses'])[2]")).click();
//        By childLocator=By.xpath("(//a[text()='Courses'])[2]");
//        handleParentSubMenu(parentLocator,childLocator);
//	}
//	public static void handleParentSubMenu(By parentLocator, By childLocator) {
//		 Actions act= new Actions(driver);
//		 act.moveToElement(driver.findElement(parentLocator)).perform();//selenium4.x
//		 driver.findElement(childLocator).click();
	}

}
