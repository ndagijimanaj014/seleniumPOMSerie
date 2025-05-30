package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	WebDriver driver;

	public WebDriver launchBrowser(String BrowserName) {
		System.out.println("thebrowsername:" + BrowserName);
		switch (BrowserName) {
		case "chromeDriver":
			driver = new ChromeDriver();

			break;
		case "EdgeDriver":
			driver = new EdgeDriver();

			break;
		case "safariDriver":
			driver = new SafariDriver();

			break;
		case "firefoxDriver":
			driver = new FirefoxDriver();

			break;

		default:
			System.out.println(" pass the right Browser:" + BrowserName);
			throw new BrowserException("INVALID BROWSER...." + BrowserName);

		}
		return driver;

	}

	public void launchurl(String url) {
		if (url == null) {
			throw new BrowserException("INVALID URL..." + url);

		}
		if(url.isEmpty()||(url.isBlank())) {
			throw new BrowserException("BLANK/EMPTY URL..."+url);
			
		}
		if(url.indexOf("https")==-1||url.indexOf("https")>0) {
			throw new BrowserException("HTTP(S) is missing or misplaced..."+url);
			
		}
		driver.get(url);

	}
	public String getPageTitle() {
		String title=driver.getTitle();
		if(title==null) {
			System.out.println("getting the null title...");
			return null;
		}
		//System.out.println(title);
		return title;
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void closeBrowser() {
		driver.close();
	}

}
