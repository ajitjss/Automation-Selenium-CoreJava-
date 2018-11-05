package testngPart1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngimplementations {

	@Test(priority=2)
	public void doLogin() {
		System.out.println("User Login Successfully");
	}
	@Test(priority=1)
	public void userReg() {
		System.out.println("User Profile Created");
	}
	@BeforeTest
	public void connecttoDB() {
		System.out.println("connected to database");
			}
	@AfterTest
	public void disconnecttoDB() {
		System.out.println("Disconnected to DB");
	}
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("Launching the Browser");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("Close Browser");
	}
}
