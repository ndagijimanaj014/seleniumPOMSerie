package Assgnments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAlertAssgnment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(7));
       Alert alert = wait.until(ExpectedConditions.alertIsPresent());
       String text=alert.getText();
       System.out.println(text);
       alert.dismiss();
	}

}
