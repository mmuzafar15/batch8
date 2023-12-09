package QA_Selenium.Batch8_TestNG; //TEST METHOD

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestMethod extends baseclass{
	
  @Test (groups= {"regression"})
   public void Test1() throws InterruptedException, IOException {
	  System.out.println("This is Regression Test");
   
   		Properties prop = new Properties();
   		FileInputStream fin = new FileInputStream("C:\\Users\\mmuza\\eclipse-workspace\\Batch8_TestNG\\userdetails.properties");
   		prop.load(fin);
   		
   		String email = prop.getProperty("Email");
   		String password = prop.getProperty("Password");
   		
   		AmazonHome ob = new AmazonHome(driver);
  		ob.enterEmail(email);
  		//shots_withArgs("email");
  		shots_withCurrentDateTime();
  		Thread.sleep(3000);
  		ob.enterPass(password);
  		//shots_withArgs("password");
  		shots_withCurrentDateTime();
  		Thread.sleep(3000);}
  		
  @Test (groups= {"regression"})
  public void Test2() throws InterruptedException, IOException {
	  	System.out.println("This is Funtional Test");
 		
	  	AmazonHome ob = new AmazonHome(driver);
 		ob.enterEmail("xyz@gmail.com");
 		//shots_withArgs("email");
 		shots_withCurrentDateTime();
 		Thread.sleep(3000);
 		ob.enterPass("zzzzz");
 		//shots_withArgs("password");
 		shots_withCurrentDateTime();
 		Thread.sleep(3000);}
  
//  	  @Test
//  	  public void Test2() throws InterruptedException {System.out.println("This is Test 2");
//  	  	AmazonHome ob = new AmazonHome(driver);
//		ob.enterEmail("xyz@gmail.com");
//		ob.enterPass("zzzzzzz");
//  		Thread.sleep(3000);}
  	  
//	  	WebElement bestsellers=driver.findElement(By.xpath("(//*[contains(text(),'Best Sellers')])[1]"));
//	  	bestsellers.click();
//	  	
//	  	AmazonHome ob = new AmazonHome(driver);
//	  	ob.bestSellersClick();
//	  	ob.getfacebookActualTextComparison();	
//	  	
//	  	}
//  
//  @Test
//  public void Test2() throws InterruptedException {System.out.println("This is Test 2");
//	  	//WebElement amazonbasics=driver.findElement(By.xpath("(//*[contains(text(),'Amazon Basics')])[1]"));
//	  	//amazonbasics.click();
//	
//  		AmazonHome ob = new AmazonHome(driver);
//  		ob.amazonBasicsClick();
//			Thread.sleep(3000);}
//  
//  @Test
//  public void Test3() {System.out.println("This is Test 3 for Amazon Search of Evo Laptops");
//	  	WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
//	  	searchfield.sendKeys("Evo Laptops");
//	  	WebElement clicksearch=driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
//	  	clicksearch.click();}
  
  }