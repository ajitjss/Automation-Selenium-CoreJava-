package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplebrowser {
public static String browser = "chrome";
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
else if (browser.equals("ie")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\ajit\\Documents\\SeleniumDrivers\\MicrosoftWebDriver.exe");
	 driver = new EdgeDriver();
}
else {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ajit\\Documents\\SeleniumDrivers\\geckodriver.exe");
 driver = new FirefoxDriver();
		
}
driver.get("http://www.gmail.com/");
String title = driver.getTitle();
String expected_title = "Yahoo";
System.out.println(title);
System.out.println(title.length());
//System.out.println(title.compareTo(expected_title));
if (title.equals(expected_title)) {
	System.out.println("Test Case Pass !");
}
else
{
	System.out.println("Test Case Fail !");
}
driver.close();
driver.quit();
	}

}
