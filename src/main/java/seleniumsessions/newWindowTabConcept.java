package seleniumsessions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindowTabConcept {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		String parentwindowId = driver.getWindowHandle();
		//Set<String> windowHandles = driver.getWindowHandles();
		// selenimu 4.x
		driver.switchTo().newWindow(WindowType.WINDOW);//create a new blank window/tab and switch
		//driver.switchTo().newWindow(WindowType.TAB);//create a new blank window/tab and switch
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowId);
		System.out.println(driver.getTitle());
	}

}
