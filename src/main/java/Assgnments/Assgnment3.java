package Assgnments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnment3 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		String parentwindowid=driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowsId=it.next();
			System.out.println("windows id :"+windowsId);
			driver.switchTo().window(windowsId);
			if(!parentwindowid.equals(windowsId)) {
				System.out.println(driver.getCurrentUrl());
				driver.close();
					
			}
			
			
		}
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
		
			
			
		
	}
}
