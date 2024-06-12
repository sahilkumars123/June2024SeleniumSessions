package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FrameworkException.FrameworkException;

public class ElementUtil {
	
	
	private WebDriver driver;
	
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendkeys(By locator, String text) {
		
		if(text == null) {
			System.out.println("please send the proper values, not the null value");
			throw new FrameworkException("NULLVALUEISNOTALLOWED");
		}
		
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
	
	public  boolean elementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  boolean elementEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	public int getElementLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public List<String> getElementTextInAWebPage(By locator) {
		List<WebElement> linksList = getElements(locator);
		List<String> linksListText = new ArrayList<String>();
		
		for(WebElement e : linksList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				//System.out.println(text);
				linksListText.add(text);
			}
		}
		return linksListText;
	}
	
	public WebElement getElement(By locator) {
		
		WebElement element = null;
		
		try {
		element = driver.findElement(locator);
		}catch (Exception e) {
			System.out.println("please pass the correct locator");
		}
		return element;
	}
	
	

}
