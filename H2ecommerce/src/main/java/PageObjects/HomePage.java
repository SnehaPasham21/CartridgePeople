package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Baseclass;

public class HomePage extends Baseclass {
	
	//******************** Properties *********************//
	
	private String cookieAcceptButton = "//a[@id='CybotCookiebotDialogBodyButtonAccept']";
	
	
	//********************* Public Methods ****************//
	
	/*
	 * Method to accept Cookie
	 * 
	 */
	public void acceptCookie() {		
		new WebDriverWait(browser, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(cookieAcceptButton))).click();
	}

}
