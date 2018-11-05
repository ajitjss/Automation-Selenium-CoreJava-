package testngPart2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testGroupRun {
@Test(priority=1, groups = {"high"})
public void doLogin() {
	System.out.println("Login to  my Trip!!");
}
@Test(priority=2, groups = {"low"})
public void fillForm() {
	System.out.println("fill details  to book flight");
}
@Test(priority=3)
public void bookTickets() {
	System.out.println("click on book flight");
}
@Test(priority=4, groups = {"medium"})
public void verifyBill() {
	System.out.println("fill details  to book flight");
}
}
