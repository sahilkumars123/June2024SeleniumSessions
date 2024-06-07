package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		//headless: No browser
		//invisible browser//without UI
		//testing happening behind the scene
		//faster than the normal
		//when to use? Linux OS, Jenkins, Docker, NON UI
		//might not work for complex html, navigations, responsive testing:
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
//		Use addArguments(String). 
//		Recommended to use '--headless=chrome' as argument for browsers v94-108. 
//		Recommended to use '--headless=new' as argument for browsers v109+.
		//--headless
//		Example: `addArguments("--headless=new")`.
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		
		WebDriver driver1 = new FirefoxDriver(fo);
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());
	}

}
