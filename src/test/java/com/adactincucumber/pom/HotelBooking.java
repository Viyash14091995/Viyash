package com.adactincucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
public static WebDriver driver;
	
	
@FindBy(id="first_name")
 private WebElement Firstname;

@FindBy(id="last_name")
private WebElement Lastname;

@FindBy(id="address")
private WebElement BillingAddress;

@FindBy(xpath="//*[@id=\"cc_num\"]")
private WebElement Creditcardno;

@FindBy(id="cc_type")
private WebElement CreditCardtype;

@FindBy(id="cc_exp_month")
private WebElement expmonth;

@FindBy(id="cc_exp_year")
private WebElement expyear;

@FindBy(id="cc_cvv")
private WebElement CVV;

@FindBy(id="book_now")
private WebElement booknow;

 public HotelBooking(WebDriver Bdriver) {
 this.driver=Bdriver;
 PageFactory.initElements(driver, this);	
	
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getFirstname() {
	return Firstname;
}

public WebElement getLastname() {
	return Lastname;
}

public WebElement getBillingAddress() {
	return BillingAddress;
}

public WebElement getCreditcardno() {
	return Creditcardno;
}

public WebElement getCreditCardtype() {
	return CreditCardtype;
}

public WebElement getExpmonth() {
	return expmonth;
}

public WebElement getExpyear() {
	return expyear;
}

public WebElement getCVV() {
	return CVV;
}

public WebElement getBooknow() {
	return booknow;
}












}
