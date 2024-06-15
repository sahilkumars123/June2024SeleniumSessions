package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");
		

		//xpath: address of the element in HTML DOM\
		//1. absolute xpath: /html/body/div/div/div[2]/ul/li[4]/a
		//2. relative xpath/custom xpath: using attributes, using xpath functions
		
		
		//htmltag[@attr='value']
		//input[@placeholder='E-Mail Address']
		
		
		//htmltag[@attr1='value' and @attr2='value']
		//input[@name='username' and @placeholder='Username']
		//input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']
		//in  xpath you have to put the full class name
		
		//where as in By.classname("oxd-input"); --- unique classname which is identifying unique element
		

		//By e1 = By.xpath("//input[@class='form-control private-form__control login-email']");//valid
		By e2 = By.className("login-email");
		//By e3 = By.className("form-control private-form__control login-email");
		
		
		
	}

}
