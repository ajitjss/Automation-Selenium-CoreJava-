package testngPart2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testGroup2 {

	@Test(groups = {"high"})
	public void validateResults() {
		System.out.println("Validating flight results");
	}
	
}
