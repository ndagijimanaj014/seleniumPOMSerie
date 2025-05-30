import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class GetTextConcert {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		//String forgotlink=driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[3]")).getText();
		//System.out.println(forgotlink);
		//String pagetitle=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h2")).getText();
		//System.out.println(pagetitle);
		//String header=driver.findElement(By.xpath("//*[@id=\"form-login\"]/h2")).getText();
           //   System.out.println(header);
		By forgotlink=By.xpath("//*[@id=\"column-right\"]/div/a[3]");
		By pagetitle=By.xpath("//*[@id=\"content\"]/div/div[1]/div/h2");
        By header=By.xpath("//*[@id=\"form-login\"]/h2");
		ElementUtil ut= new ElementUtil(driver);
		String param=ut.doGetText(pagetitle);
		System.out.println(param);
		String head=ut.doGetText(header);
		System.out.println(head);
		String linktext=ut.doGetText(forgotlink);
		System.out.println(linktext);
	}

}
