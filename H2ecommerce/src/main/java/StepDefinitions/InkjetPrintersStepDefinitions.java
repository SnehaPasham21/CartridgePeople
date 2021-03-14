package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.InkjetPrintersPage;
import Utilities.Baseclass;
import io.cucumber.java.en.When;

public class InkjetPrintersStepDefinitions extends Baseclass {
	
	/*** Properties ***/
	
	InkjetPrintersPage inkjetPrintersPage = new InkjetPrintersPage();
	
	/** To select an item from the List ***/
	
	@When("I select {string} from the list")
	public void i_select_from_the_list(String linkText) {
	    new WebDriverWait(browser, 10).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText))).click();
	}
	
	/*** For adding selected printer to basket ***/
	
	@When("I add the printer to the basket")
	public void i_add_the_printer_to_the_basket() {
		inkjetPrintersPage.clickOnAddToBasketButton();
	}
	
	/*** To close the prompt box ***/
	
	@When("I close the add to basket prompt")
	public void i_close_the_add_to_basket_prompt() {
	    inkjetPrintersPage.closeAddToBasketPrompt();
	}
	
	/*** To click on checkout button ***/
	
	@When("I click on checkout button")
	public void i_click_on_checkout_button() {
	    inkjetPrintersPage.clickOnCheckoutButton();
	}

}
