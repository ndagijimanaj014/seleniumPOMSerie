package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//html tag= select
		//select
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		By searchField=By.id("APjFqb");
		By suggestion= By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		doSearch(searchField,"best cleanest city",suggestion,"best cleanest city in africa");
//		driver.findElement(By.id("APjFqb")).sendKeys("best cleanest city ");
//		Thread.sleep(3000);
//		List<WebElement> suggestionlist = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		System.out.println(suggestionlist.size());
//		for(WebElement e:suggestionlist) {
//			String listtext = e.getText();
//			System.out.println(listtext);
//			if(listtext.contains("best cleanest city in africa")) {
//				e.click();
//				
//				break;
//				
//				
//				
//			}
//			
//			
//		}
		

}
	
	public static void doSearch(By searchField,String searchkey,By suggestion,String value) {
		driver.findElement(searchField).sendKeys(searchkey);
		List<WebElement> suggestionList = driver.findElements(suggestion);
		for(WebElement e:suggestionList) {
			String text = e.getText().trim();
			System.out.println(text);
			if(suggestionList.equals(value)) {
				e.click();
				break;
				
			}
			
		}
		
	}
	
}
