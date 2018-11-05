package testngPart1;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTetng {
    
	
	@Test(priority=2)
	public void doLogin() {
		System.out.println("user login now");
		Assert.assertSame('a', 'b');
	}
	@Test(priority=1)
	public void userVerification() {
		System.out.println("USer verified!!");
	}
	@BeforeMethod
	public void openEnvUP() {
		System.out.println("Enviornment Should be UP!!");
	}
	
	@BeforeTest
	public void connectDB() {
		System.out.println("Connect to DB");
	}
	
}
