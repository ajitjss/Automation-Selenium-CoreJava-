package tabs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.pProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaedupoint.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> wind = driver.getWindowHandles();
				Iterator itr = wind.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("count of frames"+frames.size());
		for(WebElement frame: frames) {
		System.out.println("Frames attribute: \t "+frame.getAttribute("id"));
		}
		driver.switchTo().window("-1");
		//driver.findElement(By.xpath("//a[@title='Close']")).click();
		driver.switchTo().frame(-1);
		driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("test");
		double num= Math.random()*1010000;
		driver.findElement(By.xpath("//input[@name=\"mobileR\"]")).sendKeys("8855881444");
		Select drop = new Select(driver.findElement(By.xpath("//option[@value='Select Course']/option")));
	    drop.selectByValue("Adobe Flex-3.0");
	    driver.findElement(By.xpath("//input[@value='Send']")).click();
		driver.close();
		
	}

}
