package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.cssSelector("#Form_getForm_Country > option");
		doSelectDropDownValueUsingLocator(country, "Angola");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSelectDropDownValueUsingLocator(By locator, String dropdownValue) {

		List<WebElement> countryList = getElements(locator);

		for (WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropdownValue)) {
				e.click();
				break;
			}
		}
	}
	
	


}
