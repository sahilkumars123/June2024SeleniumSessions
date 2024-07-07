package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		actions.sendKeys(Keys.PAGE_UP).perform();
		
		
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		
//		actions.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		//actions.scrollToElement(driver.findElement(By.linkText("Help"))).perform();

	}

}
