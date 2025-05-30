package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
	
		driver.switchTo().frame("pact1");
		driver.findElement(By.cssSelector("input#inp_val")).sendKeys("testing");
		driver.switchTo().frame("pact2");

		driver.findElement(By.cssSelector("input#jex")).sendKeys(" TDD with ");
		
				driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("input#inp_val")).sendKeys(" is a life");
		driver.switchTo().frame("pact2");
		driver.findElement(By.cssSelector("input#jex")).sendKeys(" Selenium Web Driver");
		driver.switchTo().frame("pact3");
		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("Automation");
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.xpath("//h3[text()='Memory Test']")).getText();
		System.out.println(text);
		driver.switchTo().frame("pact1");
		driver.switchTo().frame("pact2");
		String text2 = driver.findElement(By.xpath("//h4[text()='Heaven is here']")).getText();	
		System.out.println(text2);
		//page-->f1:yes
		//f1-->f2:yes
		//f2-->f3:yes
		//page-->f2:no
		//page-->f3:no
		//page-->f1-->f2-->f3:yes
		//f3-->f2-->f1-->page:parentframe()
		//f3-->defaultcontent()-->page
		
		
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("Automation");
//		driver.switchTo().parentFrame();
//     	driver.findElement(By.cssSelector("input#jex")).sendKeys(" is good");
//     	driver.switchTo().frame("pact2");
//		driver.findElement(By.cssSelector("input#jex")).sendKeys("Selenium");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.cssSelector("input#inp_val")).sendKeys(" is a life ");
		;
	}

}
