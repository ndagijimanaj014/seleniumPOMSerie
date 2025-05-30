package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class AssgnmentDropDownValueWithoutSelectMethod {

	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		//html tag= select
		//select
		 driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country=By.xpath("//*[@id=\"Form_getForm_Country\"]");
		Thread.sleep(3000);
		ElementUtil ut= new ElementUtil(driver);
		ut.selectValueFromDropDownWithoutSelectClass(country,"Rwanda");
		//dropdownValue(country,"Rwanda");
		

	
	}
//	public static WebElement getElement(By locator) {
//		
//		return driver.findElement(locator);
//		
//	}
//	public static void dropdownValue(By locator,String value) {
//		 List<WebElement>elements = driver.findElements(locator);
//		
//		for(WebElement e:elements) {
//			String text = e.getText().trim();
//			if(text.equals(value)) {
//				e.click();
//				break;
//				
//			}
//			
//		}
//		}
//		
//		
		
		
	}

