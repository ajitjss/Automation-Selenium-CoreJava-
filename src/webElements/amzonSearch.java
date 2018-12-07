package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonSearch {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple ipad 6th gen ");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//div/span[contains(text(),'apple ipad 6th gen 9.7 inch')]"))).click().perform();
	driver.findElement(By.xpath("//div/span[contains(text(),'apple ipad 6th gen 9.7 inch')]")).click();
	
	
}
}