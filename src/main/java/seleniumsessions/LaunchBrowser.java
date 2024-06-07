package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		String pageSource = driver.getPageSource();
		
		String actualTitle = driver.getTitle();
		
		System.out.println("title is :: "+actualTitle);
		
		if(actualTitle.equals("Google")) {
			System.out.println("TC:: PASS");
		}
		else {
			System.out.println("TC:: FAIL");
		}
		
		driver.quit();
		
	}
	
	

}
