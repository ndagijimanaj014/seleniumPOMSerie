package seleniumsessions;


import org.testng.annotations.Test;

public class TestNgPriorityConcert {
	@Test(priority= 1, description="search test")
	public void searchTest() {
		System.out.println("search test");
	}
	@Test(priority= 4, description=" addToCarTest")
	public void addToCarTest() {
		System.out.println(" addToCarTest");
	}
	@Test(priority= 5, description="checkoutTest")
	public void checkoutTest() {
		System.out.println("checkoutTest");
	}
	@Test
	public void paymentTest() {
		System.out.println("paymentTest");
	}
	@Test(priority= 6)
	public void orderTest() {
		System.out.println("order test");
	}
	@Test(priority= 3)
	public void deliveryTest() {
		System.out.println("delivery test");
	}
	
}
