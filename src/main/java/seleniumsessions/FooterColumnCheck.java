package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumnCheck {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Thread.sleep(5000);
		
		System.out.println(getFooterHeaderText("Amazon Science"));
		System.out.println(getFooterHeaderText("Careers"));
		System.out.println(getFooterHeaderText("Help"));
	
	}
	
	
	public static String getFooterHeaderText(String text) {
		
		String footerHeaderText = driver
					.findElement(By.xpath("//a[text()='"+text+"']/parent::li//parent::ul/parent::div/div"))
						.getText();
		
		return footerHeaderText;
		
		////a[text()='Garry.White']/parent::td/preceding-sibling::td/input
		
	}

}
