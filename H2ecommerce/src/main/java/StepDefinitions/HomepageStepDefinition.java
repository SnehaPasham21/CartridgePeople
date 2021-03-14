package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.HomePage;
import Utilities.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/*** StepDefinitions maps the test case steps in the FeatureFile to code ***/

public class HomepageStepDefinition extends Baseclass {
	
	HomePage homePage = new HomePage();
	
	/*** Navigating to Cartridgepeople Homepage ****/
	
	@Given("I navigate to cartridgepeople Homepage")
	public void i_navigate_to_cartridgepeople_Homepage() throws InterruptedException {
		browser.get(Baseurl);
		
	}
	
	/*****  Hovering to Printers tab *****/
	
	@When("I hover on {string} and follow {string} link")
	public void i_hover_on_and_follow_link(String menuOption, String link) throws InterruptedException {
		Actions builder = new Actions(browser);
		 WebElement element = browser.findElement(By.linkText(menuOption));
		 builder.moveToElement(element).build().perform();
		 Thread.sleep(3000);
		 browser.findElement(By.linkText(link)).click();
		 Thread.sleep(3000);
	}
	
	/***** To Accept cookies message ****/
	
	@Given("I accept cookies message")
	public void i_accept_cookies_message() {
		homePage.acceptCookie();
	}

	

}
