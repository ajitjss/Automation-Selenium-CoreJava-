package day3;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelements {

	public static void main(String [] args) throws InterruptedException {
		String username="smartechsoftwaretesting";
	String password="Krishna_05";
	
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
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(4000);
	     driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(password);
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	 //    wait.until(ExpectedConditions.presenceOfElementLocated("\"//*[@id=\\\"password\\\"]/div[1]/div/div[1]/input\""))
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	    
	    String error= driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")).getText();
	    System.out.println(error);
	    driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	    driver.close();
	   
	
	}
}
