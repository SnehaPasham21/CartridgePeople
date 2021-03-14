package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Baseclass;

public class BasketPage extends Baseclass {
	
	/*** Properties ***/
	private String productDetails = "//div[@class='product-detail']/a";
	private String quantitySelected = "//div[@class='product-quantity']/select//option[@selected='selected']";
	private String itemPrice = "//div[@class='individual-price individual-price--single']/span/span[2]";
	private String totalPrice = "//div[@class='line-total']/div/span/span[2]";
	
	/* Method to get ProductDetails 
	 * 
	 */
	
	public String getProductDetails() {
		return new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productDetails))).getText();
	}
	
	/*** Method to get Quantity selected ***/
	
	public String getQuantitySelected() {
		return new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(quantitySelected))).getText();
	}
	
	/* Method to get ItemPrice 
	 * 
	 */
	
	public String getItemPrice() {
		return new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemPrice))).getText();
	}
	
	/*
	 *  Method to get Total price of the item added to basket 
	 */
	
	public String getTotalPrice() {
		return new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(totalPrice))).getText();
	}

}
