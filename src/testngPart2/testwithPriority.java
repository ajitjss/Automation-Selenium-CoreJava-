package testngPart2;

import org.testng.annotations.Test;

public class testwithPriority {

	@Test(priority=1)
	public void doLogin() {
		System.out.println("Test Case 1>>this is test case for Login Functionality!~~!!");
	}
	
	@Test(priority=2)
	public void doProfile() {
		System.out.println("Test Case 2:>> this is test case for Profile Functionality!~~!!");
	}
	@Test(priority=3)
	public void billingPage() {
		System.out.println("Test Case 3:>> this is test case for billing Page Functionality!~~!!");
	}
	@Test(priority=4)
	public void productPage() {
		System.out.println("Test Case 4:>> this is test case for Product Page Functionality!~~!!");
	}
	
	@Test(priority=5)
	public void OrdersPage() {
		System.out.println("Test Case 5:>> this is test case for orders Page Functionality!~~!!");
	}
	
}
