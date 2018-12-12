import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_JSexecutor {
	public static WebDriver driver;
	public static void  captureScreen() throws IOException {
		// capture Screenshot
				 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Date d= new Date();
				 
				String fileName = d.toString().replace(" ", "_").replace(":", "_ ")+".jpg";
				 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshot\\"+fileName));
	}
	public static void main(String[] args) throws IOException {

    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajit\\Documents\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick");
		driver.switchTo().frame("iframeResult");
		// run javaScript function using JAVA Script executor
		((JavascriptExecutor) driver).executeScript("myFunction()");
		// highlight webElemnt using java script executor
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",driver.findElement(By.xpath("//button[contains(text(),'Click me')]")));
	     captureScreen();
		 }
}

