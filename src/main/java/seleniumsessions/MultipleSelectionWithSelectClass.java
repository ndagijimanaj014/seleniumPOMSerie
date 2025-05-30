package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		// 3.how deselect Element from dropdown
		
		driver= new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement dropdownele = driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"));
		Select select= new Select (dropdownele );
		if(select.isMultiple()) {
			select.selectByValue("American");
			select.selectByValue("Lesser");
			select.deselectByValue("Lesser");
			//select.deselectAll();
			
			
		}
}
}