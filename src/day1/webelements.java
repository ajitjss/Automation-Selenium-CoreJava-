package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelements {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
		String title = driver.getTitle();
		String expected_title = "Yahoo";
		System.out.println(title);
		System.out.println(title.length());
		//System.out.println(title.compareTo(expected_title));
		if (title.equals(expected_title)) {
			System.out.println("Test Case Pass !");
		}
		else
		{
			System.out.println("Test Case Fail !");
		}
		driver.get("http://www.google.com/");
		WebElement email= driver.findElement(By.id("lst-ib"));
		email.sendKeys("Ajete");
		WebElement search= driver.findElement(By.name("submit"));
	    search.click();
	}
}
