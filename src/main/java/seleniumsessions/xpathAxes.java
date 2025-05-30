package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxes {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		//driver.get("https://www.orangehrm.com/en/contact-sales");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//td[@class='left']//ancestor::tr//input[@id='ohrmList_chkSelectRecord_2']")).click();
		//driver.findElement(By.xpath("//a[text()='John.Smith']//ancestor::tr//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/ancestor::tr//input[@type='checkbox']")).click();
//driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']")).click();
//		WebElement joldanstatus = driver.findElement(By.xpath("//tr[@class]//td[text()='Enabled']"));
//		System.out.println(joldanstatus.getText());
//		WebElement username = driver.findElement(By.xpath("(//tr[@class])//a[text()='John.Smith']"));
//		System.out.println(username.getText());
//		WebElement element = driver.findElement(By.xpath("(//select[@class='dropdown'])/option[last()-230]"));
//		System.out.println(element.getText());
		//parent to child:  direct:/;indirect://
		//div[@class='form']/input
		//div[@id='account-login']//form//input
		//div[@id='contect']/div...1
		//div[@id='contect']//div...7
		//select[@id='for-getform-country']/option....233
		//select[@id='for-getform-country']//option....233
		//(//div[@class='form-group']//label)[1]
		//(//div[@class='form-group']//label)[2]
		//(//div[@class='form-group required']//label)[3]
		// div[@id]//a[text()='my account']
//a[text()='joe.Root']/parent::td/following-sibling::td/input
		//BACKWARD IN XPATH
		//input[@id='input-password']/..
		//input[@id='input-password']/parent::div
		//option[@value='Angola']/parent::select
		//option[@value='Angloa']/ancestor::form
		//input[@id='input-password']/ancestor::form
		//a[text()='joe.Root']/parent::id/parent::tr/td/input
		//a[text()='joe.Root']/parent::id/parent::tr/td//input
		//a[text()='joe.Root']/parent::td/preceding-sibling::td/input
		//a[text()='joe.Root']/ancestor::tr//input[@type='checkbox']
//ASSGNMENT
//(//td[text()='Enabled']//ancestor::tr//input)[4]
//(//td[@class='left']//ancestor::tr//input[@type='checkbox'])[4]
////td[@class='left']//ancestor::tr//input[@id='ohrmList_chkSelectRecord_2']
//odd/even in xpath
// 	EVEN :(//select[@class="dropdown"]/option)[position() mod 2=0]
// ODD:(//select[@id='Form_getForm_Country']/option)[position() mod 2=1]
// union operator in xpath:
////footer//h5|//footer//a
////footer//h5|//footer//a//footer//p
//footer//h5/ancestor::footer//a[text()='Brands']
//h5[text()='Extras']/following-sibling::ul//a[text()='Brands']


		
		
		

	}

}
