package Exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMultipleHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
	String parentWindowId=driver.getWindowHandle();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
	driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
	driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
	driver.findElement(By.xpath("(//a[@target='_blank'])[4]")).click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	while(it.hasNext()) {
		String WindowId=it.next();
		System.out.println(" window id is:"+WindowId);
		Thread.sleep(3000);
		driver.switchTo().window(WindowId);
		if(!parentWindowId.equals(WindowId)) {
			System.out.println(driver.getCurrentUrl());
			driver.close();
			

		}
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}
	
	
	}


}
