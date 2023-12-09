package QA_Selenium.Batch8_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestDP extends baseclass{
  @Test(dataProvider = "dp")
  public void f(String email, String Pass) throws InterruptedException {
	  AmazonHome ob = new AmazonHome(driver);
		ob.enterEmail("abc@gmail.com");
		Thread.sleep(3000);
		ob.enterPass("aaaaaaaa");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aaaaa" },
      new Object[] { "xyz@gmail.com", "zzzzz" },
    };
  }
}
