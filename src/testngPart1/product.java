package testngPart1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class product {

	@Test(priority=3)
	public void product(){
		System.out.println("new product added");
	}
	@Test(priority =4)
	public void productquant() {
		System.out.println("Verify Product Quantity");
		Assert.assertEquals(false, true);
	}
	
}
