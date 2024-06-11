package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.  ID: unique locator (attribute) -- I
		
		//driver.findElement(By.id("input-email")).sendKeys("xyz");
		
		
		//2. NAME: can be duplicate, 99% name will be unique (attribute)
//		ele1 -- sahil
//		ele2 -- sahil
//		ele3 -- sahil
		
		
		//3. CLASS NAME: can be duplicate and most of the time its duplicate
		
		//driver.findElement(By.className("form-control")).sendKeys("sahil");
		
		//driver.findElement(By.className("form-control")).sendKeys("kumar");
		
//		INTERVIEW QUESTION :: WHAT HAPPENS IF YOU HAVE THE SAME CLASS NAME, FOR THE MUTIPLE FIELDS.
//		ANSWERE :: IT WILL PASS THE VALUE TO THE FIRST FIELD whichever is encountered.
		
		
	}

}
