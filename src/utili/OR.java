package utili;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OR {
	WebDriver driver;
	public class WebElement HomePage() {
		public WebElement username= driver.findElement(By.xpath("//input[@name='userName']"));
		return username;
	}
	

}
