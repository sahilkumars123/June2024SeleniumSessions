package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		 By forgotPassword = By.linkText("Forgotten Password");
		 
		 By logo = By.className("img-responsive");
		 
//		WebElement attr =  driver.findElement(logo);
//		
//		String title = attr.getAttribute("title");
//		String alt = attr.getAttribute("alt");
//		String attClassName = attr.getAttribute("class");
//		
//		System.out.println(title+" "+alt+" "+attClassName);
		 
		 
		 getElementAttribute(logo, "class");
		 getElementAttribute(logo, "alt");
				 		 
	}
	
	public static String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	} 

}
