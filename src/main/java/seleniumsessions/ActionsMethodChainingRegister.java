package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(fn, "sahil")
		.sendKeys(Keys.TAB)
		.pause(1500)
		.sendKeys("automation")
		.sendKeys(Keys.TAB)
		.pause(1500)
		.sendKeys("test@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(1500)
		.sendKeys("9898989898")
		.sendKeys(Keys.TAB).perform();
		

	}

}
