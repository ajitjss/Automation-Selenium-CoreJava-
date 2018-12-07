package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstCry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
WebDriver  driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://www.firstcry.com/");
System.out.println(driver.findElement(By.tagName("iframeemi")).getSize());
//driver.switchTo().frame("iframeemi");
/*driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qaedupoint@gmail.com");
driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("9555902032");
driver.findElement(By.xpath("//input[@id='btnSignUp']")).click();*/
System.out.println(driver.findElement(By.tagName("iframe")).getSize());
List<WebElement> frames = driver.findElements(By.tagName("iframeemi"));
System.out.println("count of frames"+frames.size());
for(WebElement frame: frames) {
System.out.println(frame.getAttribute("id"));
}
driver.close();
	}

}
