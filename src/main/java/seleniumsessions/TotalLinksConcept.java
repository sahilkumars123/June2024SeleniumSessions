package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
				// open any url
				// get the count of links on the page	
				// print the text of each link on the console
				// but ignore blank text
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		By totalLinks = By.tagName("a");
		
	int count =	getElementLinksCount(totalLinks);
	
	System.out.println("count of total element present on the webpasge:: "+count);
	
	 List<String> links = getElementText(totalLinks);
	 System.out.println(links);
		
	//	List<WebElement> linksList =  driver.findElements(totalLinks);
		
//		int count = linksList.size();
//		
//		System.out.println(count);
		
		//index based loop
//		for(int i=0; i<count; i++) {
//			String text = linksList.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
		
		
		//for-each loop
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}

	}
	
	
	public static List<String> getElementText(By locator) {
		List<WebElement> linksList = getElements(locator);
		List<String> linksListText = new ArrayList<String>();
		
		for(WebElement e : linksList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				//System.out.println(text);
				linksListText.add(text);
			}
		}
		return linksListText;
	}
	
	public static int getElementLinksCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	

}
