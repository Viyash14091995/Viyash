package com.adactincucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	public static WebDriver driver;

	@FindBy(xpath="//*[@id='logout']")
	private WebElement Logout;

	public BookingConfirmation(WebDriver Bdriver) {
		this.driver=Bdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLogout() {
		return Logout;
	}
	
}
