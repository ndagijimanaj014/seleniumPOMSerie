package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropDragHandlingExercises {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement dragelement = driver.findElement(By.id("draggable"));
		WebElement dropelement = driver.findElement(By.id("droppable"));
		Actions act= new Actions(driver);
		act.dragAndDrop(dragelement, dropelement).release().build().perform();

	}

}
