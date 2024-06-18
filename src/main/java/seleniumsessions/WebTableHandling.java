package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
		
		System.out.println(getEmpInfo("Garry.White"));
		System.out.println(getEmpInfo("Joe.Root"));
		System.out.println(getEmpInfo("Jasmine.Morgan"));

	}
	
	public static List<String> getEmpInfo(String empName) {
		
		List<WebElement> infoList = driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
		List<String> empInfoList = new ArrayList<String>();
		
		for(WebElement e : infoList) {
			String text = e.getText();
			empInfoList.add(text);
		}
		
		return empInfoList;
	}
	

}
