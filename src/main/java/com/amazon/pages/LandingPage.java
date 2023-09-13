package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	Actions action;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement HoverMouseOnHelloSign;
	
	@FindBy(linkText = "Sign in")
	private WebElement singinButton;
	
	@FindBy(id = "ap_email")
	private WebElement emailField;
	
	@FindBy(id = "continue")
	private WebElement continueButton;

	public void HoverOnPointer() {
		action.moveToElement(HoverMouseOnHelloSign).build().perform();
	}
	
	public void clickOnSignin() {
		singinButton.click();
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void clickOnContinueButtion() {
		continueButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
