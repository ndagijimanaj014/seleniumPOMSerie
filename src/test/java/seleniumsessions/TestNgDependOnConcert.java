package seleniumsessions;

import org.testng.annotations.Test;

public class TestNgDependOnConcert {
	@Test(priority=1,description="searchTest")
	public void searchTest() {
		System.out.println("search test");
	}
	@Test(dependsOnMethods="searchTest",description="addToCarTest")
	public void addToCarTest() {
		System.out.println(" addToCarTest");
	}
	@Test(dependsOnMethods="searchTest",description="checkoutTest")
	public void checkoutTest() {
		System.out.println("checkoutTest");
	}
}
