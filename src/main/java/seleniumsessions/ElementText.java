package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//By locator
		By registerHeader = By.tagName("h1");
		
		By forgotPassword = By.linkText("Forgotten Password");
				
		
		
//		WebElement register =  driver.findElement(registerHeader);
//		
//		String text = register.getText();
//		
//		System.out.println(text);
//		
//		String text = driver.findElement(registerHeader).getText();
//		
//		System.out.println(text);
		
//		String text = getElementText(registerHeader);
//		
//		
//		if(text.equals("Register Account")) {
//			System.out.println("TC::PASS");
//		}
//		else {
//			System.out.println("TC:: FAIL");
//		}
		
		
		 if(getElementDisplayed(forgotPassword)) {
			 System.out.println("element is present");
		 }
		 else {
			 System.out.println("element is not present");
		 }

	}
	
	
	public static boolean getElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
