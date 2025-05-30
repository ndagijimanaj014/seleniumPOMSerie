package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assnments2 {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
//		 1.Write a program to check if Continue button is displayed on page
//
//		  2.Write a program to count occorrence of login button
//
//		  3.Write a program to print all the link  text available at right side in the login page
//
//		  4.Write a program to find elements on the page i.a password
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flag = driver.findElement(By.linkText("Continue")).isDisplayed();
//	System.out.println(flag);
		//By continuebutton = By.linkText("Continue");
		By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/form/input"));
//		if(doIsDisplay(continuebutton)) {
//			System.out.println(true);
//			
//		} else {
//			System.out.println(false);
//		}
//		
		
		doIsDisplay(login);
		}
	public static WebElement getElement(By lacator) {
		return driver.findElement(lacator);
	}
	public static boolean doIsDisplay(By lacator) {
		try {
		boolean flag = getElement(lacator).isDisplayed();
	
		System.out.println("is  displayed on page");
		return true;
		}
		catch(NoSuchElementException e) {
			System.out.println("is not displayed on page");
			
		}
		return false;
	}


}
