package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Baseclass;

public class InkjetPrintersPage extends Baseclass {
	/***
	 * Properties
	 * 
	 */
	private String addToBasketContainer = "//div[@class='add-to-basket-container']";
	private String addToBasketButton = "//button[@class='add-to-button']";
	private String addToBasketPromptCloseButton = "//button[@class='close']";
	private String checkoutButton = "//a[@class='checkout']";
	
	/*****  ******* public Methods ******* *****/
	
	/* Method for Add to Basket Button
	 * 
	 */
	public void clickOnAddToBasketButton() {
		String basketContainerText = new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addToBasketContainer))).getText();
		
		if (basketContainerText.contains("This item is out of stock")) {
			System.out.println("This item is out of stock");
		} else {
			new WebDriverWait(browser, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(addToBasketButton))).click();
		}				
	}
	
	/*
	 *  Method for closing Add to Basket prompt
	 */
	public void closeAddToBasketPrompt() {
		try {
			new WebDriverWait(browser, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(addToBasketPromptCloseButton))).click();
		} catch (Exception e) {
			System.out.println("Add to basket prompt is not displayed");
		}
	}
	
	/*
	 * Method for clicking checkout Button
	 */
	public void clickOnCheckoutButton() {
		new WebDriverWait(browser, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutButton))).click();
	}
	
	

}
