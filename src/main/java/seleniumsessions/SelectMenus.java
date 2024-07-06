package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMenus {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		Thread.sleep(1500);
		

		List<WebElement> menus = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));

		for (WebElement e : menus) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Group 2, option 2")) {
				e.click();
				break;
			}
		}

	}

}
