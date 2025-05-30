package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcepts {
static WebDriver driver;
	public static void main(String[] args) {
driver= new ChromeDriver();
//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//WebElement pvcy=driver.findElement(By.xpath("//input[@name='agree']"));
//String text=driver.findElement(with(By.xpath("//a[@class='agree']")).toLeftOf(pvcy)).getText();
//System.out.println(text);
//driver.findElement(with(By.xpath("//input[@type='submit']")).toRightOf(pvcy)).click();
WebElement Register=driver.findElement(By.xpath("//strong[text()='Register Account']"));
String customer=driver.findElement(with(By.tagName("h2")).above(Register)).getText();
System.out.println(customer);
driver.findElement(with(By.className("btn-primary")).below(By.xpath("//strong[text()='Register Account']"))).click();
	}

}
