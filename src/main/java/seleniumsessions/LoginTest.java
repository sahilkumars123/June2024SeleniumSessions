package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		
		driver = brUtil.launchBrowser("chrome");
		
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By userID = By.id("input-email");
		By password = By.id("input-password");
		
		eleUtil.doSendkeys(userID, "sahil@yopmail.com");
		
		eleUtil.doSendkeys(password, "sahil123");
		
		brUtil.quitBrowser();
	}

}
