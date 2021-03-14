package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserControl extends Baseclass {
	
	/**
	 *  Method to  open chrome browser
	 */
	public void openBrowser() {
	
		if(BrowserType.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","src/main/java/thirdpartyTools/chromedriver" );
			browser =new ChromeDriver();
			
			browser.manage().window().maximize();
		}	
	}

	/**
	 * Method to close the browser
	 */
	public void closeBrowser() {
		if(browser != null) {
			browser.close();
		}
		
		
	}

}
