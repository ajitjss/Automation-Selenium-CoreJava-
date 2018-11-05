package testngPart2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testwithPriority {
	
    @BeforeTest
	public void envSetUp() {
		System.out.println("Enviornment should be up !!!");
	}
	   
	
	@Test(priority=1)
	public void doLogin() {
		System.out.println("Test Case 1>>this is test case for Login Functionality!~~!!");
		AssertJUnit.fail();
	}
	
	@Test(priority=2, dependsOnMethods= {"doLogin"})
	public void doProfile() {
		System.out.println("Test Case 2:>> this is test case for Profile Functionality!~~!!");
	}
	@Test(priority=3,dependsOnMethods= {"doLogin"},alwaysRun=true)
	public void billingPage() {
		System.out.println("Test Case 3:>> this is test case for billing Page Functionality!~~!!");
	}
	@Test(priority=4,dependsOnMethods= {"doLogin"}, alwaysRun=true)
	public void productPage() {
		System.out.println("Test Case 4:>> this is test case for Product Page Functionality!~~!!");
	}
	
	@Test(priority=5, dependsOnMethods= {"doLogin"}, alwaysRun=true)
	public void OrdersPage() {
		System.out.println("Test Case 5:>> this is test case for orders Page Functionality!~~!!");
	}
	
}
