package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementHandlingExercises {

	public static void main(String[] args) {
		//hoverovermouse
		WebDriver driver= new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector(".menulink"))).build().perform();
		driver.findElement(By.xpath("(//a[text()='Courses'])[2]")).click();

	}

}
