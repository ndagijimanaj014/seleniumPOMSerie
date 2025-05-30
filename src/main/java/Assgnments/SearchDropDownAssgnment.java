package Assgnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchDropDownAssgnment {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.thenextgenautomation.com/");
//		driver.findElement(By.name("q")).sendKeys("iphone 15");
//		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='eIPGRd']']"));
//		for(WebElement e:elements) {
//			String text = e.getText();
//			if(text.contains("iphone 15 case")) {
//				e.click();
//				System.out.println(text);
//				break;
//				
//			}
//			
//		}
		List<WebElement>footlinks = driver.findElements(By.xpath("//div[@class='kn76TK']//a"));
		System.out.println(footlinks.size());
		for(WebElement e:footlinks) {
         String text = e.getText().trim();
			System.out.println(text);
//			if(text.contains("Online  Live Training")) {
//				e.click();
//				break;
//				
//			}
			
			
		}
//		By footelinks=By.xpath("//div[@class='kn76TK']");
//		
//		doclick(footelinks);
//		
//	}
//	public static void doclick(By locator) {
//		List<WebElement>links=driver.findElements(locator);
//		System.out.println(links.size());
//		for(WebElement e:links) {
//			String text = e.getText().trim();
//			System.out.println(text);
//			
//			
//		}
//		
}
	

}
