package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\damas\\OneDrive\\Documents\\seleniumchromeDriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();

	}

}
