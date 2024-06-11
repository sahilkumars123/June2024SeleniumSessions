package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtil ele = new ElementUtil(driver);
		
		By first_name = By.id("input-firstname");
		
		ele.doSendkeys(first_name, "sahil kumar");
		
		String text = ele.getElementAttribute(first_name, "value");
		
		System.out.println(text);
	}

}
