package myTestTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	@Test(description="checking login page title..",priority=1)
	public void loginPageTitleTest() {
		
		String title=driver.getTitle();
		System.out.println(" loginpage title:"+title);
		Assert.assertEquals(title,"Google","title is not matching...");
		
	}
	@Test(description="checking login page Url.....",priority=2)
	public void loginPageUrlTest() {
		String url=driver.getCurrentUrl();
		System.out.println(" loginpage title:"+url);
		Assert.assertTrue(url.contains("google"),("url is not matching....."));
		
	}
}
