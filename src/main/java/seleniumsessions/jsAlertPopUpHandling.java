package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsAlertPopUpHandling {
static WebDriver driver;
	public static void main(String[] args) {
		//JS Alert:
		//1.alert
		//2.confirm
		//3.prompt
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert= driver.switchTo().alert();//noAlertPresentException: no such alert
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept();//okay
//		alert.dismiss();//remove the alert
		//By Alert=By.xpath("//button[text()='Click for JS Alert']");
		//By confirm=By.xpath("//button[text()='Click for JS Confirm']");
		By Alert=By.xpath("//button[text()='Click for JS Alert']");
		//By Prompt=By.xpath("//button[text()='Click for JS Prompt']");
		doAlert(Alert);
        // doAlert(confirm);
         //doAlert(Prompt);
	}
	public static void doAlert(By locator) {
		driver.findElement(locator).click();
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//alert.sendKeys("God is Good");
		alert.accept();
		//alert.dismiss();
		
	}

}
