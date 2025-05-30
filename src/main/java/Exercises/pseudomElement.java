package Exercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pseudomElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
String lastnamecontent=" return window.getComputedStyle(document.querySelector(\"label[class='col-sm-2 control-label'\"),'::before').getPropertyValue('content');";
JavascriptExecutor js= (JavascriptExecutor)driver;
String content=js.executeScript(lastnamecontent).toString();
System.out.println(content);
if(content.contains("* " )) {
	System.out.println(" this field is mandotory");
	
}
	}

}
