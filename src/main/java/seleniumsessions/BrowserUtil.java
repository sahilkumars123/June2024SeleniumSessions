package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;

	public void launchBrowser(String browserName) {
		
		if(browserName == null) {
			System.out.println("BROWSER CANNOT BE NULL");
		}
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please enter the valid browser name:: "+browserName);
		}
	}
	
	public void enterURL(String url) {
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			System.out.println("enter the valid url with http(s)");
		}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
