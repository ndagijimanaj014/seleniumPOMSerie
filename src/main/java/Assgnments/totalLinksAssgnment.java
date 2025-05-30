package Assgnments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinksAssgnment {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		List<WebElement>linktext=driver.findElements(By.tagName("a"));
//		System.out.println(linktext.size());
//		for(int i=0;i<linktext.size();i++) {
//			
//			String text=linktext.get(i).getText();
//			if(text.length()!=0) {
//				
//			System.out.println(text);
//		} 		
//		
//		}
		By links=By.tagName("a");
		By image=By.tagName("img");
		List<WebElement>totaltext=getElements(links);
		//System.out.println(totaltext);
		System.out.println("the total number of link are:"+getLinksCount(links));
		System.out.println("the total number of image are:"+getImageCount(image));
		System.out.println("the list of link text are:"+getLinksTextList(links));
		
		
			
		}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int getLinksCount(By locator) {
		return getElements(locator).size();
	}
	public static int getImageCount(By locator) {
		return getElements(locator).size();
	}
	public static List<String> getLinksTextList(By locator) {
		List<WebElement>linktext=getElements(locator);
		List<String> totallinks=new ArrayList<String>();
		for(WebElement e:linktext) {
			String text=e.getText();
			if(text.length()!=0) {
				totallinks.add(text);
				
			}
			
			
			
		}
		return totallinks;
		
	}

	}


