package myTestTestNg;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountRegisterPageTest extends BaseTest {
	public String getRandomEmailId() {
		//String emailId="abc"+System.currentTimeMillis()+"@gmail.com";
		String emailId="abc"+UUID.randomUUID()+"@gmail.com";
		
		return emailId;
	}
	@DataProvider
	public Object[][] getTestData() {
		return new Object[][] {
			{"John","Ndagijimana","abc@gmail.com","37465757","abc123"},
			{"Olivier","Tster","Tester@gmail.com","37465757","ol123"},
			{"peter","kamasa","kama@gmail.com","37465444","ka123"},
		};
	}
	@Test(dataProvider="getTestData")
public void registerTest(String firstname,String lastname,String telephone,String password) {
	driver.findElement(By.id("input-firstname")).sendKeys(firstname);
	driver.findElement(By.id("input-lastname")).sendKeys( lastname);
	driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
	driver.findElement(By.id("input-telephone")).sendKeys(telephone);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.id("input-confirm")).sendKeys(password);
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//input[contains(@class,'btn ')]")).click();
	String text = driver.findElement(By.xpath("//h1[text()='Register Account']")).getText();
	System.out.println(text);
	Assert.assertEquals(text,"Your Account Has Been Created!");
	driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.linkText("Register")).click();
}
}
