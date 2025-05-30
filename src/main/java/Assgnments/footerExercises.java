package Assgnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerExercises {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
         //driver.findElement(By.name("q")).sendKeys("university");
         driver.findElement(By.name("q")).sendKeys("iphone");
         Thread.sleep(3000);
       // driver.findElement(By.xpath("(//ul[@class='_1XxPhZ'])/a[6]")).click();
         List<WebElement> elements = driver.findElements(By.xpath("(//ul[@class='_1XxPhZ'])/a"));
         System.out.println(elements.size());
 //driver.findElement(By.xpath("//ul[@class='G43f7e']//div[@id='ERWdKc']")).click();
// Thread.sleep(3000);
//         List<WebElement>Universitylist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])//div[3]/span"));
//         System.out.println(Universitylist .size());
//         for(WebElement e:Universitylist) {
//             String text = e.getText().trim();
//    			System.out.println(text);
//        	
//        	 
//         }
//         
	}

}
