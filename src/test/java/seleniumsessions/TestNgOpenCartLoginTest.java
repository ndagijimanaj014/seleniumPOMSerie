package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgOpenCartLoginTest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		}
	
	@Test(description="checking login page title.....")
	public void loginPageTitleTest() {
		String title=driver.getTitle();
		System.out.println(" loginpage title:"+title);
		Assert.assertEquals(title,"Register Account","title is not matching...");
		
	}
	@Test(description="checking login page Url.....")
	public void loginPageUrlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(" loginpage title:"+url);
		Assert.assertTrue(url.contains("naveenautomationlabs.com"),("url is not matching....."));
		
	}
	@Test(description="checking login page logo.....")
	public void loginPageLogoTest() {
		Boolean flag=driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		System.out.println(" login page logo:"+flag);
		Assert.assertEquals(flag,true,"logo is not matching...");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}
