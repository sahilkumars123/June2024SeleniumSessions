package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendkeys(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	/**
	 * Written By Ravi
	 * @param locator - we are expecting a locator in this method
	 * @return - it will be returning String
	 */
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	
	public boolean getElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
