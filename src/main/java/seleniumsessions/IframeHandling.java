package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver= new ChromeDriver();
		driver.get("https://www.formsite.com/templates/example-form-templates/file-upload-example/");
		driver.findElement(By.cssSelector("img[alt='File Upload Demo Form']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		//driver.findElement(By.xpath("id=\"RESULT_FileUpload-1\"")).sendKeys("\"C:\\Users\\damas\\Downloads\\jenkins.msi\"");
		driver.findElement(By.cssSelector("#RESULT_TextField-2")).sendKeys("Jean");
		driver.findElement(By.cssSelector("input[name='RESULT_TextField-3']")).sendKeys("Qa Automation testing");
		driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-4']/option[text()='Bachelors Degree']")).click();
		
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-5_0']")).click();
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-6_0']")).click();
		driver.findElement(By.cssSelector("textarea[class='text_field']")).sendKeys("Strong and faster runner for the new  technology.");
		driver.findElement(By.xpath("//input[@id='FSsubmit']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		String title = driver.findElement(By.xpath("//p[contains(text(),'Accept files')]")).getText();
		System.out.println(title);
	}

}
