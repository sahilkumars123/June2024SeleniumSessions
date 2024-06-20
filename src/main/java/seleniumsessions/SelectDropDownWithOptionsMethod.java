package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptionsMethod {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_getForm_Country");
		
		System.out.println(getDropDownOptionsCount(country));
		
		if(getDropDownTextList(country).contains("India")) {
			System.out.println("PASS");
		}
		
		List<String> expectedCountryList =	Arrays.asList("India", "Andorra", "Angola");
		
		if(getDropDownTextList(country).containsAll(expectedCountryList)) {
			System.out.println(expectedCountryList+ "are avaialble");
		}
		
		

//		Select select = new Select(driver.findElement(country));
//
//		List<WebElement> listOfCountries = select.getOptions();
//
//		System.out.println(listOfCountries.size());
//
//		for (WebElement e : listOfCountries) {
//			String text = e.getText();
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));
	 List<WebElement> optionsList = select.getOptions();
	 List<String> optionsTextList = new ArrayList<String>();
	 
	 for(WebElement e: optionsList) {
		 String text = e.getText();
		 optionsTextList.add(text);
	 }
		return optionsTextList;
	}

}
