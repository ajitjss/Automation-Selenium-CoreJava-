package testNGDataDriven;
import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class useDataProvider {

	public WebDriver driver;
	
	// Before Test Steps
	@BeforeTest
	public void doSetUp() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
			
	}
	// Sample Testing of Login Module using data from Excel
	@Test(dataProvider="sheet0") 
	public void doLogin(String userName, String password) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		try {
		 WebElement element1= driver.findElement(By.xpath("//input[@value='Login']"));
		Assert.assertEquals(true, element1.isDisplayed());
		}catch(NoSuchElementException e ) {
		System.out.println("Element not found!!");
		}
			
	}
	//
	@DataProvider(name= "sheet0")
	public Object [][] getData() {
		
		return new Object[][] {{"mercury","mercury"}};
	}
	
	
}
