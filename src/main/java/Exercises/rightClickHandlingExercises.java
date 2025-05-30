package Exercises;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickHandlingExercises {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");//overloaded
	//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");//not overloaded
      Actions act= new Actions(driver);
      act.contextClick(driver.findElement(By.xpath("//span[contains(@class,'btn ')]"))).build().perform();
      List<WebElement> optionlist = driver.findElements(By.cssSelector("ul[class*='context']"));
      for(WebElement e: optionlist) {
    	  String text=e.getText();
    	  System.out.println(text);
    	  if(text.contains("Copy")) {
    		  e.click();
    		  Alert alert= driver.switchTo().alert();
    		  Thread.sleep(3000);
    		  alert.accept();
    		  break;
    		  
    	  }
    	  
      }

	}

}
