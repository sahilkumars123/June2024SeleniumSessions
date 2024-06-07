package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyCloseVsQuit {

	public static void main(String[] args) {

		
		//case 1: quit
		
		WebDriver driver = new ChromeDriver(); //sid = 123
		
		driver.get("https://www.google.com"); //123
		
		String title = driver.getTitle(); //123
		
		System.out.println(driver.getCurrentUrl()); //https://www.google.com/ //123
		
		driver.quit(); //123
		
		//driver.close();
		
		//QUIT >> Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//CLOSE >> Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		String actTitle = driver.getTitle();
		
		System.out.println("actual title is:: "+actTitle);
	}

}
