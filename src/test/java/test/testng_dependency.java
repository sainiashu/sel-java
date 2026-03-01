package test;

import org.testng.annotations.Test;


//If we set priority 1 in test 1 still test 2 execute first because test1 is dependency on test2
public class testng_dependency {
	
//	@Test(dependsOnMethods = "test2", priority = 1)
	@Test(dependsOnGroups = "sanity1")
	public void test1() {
		System.out.println("I am inside test 1");
	}

//	@Test(priority = 2)
	@Test(groups = "sanity1")
	public void test2() {
		System.out.println("I am inside test 2");
	}

}
