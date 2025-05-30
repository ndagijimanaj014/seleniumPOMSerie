package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAssgnment {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country=By.id("Form_getForm_Country");
		By employee=By.id("Form_getForm_NoOfEmployees");
		//Select dropcountry= new Select(driver.findElement(country));
		//dropcountry.selectByValue("Brazil");
//		Select dropemployee= new Select(driver.findElement(employee));
//		dropemployee.selectByValue("11 - 50");
		
		 Select dropcountry= new Select(driver.findElement(country)); 
		 dropcountry.selectByVisibleText("Algeria"); 
		 Select dropemployee=new Select(driver.findElement(employee)); //
		 dropemployee.selectByVisibleText("11 - 50");
//		 
//		dropcountry.selectByIndex(6);
//		Select dropemployee= new Select(driver.findElement(employee));
//		dropemployee.selectByIndex(4);
	
	}

}
