package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {


	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("narendra modi");
		
		Thread.sleep(5000);
		
	List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span"));
	
	for(WebElement e: suggestionList) {
		String text = e.getText();
		System.out.println(text);
		if(text.contains("education")) {
			e.click();
			break;
		}
	}
	}

}
