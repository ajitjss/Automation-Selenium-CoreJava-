package Iframe;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
	List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	System.out.println(iframes);
driver.switchTo().frame(iframes.get(0));
	driver.close();
}
}
