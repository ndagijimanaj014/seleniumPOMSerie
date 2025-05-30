package seleniumsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnotations {
    // global pre-cnditions
	//pre conditions
	//test steps+expect vs actual results
	//after steps
	//global after steps
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS..........connect with database");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT..........create user");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC..........launch Browser");
	}
	//4 7 9 11
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM..........login ToApp");
	}
	//5
	@Test
	public void searchTest() {
		System.out.println("search Test");
	}
	//8
	@Test
	public void checkoutTest() {
		System.out.println("checkout Test");
	}
	//10
	@Test
	public void addToCardTest() {
		System.out.println("addToCard Test");
	}
	//6 8 12
	@AfterMethod
	public void logout() {
		System.out.println("AM..........logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC..........close Browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT..........delete User");
	}
	//15
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS..........disconnect with database");
	}
	
	
}
