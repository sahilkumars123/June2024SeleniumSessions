package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotPassword = By.linkText("Forgotten Password11");
		
		try {
				driver.findElement(forgotPassword).click();
		}catch (Exception e) {
			System.out.println("please check the locator carefully!!!");
		}
		
		System.out.println(driver.getTitle());
		
	}

}
