package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinks {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//By link=By.tagName("a");
		By image=By.tagName("img");
		Thread.sleep(3000);
	
		ElementUtil el= new ElementUtil(driver);
		el.getAtributeImages(image,"src");
//		int totallink=el.getlinkscount(link);
//		int totalimage=el.getimagescount(image);
//		System.out.println("the total links:"+totallink);
//		System.out.println("the total images:"+totalimage);
//	    List<String>linktext=el.getLinksText(link);
//		System.out.println("the total link text:"+linktext);		
//		String attributeimage=el.doAttributeValue(image,"src");
//		System.out.println("the Atribute Images available:"+attributeimage);
		
	}

}
