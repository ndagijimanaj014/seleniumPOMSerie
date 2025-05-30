package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country=By.id("Form_getForm_Country");
		
			ElementUtil util= new ElementUtil(driver);
			
			List<String>optionlist=util.getDropDownOptionsList(country);
			System.out.println("list of country are:"+optionlist);
			
		}
}

