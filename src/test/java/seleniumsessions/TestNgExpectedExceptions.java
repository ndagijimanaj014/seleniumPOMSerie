package seleniumsessions;

import org.testng.annotations.Test;

public class TestNgExpectedExceptions {
	String name;
	@Test(priority= 4, description=" addToCarTest",expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void addToCartTest() {
		System.out.println(" addToCartTest");
		int i= 9/3;
		System.out.println("hello");
		TestNgExpectedExceptions obj=null;
		obj= new TestNgExpectedExceptions();
		System.out.println(obj.name);//npE
		
		
	}
}
