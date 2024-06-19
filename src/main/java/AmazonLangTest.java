import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLangTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=topnav_lang");

		By locator = By.xpath("//div[@class='a-row a-spacing-mini']//span[@class='a-label a-radio-label']");
		
		clickOnElement(locator, "বাংলা");
	

	}
	
	public static void clickOnElement(By locator, String text) {
		
		List<WebElement> langLinks = driver
				.findElements(locator);

		for (WebElement e : langLinks) {
			String searchText = e.getText();
			System.out.println(text);
			if(searchText.contains(text)) {
				e.click();
			}
		}
		
		
	}

}
