package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelectTest {
	static WebDriver driver;

	public static void main(String[] args) {
		//html tag= select
		//select
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country=By.id("Form_getForm_Country");
		By employee=By.id("Form_getForm_NoOfEmployees");
		ElementUtil util= new ElementUtil(driver);
//		util.doSelectByIndex(country,5);
//		util.doSelectByIndex(employee, 3);
//		util.doSelectVisibleText(country,"Kenya");
//		util.doSelectVisibleText(employee,"11 - 50");
		util.doSelectValue(country,"Rwanda");
		util.doSelectValue(employee,"200 - 1,000");

}
	
}
