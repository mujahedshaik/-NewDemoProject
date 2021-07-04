package FirstAutoPkg_DoNotUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.BaseTestCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingOnChrome extends BaseTestCase{

	@Test
	public void testDemoSite() throws InterruptedException {

		driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.xpath("//button[@id='btn2']")).click();//Skip sign in button
		//driver.findElement(By.id("btn2")).click();//Skip sign in button
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Yogesh");//First Name
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");//Last name
		
		//DOB selection
		driver.findElement(By.xpath("//select[@id='yearbox']")).sendKeys("2000");
		driver.findElement(By.xpath("//select[@ng-model='monthbox']")).sendKeys("July");
		driver.findElement(By.xpath("//select[@id='daybox']")).sendKeys("10");

		Thread.sleep(5000);
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
			
		
		
	}



}
