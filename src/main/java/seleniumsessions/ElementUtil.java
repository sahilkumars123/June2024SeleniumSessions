package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
	WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	public void doSendkeys(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
