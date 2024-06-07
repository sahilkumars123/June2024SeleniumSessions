package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0. valid but recommended only for the specific browser
		// ChromeDriver driver = new ChromeDriver();

		// 1. valid but not recommended
		SearchContext sc = new ChromeDriver();

		// 2. valid and recommended -
		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();

		// 3. valid and recommended
		// RemoteWebDriver driver = new ChromeDriver();

		// 4.
		// ChromiumDriver driver = new ChromeDriver();
		// ChromiumDriver driver = new EdgeDriver();

		// 5. valid and recommended -- used for remote execution/sel grid/cloud/docker -
		// aws/browser stack/LT
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 6. valid but not recommended
		// SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities);

	}

}
