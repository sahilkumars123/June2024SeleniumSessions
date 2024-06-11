package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		//driver.findElement(firstName).sendKeys(null); --- EXCEPTION:: Illigal Argument Exception
		//driver.findElement(firstName).sendKeys("");
		//driver.findElement(firstName).sendKeys(" ");
		//driver.findElement(firstName).sendKeys(123);
		
		String str = "sahil";
		StringBuilder sb = new StringBuilder("sahil");
		StringBuffer sbi = new StringBuffer("ravi");
		
		//driver.findElement(firstName).sendKeys(str+sbi+sb);
		driver.findElement(firstName).sendKeys(str,sbi,sb);
		

	}

}
