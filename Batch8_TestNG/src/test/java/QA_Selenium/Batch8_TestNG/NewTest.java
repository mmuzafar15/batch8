package QA_Selenium.Batch8_TestNG; //TEST 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	  static WebDriver driver;


  @BeforeTest
  public void beforeClass() throws InterruptedException {
	  System.out.println("This is before Test");
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
	 	Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void MainTest(){
	 System.out.println("This is Testing for Amazon Search of Evo Laptops");
	  	WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
	  	searchfield.sendKeys("Evo Laptops");
	  	WebElement clicksearch=driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
	  	clicksearch.click();
  }
  
  @AfterTest
  public void afterClass() throws InterruptedException {
	  System.out.println("This is after Test");
		Thread.sleep(3000);
		driver.close();

  }

}
