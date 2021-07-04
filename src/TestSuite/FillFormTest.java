package TestSuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.BaseTestCase;
import pages.Homepage;
import pages.RegisterPage;

public class FillFormTest extends BaseTestCase{
	
	@Test
	public void fillform() {
		
		Homepage homepage=new Homepage(driver);
		
		homepage.getBrowserTitle().equals("Index");
		assertTrue(homepage.getBrowserTitle().equals("Index"));
		assertTrue(homepage.getBrowserTitle().equals("Index"), "browser title matched");
		assertEquals(homepage.getBrowserTitle(), "Index");
		
		
		/*
		 * SoftAssert softAssert = new SoftAssert();
		 * softAssert.assertTrue(homepage.getBrowserTitle().equals("Index1"));
		 */
		
		//homepage.OpenHomePage();
		homepage.explicitwait(homepage.buttonSkipSignIn);
		homepage.buttonSkipSignIn.click();
		
		RegisterPage registerPage = new RegisterPage(driver);
		assertTrue(registerPage.getBrowserTitle().equals("Register"));
		registerPage.explicitwait(registerPage.textBoxFirstName);
		registerPage.textBoxFirstName.sendKeys("1234567");
		assertEquals(registerPage.textBoxFirstName.getText(), "1234567");
		registerPage.textBoxLastName.sendKeys("K");
		
		
	}

}
