package QA_Selenium.Batch8_TestNG; //TEST CLASS

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class HD_Assignment {
	static WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\src\\Drivers\\chromedriver.exe");
	  	driver = new ChromeDriver();
	  	driver.navigate().to("https://www.homedepot.com/");
	  	driver.manage().window().maximize();}
  @Test
  public void Home_Depot_Test() throws InterruptedException {
	  WebElement myaccount=driver.findElement(By.xpath("//*[@class='MyAccount__label SimpleFlyout__link--bold']"));
	  myaccount.click();
	  WebElement signin=driver.findElement(By.xpath("(//*[@id='SPSOSignIn'])"));
	  signin.click();
	  Thread.sleep(3000);
	  WebElement createaccount=driver.findElement(By.xpath("//*[@class='bttn-outline bttn-outline--primary u--marginNormal-top']"));
	  createaccount.click();
	  Thread.sleep(3000);
	  WebElement Personal=driver.findElement(By.xpath("(//*[@class='col__12-12 default-box default-border'])[1]"));
	  Personal.click();
	  Thread.sleep(3000);
	  WebElement emailid=driver.findElement(By.xpath("//*[@id='email']"));
	  emailid.sendKeys("johndoe@gmail.com");
	  WebElement password=driver.findElement(By.xpath("//*[@id='password-input-field']"));
	  password.sendKeys("Abcd12345");
	  WebElement cell=driver.findElement(By.xpath("//*[@id='phone']"));
	  cell.sendKeys("1234567890");
	  //WebElement uncheck=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]"));
	  //uncheck.click();
	  WebElement check=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]"));
	  check.click();
	  WebElement createanaccount=driver.findElement(By.xpath("//*[@data-automation-id=\"registrationCreateAnAccountButton\"]"));
	  createanaccount.click();}
  @AfterClass
  public void afterClass() throws InterruptedException {
	  	  Thread.sleep(3000);
	  driver.close();}
}
