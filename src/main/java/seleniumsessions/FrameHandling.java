package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
	  driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='main']")));
		String title = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(title);
		driver.switchTo().defaultContent();//back to page

	}

}
