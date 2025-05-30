package Exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowhandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();//child
	//fetch window ids
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String parentid=it.next();
	System.out.println(" parent window id is:"+parentid);
	String childid=it.next();
	Thread.sleep(5000);
	System.out.println(" child window id is:"+childid);
	//switch to window
	driver.switchTo().window(childid);
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	driver.close();
	driver.switchTo().window(parentid);
	System.out.println(driver.getTitle());
	
	
	
	}

}
