package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {

	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		By hrefvalue=By.xpath("//*[@id=\"column-right\"]/div/a[3]");
		By Emailid=By.xpath("//*[@id=\"input-email\"]");
		By Password=By.xpath("//*[@id=\"input-password\"]");
		ElementUtil el= new ElementUtil(driver);
		String getAttribute=el.doAttributeValue(hrefvalue,"href");
		System.out.println(getAttribute);
		String Email=el.doAttributeValue(Emailid,"id");
		System.out.println(Email);
		String password=el.doAttributeValue(Password,"name");
		System.out.println(password);
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ndagijimana@gmail.com");
		String getvalue=el.doAttributeValue(Emailid, "value");
		System.out.println(getvalue);
		By passwordvalue=By.xpath("//*[@id=\"input-password\"]");
		el.dosendkeys(passwordvalue,"abc123");
		String PasswordValue=el.doAttributeValue(passwordvalue,"value");
		System.out.println(PasswordValue);
	}

}
