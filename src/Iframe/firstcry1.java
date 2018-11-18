package Iframe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.firstcry.com/");
		Set <String> windid = driver.getWindowHandles();
		Iterator <String> itr = windid.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}

}
}
