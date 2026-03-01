package testng_priorities;

import org.testng.annotations.Test;

// If priority are the same in the test class then testng run the test as per the alphabetical order.
// if mixed with priority and non priority test then it will run non priority test first.

public class priorities_test {

	@Test(priority = 3)
	public void test1() {

		System.out.println(" Test 1");		
	}

	@Test(priority = 2)
	public void test2() {

		System.out.println(" Test 2");		
	}

	@Test(priority = -1)
	public void test3() {
		System.out.println(" Test 3");
	}

	@Test(priority = 3)
	public void one() {

		System.out.println(" Test one");		
	}

	@Test(priority = 2)
	public void two() {

		System.out.println(" Test two");		
	}

	@Test(priority = -1)
	public void three() {
		System.out.println(" Test three");
	}
}
