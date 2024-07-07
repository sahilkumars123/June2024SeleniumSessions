package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2); //index
		//driver.switchTo().frame("main"); //name or id
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));//webelement
		
		String title = driver.findElement(By.tagName("h2")).getText();
		System.out.println(title);
	
		
		driver.switchTo().defaultContent(); //main page
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		

	}

}
