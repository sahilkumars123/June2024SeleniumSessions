package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		WebElement level1 = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']"));
//		Actions act = new Actions(driver);
//		act.click(level1).perform();
//		Thread.sleep(1500);
//		
//		WebElement level2 = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(level2).perform();
//		Thread.sleep(1500);
//		
//		WebElement level3 = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(level3).perform();
//		Thread.sleep(1500);
//		
//		WebElement level4 = driver.findElement(By.linkText("Green Tea"));
//		act.click(level4).perform();

		By shopByCategory = By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']");

		multiLevelMenuHandling(shopByCategory, "Beverages", "Tea", "Green Tea");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement getElementByText(String text) {
		return driver.findElement(By.linkText(text));
	}

	public static void multiLevelMenuHandling(By level1locator, String level2locator, String level3locator,
			String level4locator) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1locator)).click().perform();
		Thread.sleep(1500);

		act.moveToElement(getElementByText(level2locator)).perform();
		Thread.sleep(1500);

		act.moveToElement(getElementByText(level3locator)).perform();
		Thread.sleep(1500);

		act.click(getElementByText(level4locator)).perform();
	}

	public static void multiLevelMenuHandling(By level1locator, String level2locator, String level3locator) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1locator)).click().perform();
		Thread.sleep(1500);

		act.moveToElement(getElementByText(level2locator)).perform();
		Thread.sleep(1500);

		act.moveToElement(getElementByText(level3locator)).perform();
		Thread.sleep(1500);
	}

}
