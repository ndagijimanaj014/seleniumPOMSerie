package Assgnments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assngnment {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new EdgeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("main");
		String text = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(text);
		driver.switchTo().frame(5);
		String text2 = driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();
		System.out.println(text2);
//		List<WebElement>links=driver.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		for(WebElement e:links) {
//			String totallinks=e.getText();
//			
//			if(totallinks.length()!=0) {
//				
//				System.out.println(totallinks);
//			}
			
//			
//		}
//	public static  List<WebElement> getElements(By lacator) {
//		return driver.findElements(lacator);
//		
//		
//	}
//	public static String GetAtribute(By locator,String value) {
//		return driver.findElement(locator).getAttribute(value);
//	}
//	public static  int getLinkCount(By locator) {
//		return getElements(locator).size();
//	}
//	public static  int getImagecount(By locator) {
//		return getElements(locator).size();
//	}
//	public static List<String> getTotalLinks(By locator) {
//		List<WebElement>links=getElements(locator);
//		List<String>text=new ArrayList<String>();
//		for(WebElement e:links) {
//			String a=e.getText();
//			if(a.length()!=0) {
//				text.add(a);
//				
//			}
//			
//			
//		}
//		return text;
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	
	}
	public static  void GetAttributeImage(By locator,String AtributeName) {
		List<WebElement>imagelist=getElements(locator);
		for(WebElement e:imagelist) {
			String image=e.getAttribute(AtributeName);
			if(image!=null) {
				System.out.println(image);
				
			}
			
			
		}
		
	}
	
}

