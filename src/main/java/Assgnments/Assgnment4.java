package Assgnments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assgnment4 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Set<String> parentwindowid = driver.getWindowHandles();
		String parentWindowId=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowId=it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			
			if(!parentWindowId.equals(windowId)) {
				driver.close();
			}
			
			
			
		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		}
	}			


