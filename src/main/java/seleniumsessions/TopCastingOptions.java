package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		//1. valid and recommended....LOCAL
		WebDriver driver= new ChromeDriver();
		//2.valid but not recommended...FINDELEMENT AND FINDELEMENTS.
		//SearchContext driver= new ChromeDriver();
		//3.valid and recommended......FOR REMOTE EXECUTION(AWS,Cloud server,Mv machine)
		//RemoteWebDriver driver= new ChromeDriver(remoteAdress,capabilities);
		//4.valid but not recommended...(work only 2 brwoser(CHROME AND EDGE).
		//ChromiumDriver driver= new ChromeDriver();
		//5.not valid
		//WebDriver driver= new RemoteWebDriver();
		//6.not valid
		//WebDriver driver= new ChromiumDriver();
		
		

	}

}
