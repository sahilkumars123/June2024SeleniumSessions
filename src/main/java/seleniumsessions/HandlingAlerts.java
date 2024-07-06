package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();
		
		
		//1. JS Alert
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.dismiss();
		//alert.accept();

		
		//2. 
		
		
		//3.
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.sendKeys("sahil");
		alert.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		
		String actualResult = result.split(":")[1].trim();
		
		if(actualResult.equals("sahil")) {
			System.out.println("TC:PASS");
		}
		
	}

}
