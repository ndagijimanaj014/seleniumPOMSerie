package Assgnments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssgnmentDropDownMultipleSelectAndDeselect {
	static WebDriver driver;

	public static void main(String[]args){
		driver= new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"post-291\"]/div"));
		Select select= new Select (elements );
		if(select.isMultiple()) {
			select.selectByValue("American");
			select.selectByValue("Lesser");
			select.deselectByValue("Lesser");
			//select.deselectAll();
			
		}
	}

}
