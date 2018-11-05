package simpleListners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class testListners extends TestListenerAdapter {

	public void onTestFailure(ITestResult tr) {
		System.out.println("Failing the test cases"+tr.getName());
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("skipping the Test"+tr.getName());
	}
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Pass- "+tr.getName());
	}
}
