package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisteringTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		By register=By.linkText("Register");
		//String value=driver.findElement(By.tagName("h1")).getText();
		By firstname=By.xpath("//*[@id=\"input-firstname\"]");
		//driver.findElement(By.xpath("//*[@id=\"account\"]/div[1]/label")).sendKeys("Jean damascene");
		
		//By lastname=By.id("input-lastname");
		//By EmailId=By.id("input-email");
		//By Password=By.id("input-password");
		//By nextstep =By.partialLinkText("Login");
		
		RegisterUtil reg= new RegisterUtil(driver);
		reg.doclick(register);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]//*[@id=\"column-right\"]/div/a[2]")).sendKeys("Jean damascene");
		
		reg.doSendkeys(firstname,"Jean Damascene");
		//reg.doSendkeys(lastname,"Ndagijimana");
		//reg.doSendkeys(EmailId,"Damasiture@gmail.com");
		//reg.doSendkeys(Password,"abc123");
		//reg.doclick(nextstep);

	}

}
