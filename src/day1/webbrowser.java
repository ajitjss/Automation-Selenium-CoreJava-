package day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class webbrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stuby
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\Selenium Drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com/slider/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
WebElement mainslider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
Actions action = new Actions(driver);
action.dragAndDropBy(slider,0,mainslider.getSize().width/2);
Thread.sleep(3000);
action.dragAndDropBy(slider,mainslider.getSize().width/2, 0).perform();
	}

}
