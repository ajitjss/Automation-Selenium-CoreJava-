package day4;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myfirstTestNG {
     
	@BeforeTest
	public void DBConn() {
		System.out.println("DB Conection MADE");
	}
	@BeforeMethod
	public void doLogin() {
		System.out.println("Login Done");
	}
	@AfterTest
	public void breakDB() {
		System.out.println("BreakDB");
	}
	@Test(priority=2, groups="smoke")
	public void testProfile() {
		System.out.println("Profile Page Verfied");
	}
	@Test(priority=3)
	public void testAccountSummay() {
		System.out.println("Account Summary Verfied");
		Assert.fail();
	}
	@Test(priority=4, dependsOnMethods="testAccountSummay")
	public void browser() {
		System.out.println("Broser Opened ");
	}
}
