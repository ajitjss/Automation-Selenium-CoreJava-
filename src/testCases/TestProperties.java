package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		Properties or= new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\or.properties");
	    or.load(fis);
	    System.out.println(or.getProperty("username_xpath"));
	    
	    Properties config = new Properties();
	    FileInputStream fig= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
	     config.load(fig);
	     System.out.println(config.getProperty("testsiteurl"));
	}

}
