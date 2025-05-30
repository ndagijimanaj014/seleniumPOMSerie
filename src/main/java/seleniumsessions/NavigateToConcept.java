package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// go to url
		//backward
		//forward
		//refresh
		//driver.navigate : we can pass URL with new object while DRIVER.GET:you launch URL and you not hold it
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
		//driver.navigate().to(new URL("https://www.google.com"));// we us this URLtopass to another method.
	driver.navigate().to("https://www.Amazon.com");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.navigate().refresh();//not recommended sometimes
	System.out.println(driver.getTitle());
	

	}

}
