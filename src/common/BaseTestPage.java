package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestPage {
//Wait
	
	public void explicitwait(WebElement we) {
		WebDriverWait wb = new WebDriverWait(BaseTestCase.driver, 30);
		wb.until(ExpectedConditions.visibilityOf(we));
	}
	
	public void explicitwait_Alert(WebElement we) {
		WebDriverWait wb = new WebDriverWait(BaseTestCase.driver, 30);
		wb.until(ExpectedConditions.alertIsPresent());
	}
	
	public void fluentWait() {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(BaseTestCase.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
				wait1.until(ExpectedConditions.numberOfElementsToBe(By.id(""), 2));
	}
	
}
