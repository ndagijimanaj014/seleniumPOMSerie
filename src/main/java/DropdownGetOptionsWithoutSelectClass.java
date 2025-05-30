import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class DropdownGetOptionsWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		//1.select value from dropdown without using select class METHOD:by index,by value, by visibletext
		//2.select value from dropdown without using select CLASS
		// 3.how deselect Element from dropdown
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		//1.By country=By.id("Form_getForm_Country");//1.
		By country=By.xpath("//select[@id='Form_getForm_Country']/option");//2./direct,//indirect
		ElementUtil util= new ElementUtil(driver);
		//util.selectValueFromDropDown(country,"Rwanda  ");
		util.selectValueFromDropDownWithoutSelectClass(country," Kenya");
}

	
}
