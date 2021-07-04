package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.BaseTestPage;

public class RegisterPage extends BaseTestPage{
	
	WebDriver driver=null;
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement textBoxFirstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement textBoxLastName;
	
	public String getBrowserTitle() {
		return driver.getTitle();
		
	}
	
}
