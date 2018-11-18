package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amzonSearch {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple Watch");
	Actions act = new Actions(driver);
	driver.
	act.keyDown(target, key)
}
}