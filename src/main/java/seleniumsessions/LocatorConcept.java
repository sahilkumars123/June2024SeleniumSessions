package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	
	//create a webelement + perform action(sendkeys, click, gettext, isDisplayed)
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("sahil@yopmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("sahil@123");
		
		//2. 
		
//	WebElement userID =	driver.findElement(By.id("input-email"));
//	WebElement password = driver.findElement(By.id("input-password"));
//	
//	
//	userID.sendKeys("sahil@yopmail.com");
//	password.sendKeys("sahil@123");
	
	
	//3. BY locator approach
//		By userID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		
//		WebElement user_id = driver.findElement(userID);
//		WebElement password_id = driver.findElement(password);
//		
//		user_id.sendKeys("sahil@yopmail.com");
//		password_id.sendKeys("sahil@123");
		
	//4.
		
//		By userID = By.id("input-email");
//		By password = By.id("input-password");
//		
//		
//		WebElement user_id = getElement(userID);
//		WebElement password_id = getElement(password);
//		
//		
//		user_id.sendKeys("sahil@yopmail.com");
//		password_id.sendKeys("sahil@123");
		
		
		//5. 
		
		By userID = By.id("input-email");
		By password = By.id("input-password");
		
		
		doSendkeys(userID, "sahil@yopmail.com");
		doSendkeys(password, "sahil@123");
		
		
	}
	
	public static void doSendkeys(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
