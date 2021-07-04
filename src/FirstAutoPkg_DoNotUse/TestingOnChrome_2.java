package FirstAutoPkg_DoNotUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BaseTestCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingOnChrome_2 extends BaseTestCase{
	

	
	@Test
	public void testDemoSite() {

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	}

	@Test
	public void testDemoSite_1() {
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
	}
	


	

}
