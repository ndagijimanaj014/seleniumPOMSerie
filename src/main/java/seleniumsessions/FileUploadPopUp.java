package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
//type="file"mandetory(have to be there)
		driver.findElement(By.xpath("//input[@id='upload']")).sendKeys("\\Users\\damas\\OneDrive\\Desktop\\2021-11-07--SQL_Training_Class_4.pptx\\");
		//AUt It:Windows---not recommanded
		//sikuli:lib:images
	}

}
