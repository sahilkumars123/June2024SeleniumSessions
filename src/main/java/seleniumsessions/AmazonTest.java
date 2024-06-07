package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser(browserName);
		
		brUtil.enterURL("https://www.google.com");
		
		String actTitle = brUtil.getTitle();
		
		if(actTitle.equals("Google")) {
			System.out.println("TC::PASS");
		}
		else {
			System.out.println("TC::FAIL");
		}
		
		brUtil.quitBrowser();
	}

}
