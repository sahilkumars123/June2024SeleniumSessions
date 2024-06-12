package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisableTextField {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By password = By.id("pass");
		
//		boolean flag = driver.findElement(By.id("pass")).isEnabled();
//		
//		if(flag) {
//			System.out.println("test");
//		}
//		else {
//			System.out.println("field is disabled");
//		}
//		
//		boolean flag1 = driver.findElement(By.id("pass")).isDisplayed();
//		
//		if(flag1) {
//			System.out.println("field is displayed on the screen");
//		}
//		else {
//			System.out.println("field is not displayed on the screen");
//		}
		
//		if(elementDisplayed(password)){
//			System.out.println("field is visible on the screen");
//		}
//		else {
//			System.out.println("field is not visible on the screen");
//		}
		
		
//		String text =  driver.findElement(password).getAttribute("disabled");
//		
//		if(text.equals("true")) {
//			System.out.println("");
//		}
		
		if(checkElementEnabled(password)) {
			System.out.println("element is disabled");
		}
		else {
			System.out.println("element is not diabled");
		}
			
		
	}
	
	public static boolean checkElementEnabled(By locator) {
		String flag = getElement(locator).getAttribute("disabled");
		if(flag.equals("true")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static boolean elementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static boolean elementEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
