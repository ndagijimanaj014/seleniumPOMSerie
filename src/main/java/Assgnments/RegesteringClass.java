package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegesteringClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		// driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("ndagijimana");
		driver.findElement(By.id("input-email")).sendKeys("damasiture@gmailcom");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abc123");
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/input")).click();
		// Thread.sleep(3000);

		//driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/input")).click();
		
		
	}

}
