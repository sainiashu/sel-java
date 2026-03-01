package test;

import org.testng.annotations.Test;

//this group define that all tests under this group
@Test(groups = {"AllClassTests"})
public class testng_group {

	@Test(groups= {"sanity"})
	public void test1() {

		System.out.println(" test 1");
	}

	@Test(groups= {"regression"})
	public void test2() {
		System.out.println(" test 2");
	}

	@Test(groups= {"sanity","regression"})
	public void test3() {
		System.out.println(" test 3");
	}

	@Test(groups= {"window.regression"})
	public void test4() {
		System.out.println(" test 4");
	}

}
