package Assgnments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class addToCart {
	static WebDriver driver;

	public static void main(String[] args) {
	driver= new ChromeDriver();
	driver.navigate().to("https://demo.opencart.com/en-gb?route=account/register");
	By opencart=By.xpath("//*[@id=\"logo\"]/a/img");
	ElementUtil el = new ElementUtil(driver);
	el.doClick(opencart);
	driver.navigate().to("https://demo.opencart.com/en-gb?route=common/home");
	By laptop=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img");
	el.doClick(laptop);
	
	By laptopAddtocart=By.xpath("//*[@id=\"button-cart\"]");
	el.doClick(laptopAddtocart);
	driver.navigate().back();
	By iphone=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a/img");
	el.doClick(iphone);
	By iphoneAddtocart=By.xpath("//*[@id=\"button-cart\"]");
	el.doClick(iphoneAddtocart);
	//driver.navigate().back();
//	By tables=By.xpath("//*[@id=\"column-left\"]/div[1]/a[4]");
//	el.doClick(iphone);
//	driver.navigate().to("https://demo.opencart.com/en-gb/catalog/tablet");
//	By tabletscategory=By.xpath("//*[@id=\"product-list\"]/div/div/div[1]/a/img");
//	el.doClick(tabletscategory);
//	By tabletAddtocart=By.xpath("//*[@id=\"button-cart\"]");
//	el.doClick(tabletAddtocart);
//	driver.navigate().back();
//	By category=By.xpath("//*[@id=\"menu\"]/button");
//	el.doClick(category);
//	By cameras=By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img");
//	el.doClick(cameras);
	//By camerasaddtocart=By.xpath("//*[@id=\"button-cart\"]");//dropdown option
	//el.doClick(camerasaddtocart);
	
	
	
	
	
	}

}
