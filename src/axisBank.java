import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class axisBank {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.axisbank.com/");
	Actions action = new Actions(driver);
	action.sendKeys(Keys.chord(Keys.TAB)).perform();
	action.sendKeys(Keys.ENTER).perform();
	
/*
	String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	String subWindowHandler = null;

	Set<String> handles = driver.getWindowHandles(); // get all window handles
	Iterator<String> iterator = handles.iterator();
	while (iterator.hasNext()){
	    subWindowHandler = iterator.next();
	    System.out.println(subWindowHandler);
	}
	driver.switchTo().window(subWindowHandler); // switch to popup window
	driver.quit();
*/
	
	/*Alert alert = driver.switchTo().alert();
	alert.dismiss();
	//driver.close();
*/	
}
}
