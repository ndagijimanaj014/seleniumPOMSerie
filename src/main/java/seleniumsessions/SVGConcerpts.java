package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGConcerpts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		//SVG:Scalable Vector Graphics
		//normal xpath will not work for SVG
		//SVG->LOCAL-NAME()='SVG';
		//SVG->[NAME()='svg'];
		driver= new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
				//driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
				//driver.findElement(By.xpath("(//*[name()='svg'])[15]")).click();
				// //*[name()='path']
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		//driver.findElement(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']")).click();
	////*[local-name()='svg' and @id='map-svg']
		//driver.switchTo().frame("map-instance-23737");
		Thread.sleep(3000);
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
//		String statename = driver.findElement(By.xpath("//*[name()='svg']//*[name()='g'and@id='texas']")).getText();
//		System.out.println(statename);
		////*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		String value="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> listofstate = driver.findElements(By.xpath(value));
		System.out.println(listofstate.size());
		for(WebElement e:listofstate) {
			String statename = e.getAttribute("name");
			if(statename.equals("Arizona")) {
				e.getText();
				break;
			}
			System.out.println( statename);
			
		}
		

	}

}
