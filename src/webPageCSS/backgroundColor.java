package webPageCSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class backgroundColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		String color = driver.findElement(By.xpath("//body[1]/div[1]")).getCssValue("background-color");
	String bgcolor= 	driver.findElement(By.xpath("//body[1]/div[1]")).getCssValue("color");
	System.out.println(color);
	System.out.println(bgcolor);
	driver.quit();
	}

}
