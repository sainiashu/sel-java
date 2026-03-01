package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_param {
	
	@Parameters({"name"})
	@Test()
	public void test1(String name) {
		
		System.out.println("Name is: " + name);
	}

/*	@Parameters({"name"})
	@Test()
	public void test2( @Optional ("Demo") String name) {
		
		System.out.println("Name is: " + name);
	}
*/
}
