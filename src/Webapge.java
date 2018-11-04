import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.*;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Webapge {
	public static String browser = "Chrome";
	public static ChromeDriver driver;
	//public static FirefoxDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browser.equals("Mozila")) {
            
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\geckodriver.exe");
            FirefoxDriver driver =new FirefoxDriver();
		}
		else {
			InternetExplorerDriver driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.hdfcbank.com/");
driver.getTitle();
driver.findElementByXPath("//div[@class= 'product product1']//img[@class='front icon']").click();
//Thread.sleep(2500);
driver.manage().window().maximize();
driver.findElementByLinkText("APPLY NOW");
//Thread.sleep(6500);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(browser));
driver.findElementByXPath("//*[@id=\"element4\"]/div[1]/div/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/a[1]").click();
//driver.quit();


	}

}
