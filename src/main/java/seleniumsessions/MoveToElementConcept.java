package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		
			By locator = 	By.xpath("//button[text()='Checkout here']");
	
			moveToElement(locator);
		
		//Actions act = new Actions(driver);
		//act.moveToElement(checkoutBtn); //not valid
		//act.moveToElement(checkoutBtn).build(); //not valid
		
		//act.moveToElement(checkoutBtn).build().perform(); //valid
		//act.moveToElement(checkoutBtn).perform(); //valid
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void moveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();
	}

}
