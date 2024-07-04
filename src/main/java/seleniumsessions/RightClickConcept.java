package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rigthlickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rigthlickEle).build().perform();
		
		
		 List<WebElement> listOfEle = driver.findElements(By.xpath("(//ul[@class='context-menu-list context-menu-root']/li)/span"));
		 
		 for(WebElement e: listOfEle) {
			 String text = e.getText();
			 System.out.println(text);
			 if(text.equals("Paste")) {
				 e.click();
				 break;
			 }
		 }
	}

}
