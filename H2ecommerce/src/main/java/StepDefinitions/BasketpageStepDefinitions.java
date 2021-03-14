package StepDefinitions;

import static org.junit.Assert.*;

import PageObjects.BasketPage;
import Utilities.Baseclass;
import io.cucumber.java.en.Then;

public class BasketpageStepDefinitions extends Baseclass {
	
	//****************** Properties ***************/
	BasketPage basketPage = new BasketPage();
	
	
	//*************** Step definitions **************/
	
	@Then("I should see {string} in checkout page")
	public void i_should_see_in_checkout_page(String expectedProductDetails) {
	    String actualProductDetails = basketPage.getProductDetails();
	    assertEquals(expectedProductDetails, actualProductDetails);
	}
	
	@Then("I should see {string} quantity selected")
	public void i_should_see_quantity_selected(String expectedQuantity) {
	    String actualQuantity = basketPage.getQuantitySelected();
	    assertEquals(expectedQuantity, actualQuantity);
	}
	
	@Then("I should see {string} in item price")
	public void i_should_see_in_item_price(String expectedItemPrice) {
	    String actualItemPrice = basketPage.getItemPrice();
	    assertTrue(actualItemPrice.contains(expectedItemPrice));
	}
	
	@Then("I should see {string} in total price")
	public void i_should_see_in_total_price(String expectedTotalPrice) {
	    String actualTotalPrice = basketPage.getTotalPrice();
	    assertTrue(actualTotalPrice.contains(expectedTotalPrice));
	}

}
