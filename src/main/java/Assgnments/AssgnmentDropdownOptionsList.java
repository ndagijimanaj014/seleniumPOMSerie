package Assgnments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssgnmentDropdownOptionsList {

	static WebDriver driver;

	public static void main(String[]args){
		driver= new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/en/contact-sales");
		By country=By.id("Form_getForm_Country");
		
		//List<String> dropDownCountryList = DropDownCountryList(country,"Rwanda");
		//System.out.println("list of country"+dropDownCountryList);
		DropDownCountryList(country,"Rwanda");
		
		
		
	}
	 public static  WebElement getElement(By locator) { 
		  return driver.findElement(locator);
	  
	  }
	public static void DropDownCountryList(By locator,String value) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> countrylist = select.getOptions();
		System.out.println(countrylist.size());
		//List<String>listtext=new ArrayList<String>();
		for(WebElement e:countrylist) {
			String text = e.getText().trim();
			if(text.contains(value)) {
				e.click();
				break;
				
			}
			
			
			//System.out.println(text);
			//listtext.add(text);
		
	}
		//return listtext;
		
		
		
	}
}
