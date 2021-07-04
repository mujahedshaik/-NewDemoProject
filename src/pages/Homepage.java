package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BaseTestCase;
import common.BaseTestPage;

public class Homepage extends BaseTestPage{

	WebDriver driver=null;
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver= driver;
		driver.get("http://demo.automationtesting.in/");
	}
	
	@FindBy(xpath = "//button[@id='btn2']")
	public WebElement buttonSkipSignIn;
	
	@FindBy(id = "btn2")
	public WebElement buttonSkipSignInById;
	
	public String getBrowserTitle() {
		return driver.getTitle();
		
	}
	
	
	
	
	/*
	 * public void OpenHomePage() { driver.get("http://demo.automationtesting.in/");
	 * }
	 */
	
}
