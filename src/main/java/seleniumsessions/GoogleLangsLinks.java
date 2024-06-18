package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangsLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		By locator = By.xpath("//div[@id='SIvCob']/a");
		
		clickOnElement(locator, "मराठी");

		

	}
	
	public static void clickOnElement(By locator, String lang) {
		
		List<WebElement> langLinks = getElements(By.xpath("//div[@id='SIvCob']/a"));

		for (WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(lang)) {
				e.click();
				break;
			}
		}
	}
		
		
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		

}
