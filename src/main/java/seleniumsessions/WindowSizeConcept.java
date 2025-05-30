package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	//driver.manage().window().maximize();
	//driver.manage().window().minimize();
	//driver.manage().window().fullscreen();
	Dimension dim= new Dimension(390,844);
	driver.manage().window().setSize(dim);

	}

}
