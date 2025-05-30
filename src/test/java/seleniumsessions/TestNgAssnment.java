package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;

public class TestNgAssnment {
	WebDriver driver;
@BeforeMethod
public void setUp() {
 driver= new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
 
}
@Test
public void loginPageTitleTest() {
	String title=driver.getTitle();
	System.out.println(" loginpage title:"+title);
	Assert.assertEquals(title,"Register Account");
	
}
@Test
public void loginPageUrlTest() {
	String url=driver.getCurrentUrl();
	System.out.println(" loginpage title:"+url);
	Assert.assertTrue(url.contains("naveenautomationlabs.com"));
	
}
@Test
public void loginPageLogoTest() {
	Boolean flag=driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
	System.out.println(" login page logo:"+flag);
	Assert.assertEquals(flag,true);
}
@Test
public void AssertAccountTest() {
	String account = driver.findElement(By.xpath("//a[text()='Account']")).getText();
	System.out.println("Assert account:"+account);
	Assert.assertEquals(account,"Account");
}
@Test
public void registerAccountLoginTest() {
	driver.findElement(By.id("input-firstname")).sendKeys("peter");
	driver.findElement(By.id("input-lastname")).sendKeys("selenimu");
	driver.findElement(By.cssSelector("#input-email")).sendKeys("john@gmail.com");
	driver.findElement(By.id("input-telephone")).sendKeys("3445656777878");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.id("input-confirm")).sendKeys("abc123");
	driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//input[contains(@class,'btn ')]")).click();
}
@AfterMethod
public void closingBrowser() {
	driver.close();
	driver.quit();
}

}
