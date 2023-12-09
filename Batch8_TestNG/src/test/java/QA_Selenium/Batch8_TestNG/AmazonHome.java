package QA_Selenium.Batch8_TestNG;

import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome { //Store Elements with help of Locators

	public static WebDriver driver;

	@FindBy(xpath="(//*[contains(text(),'Best Sellers')])[1]") WebElement BestSellers;
	@FindBy(xpath="(//*[contains(text(),'Amazon Basics')])[1]") WebElement AmazonBasics;
	@FindBy(xpath="(//*[contains(text(),'Connect with')])[1]") WebElement facebookActualText;
	@FindBy(xpath="//*[@name='email']") WebElement facebookEmailField;
	@FindBy(xpath="//*[@name='pass']") WebElement facebookPassField;

//changes
	public AmazonHome(WebDriver driver) {  //Page Factory Constructor
		AmazonHome.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public void enterEmail(String email) {
		facebookEmailField.sendKeys(email);
	}
	
	public void enterPass(String pass) {
		facebookPassField.sendKeys(pass);
	}

	public void bestSellersClick() { //Creating Function
		BestSellers.click();
	}
	
	public void amazonBasicsClick() { //Creating Function
		AmazonBasics.click();
	}

	public void getfacebookActualTextComparison() { //Creating Function
	String stringfacebookActualText=facebookActualText.getText();
//	Assert.assertEquals(stringfacebookActualText, "Connect with friends and the world around you on Facebook.");

	SoftAssert sf = new SoftAssert();
	sf.assertEquals(stringfacebookActualText, "Connect with friends and the world around you on Facebook.");
	System.out.println("This text is after failed assertion");
	sf.assertAll();
	}
}
