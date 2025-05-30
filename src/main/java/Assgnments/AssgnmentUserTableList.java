package Assgnments;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnmentUserTableList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		//driver.get("https://www.orangehrm.com/en/contact-sales");
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		By usertable=By.xpath("//th[@class='header']");
//		dousertable(usertable);
		By usertablelist=By.xpath("//td[@class=\"left\"]");
		Thread.sleep(3000);
		
		By checklist=By.xpath("//td[text()='ESS']/ancestor::tr//input");
		dousertable(usertablelist,checklist);
		//dousertable(checkbox);
	}
	public static List<String> dousertable(By locator,By checklist) {
		List<WebElement> elements = driver.findElements(locator);
		List<String>list=new ArrayList<String>();
		for(WebElement e:elements) {
			String text = e.getText();
			System.out.println(text);
		if(text.equals(checklist)) {
			e.click();
				break;
				//list.add(text);
			}
		

		}
		return list;
		
			
	}
	

}
