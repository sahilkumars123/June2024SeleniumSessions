package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		// drop down: <select> tag
		// Select Class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_getForm_Country");

		//Select select = new Select(driver.findElement(country));

		// select.selectByIndex(7); //-- //months in a year

		// select.selectByVisibleText("India");

		// select.selectByValue("Argentina");

		// 10 dropdown - 10 Select methods
		
		doSelectByIndex(country, -1);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		
		if(index < 1) {
			System.out.println("please pass the (+ve) index");
			return;
		}

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String text) {
		
		if(text == null) {
			System.out.println("please pass the valid text");
			return;
		}

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByValue(By locator, String value) {
		
		if(value == null) {
			System.out.println("please pass the correct value");
			return;
		}

		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
