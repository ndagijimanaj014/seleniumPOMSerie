package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumBasics {

	public static void main(String[] args) {
		// automation steps:
		// 1.open browser

		//WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();

		 WebDriver driver = new FirefoxDriver();
		// 2.enter url:
		driver.get("https://www.google.com");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		// 3.validation point/checkpoint

		if (pagetitle.equals("Google")) {
			System.out.println("pagetitle is correct");

		} else {
			System.out.println("pagetitle is not correct");

		}
		// Automation steps+validation point/checkpoint = Automation testing
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("https://www.google.com")) {
			System.out.println("url is correct");

		} else {
			System.out.println("url is incorrect");
		}
		//driver.quit();
		// driver.close();

	}

}
