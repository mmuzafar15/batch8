package QA_Selenium.Batch8_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class baseclass {
	static WebDriver driver;
	
	  @BeforeMethod (alwaysRun=true)
	  @Parameters({"selectedbrowser"})
	  public void beforeMethod (String selectedbrowser) throws InterruptedException, IOException {System.out.println("This is before Test");
		 
		  String brow=selectedbrowser; //added (String selectedbrowser) on line 24 and replaced STring value "chrome";
				  
			if (brow.contains("chrome")) {	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\src\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
			}
			
		  else if (brow.contains("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\src\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  }
			
		  else {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\src\\Drivers\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  }
			//driver.navigate().to("https://www.amazon.com/");
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			//shots("1");
			shots_withCurrentDateTime();
		 	Thread.sleep(3000);
		}	
	 
	  @AfterMethod (alwaysRun=true)
	  public void afterMethod() throws InterruptedException {System.out.println("This is after Test");
			Thread.sleep(3000);
			driver.close();
	  }

	public void shots(String filename) throws IOException {
		File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File("C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\screenshots\\1.png"));
		}

	public void shots_withArgs(String filename) throws IOException {
		File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File("C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\screenshots\\"+ filename +".png"));
	 }

	public void shots_withCurrentDateTime() throws IOException {
		Date dt = new Date();
		String filename = dt.toString().replace(" ", "_").replace(":", "_");
			
		File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File("C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\screenshots\\"+ filename +".png"));
	 }
}
