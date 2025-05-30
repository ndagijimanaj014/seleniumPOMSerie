package Assgnments;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssgnmentTheNexGenAutomationForm {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver= new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("thenextgenautomation@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hsaveda$10");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Jean Damascene");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ndagijimana");
		driver.findElement(By.xpath("(//input[@name='value'])[1]")).sendKeys("Damasiture@gmail.com");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/div/div[1]/div/div[7]/div[2]")).click();
		//driver.findElement(By.xpath("//div[@id='main-content']/div/div[2]/div/div[1]/div/div[7]/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='three wide field']//div/input[@name='address']")).sendKeys("701 fort worth dr");
		driver.findElement(By.xpath("//div[@class='three wide field']//div/input[@name='city']")).sendKeys("Denton");
		driver.findElement(By.xpath("//div[@class='fields']//following::div/input[@name='state']")).sendKeys("tx");
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("76205");
		driver.findElement(By.xpath("//div[@class='two fields']//div/input[@name='position']")).sendKeys("QA Automation Testing");
		driver.findElement(By.xpath("//div[@class='two fields']/div//div/input[@name='department']")).sendKeys("Information and Technology");
		driver.findElement(By.xpath("(//input[@name='value'])[3]")).sendKeys("8067663124");
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("CST");
		driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("8067663124");
		driver.findElement(By.xpath("(//input[@class='search'])[1]")).sendKeys("The Next Gen Automation");
		//driver.findElement(By.xpath("//span[text()='Active']")).click();
		//driver.findElement(By.xpath("//div[@name='status']//div/span[text()='Active']")).click();
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
//	WebElement element = driver.findElement(By.xpath("(//div[@class='divider default text'])[3]"));
//		Select select= new Select(element);
//		select.selectByIndex(2);
//		By status=By.xpath("(//div[text()='Select'])[2]");
//		By country=By.xpath("(//i[@class='dropdown icon'])[7]");
//		ElementUtil ut= new ElementUtil(driver);
//		ut.doSelectValue(country,"United States");
		//ut.doSelectByIndex(status, 2);

	driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//(//i[@class='dropdown icon'])[3]
	//(//div[text()='Select'])[2]
//	Thread.sleep(300);
//
//	driver.findElement(By.xpath("//a[@href='/contacts']")).click();
//		
		
		

//	DoCheckBox("Jean Damascene Ndagijimana");
//	System.out.println(UserList("Jean Damascene Ndagijimana"));
//	
//	
//	}
//	public static void DoCheckBox(String username) {
//		driver.findElement(By.xpath("(//input[@name='"+username+"'])[1]")).click();
//	}
//	public static List<String> UserList(String username) {
//		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='"+username+"']"));
//		List<String> arrayList = new ArrayList<String>();
//		for(WebElement e:elements){
//			String text = e.getText();
//			//System.out.println(text);
//			arrayList.add(text);
//			
//		}
//		return arrayList; 
	}

}
