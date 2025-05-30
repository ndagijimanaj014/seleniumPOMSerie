package Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
	String parentwindowid = driver.getWindowHandle();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.switchTo().newWindow(WindowType.TAB);
	//driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//child
System.out.println(driver.getCurrentUrl());
driver.get("https://www.amazon.com/");
System.out.println(driver.getTitle());
	}

}
