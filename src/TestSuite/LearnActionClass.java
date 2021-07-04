package TestSuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common.BaseTestCase;

public class LearnActionClass extends BaseTestCase{

	@Test
	public void testAction() throws InterruptedException {


		driver.get("http://uitestingplayground.com/mouseover");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement webElement = driver.findElement(By.xpath("//a[@title='Click me']"));
		Actions action = new Actions(driver);
		action.moveToElement(webElement).perform();
		
		WebElement wb =driver.findElement(By.xpath("//a[@title='Active Link']"));
		
		Thread.sleep(7000);
		
	    assertTrue(wb.getText().equals("Active Link"));

		//a[@title='Active Link']


	}

}
