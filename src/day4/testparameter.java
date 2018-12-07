package day4;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class testparameter {

		@Test(dataProvider = "getData")
		public void	doLogin(String username, String password) {
			System.out.println("Login into System");
			System.out.println(username+"......."+password);
		}
@DataProvider
public Object[][] getData(){
	Object[][] data = new Object[3][2];
	data[0][0]= "ajit091";
	data[0][1]= "DFFDFFDH";
	data[1][0]= "ajit091";
	data[1][1]= "DFFDFFDH";
	data[2][0]= "ajit091";
	data[2][1]= "DFFDFFDH";
	return data;	
}
}
