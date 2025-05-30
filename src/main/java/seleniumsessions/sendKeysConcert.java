package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ImmutableBiMap.Builder;

public class sendKeysConcert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		// driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("John");
		// driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Damos");
		String firstname = "Damos";
		String lastname = "John";
		String Destination = "SDET";
		StringBuffer sf = new StringBuffer("Testing");
		StringBuilder sb = new StringBuilder("Automation");

		driver.findElement(By.id("input-firstname")).sendKeys(firstname, " ", lastname, " ", Destination, " ", "Amazon",
				" ", sb, " ", sf);
	}

}
