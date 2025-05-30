package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
	//JavaScriptExecutor: is an interface ...........executescript();
     //Remotewebdriver (RWD)IMPLEMENTS JavaScriptExecutor;
	//Remotewebdriver (RWD)IMPLEMENTS  WebDriver and WebDriver Extends searchcontent
WebDriver driver= new ChromeDriver();
//driver.get("https://www.orangehrm.com/en/pricing");
driver.get("https://freecrm.com/en");
//driver.get("https://www.amazon.com/"
JavascriptExecutor js= (JavascriptExecutor)driver;

//String title=js.executeScript("return document.title").toString();
//System.out.println(title);
//String currenturl=js.executeScript("return document.URL").toString();
//System.out.println(currenturl);
JavaScriptUtil jsu= new JavaScriptUtil(driver);
String title=jsu.getTitleByJs();
System.out.println(title);
String url=jsu.getcurrentUrlByJs();
System.out.println(url);
//jsu.generateJsAlert("I am js Alert");
//jsu.generateJsConfirm("Im js alert");
//jsu.generateJsPrompt("i am tester","thanks");
String pagetext=jsu.getPageInnerText();
//System.out.println(pagetext);
//if(pagetext.contains("Advanced")) {
//	System.out.println("pass");
//	WebElement ele=driver.findElement(By.xpath("//p[text()='Calendar']"));
//	jsu.ScrollIntoView(ele);
}

	}


