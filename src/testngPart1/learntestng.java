package testngPart1;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class learntestng {
	String expected = "thehindu";
	@BeforeTest
public void launchbrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\Selenium Drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://www.gmail.com/");
}
String actual= "thehindu";
	@Test(priority=1)
		public void titleVerify() {
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(true, "Elemnet not found");
		}
	@Test(priority=2, dependsOnMethods="titleVerify")
	public void doLogin() {
		System.out.println("login to firefox");
	}
	@AfterTest
	public void disconDB() {
		System.out.println("Disconnect to DB");
	}
	@BeforeTest
	public void connectDB() {
		System.out.println("Connect to DB");
	}
	}

