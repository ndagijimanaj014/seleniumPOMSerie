package myTestTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumsessions.BrowserException;

public class BaseTest {
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeTest
	public void setUp(String browsername,String url) {
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "safari":
			driver= new SafariDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;

		default:
			System.out.println(" please pass the right browser"+browsername);
			throw new BrowserException("WRONG BROWSER PASSED");
			
		}
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
	
		 
		}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
