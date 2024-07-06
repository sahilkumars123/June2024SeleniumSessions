package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		
		List<WebElement> selectMenus = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));

	
		for(WebElement e: selectMenus) {
			 String text = e.getText();
			 System.out.println(text);
			 if(text.equals("Group 2, option 2")) {
				 e.click();
				 break;
			 }
		}
	}

}
