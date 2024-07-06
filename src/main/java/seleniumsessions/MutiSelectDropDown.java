package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutiSelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://html.com/attributes/select-multiple/");

		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.tagName("select"));
		
		Select select = new Select(dropDown);
		
		if(select.isMultiple()) {
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Chilean flamingo");
		}
		
		//select.deselectAll();
		select.deselectByVisibleText("Chilean flamingo");

	}

}
