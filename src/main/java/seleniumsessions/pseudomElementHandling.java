package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudomElementHandling {

	public static void main(String[] args) {
		//pseudo classes
		//::before
		//::after
		//::has
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String firstnamejscontent="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content');";
        String firstnameJsColor=" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color');";
        String telephoneJsweight="return window.getComputedStyle(document.querySelector(\"label[for*='telephone']\"),'::before').getPropertyValue('font-weight');";
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String Mand_fieldText=js.executeScript(firstnamejscontent).toString();
        System.out.println( Mand_fieldText);
        if(Mand_fieldText.contains("*")) {
        	System.out.println("this field is mandetory");
        	
        }
		String color=js.executeScript(firstnameJsColor).toString();
		System.out.println(color);
		if(color.contains("rgb(255, 0, 0)")) {
			System.out.println("firstname contains redcolor");
			
		}
		String weight=js.executeScript(telephoneJsweight).toString();
		System.out.println(weight);
        
	}

}
