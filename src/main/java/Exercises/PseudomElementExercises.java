package Exercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudomElementExercises {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		String jscript=" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color')";
		String jsscript1=" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String color= js.executeScript(jscript).toString();
		System.out.println(color);
		if("rgb(255, 0, 0)".contains(color));
		System.out.println("the element is mandetory");
		String content=js.executeScript(jsscript1).toString();
		System.out.println(content);
		if(content.contains("\"* \"")) {
			System.out.println("the element is mandetory");
		}
	}

}
