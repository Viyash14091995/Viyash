package com.adactincucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
 public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(xpath="//*[@id=\"datepick_in\"]")
	private WebElement CheckIntime;
	
	@FindBy(xpath="//*[@id=\"datepick_out\"]")
	private WebElement CheckOuttime;
	
	@FindBy(id="adult_room")
	private WebElement Adultsperroom;
	
	@FindBy(id="child_room")
	private WebElement Childrensperroom ;
	
	@FindBy(id="Submit")
	private WebElement Submit ;
	
	public SearchHotel(WebDriver Sdriver) {
		this.driver=Sdriver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckIntime() {
		return CheckIntime;
	}

	public WebElement getCheckOuttime() {
		return CheckOuttime;
	}

	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}

	public WebElement getChildrensperroom() {
		return Childrensperroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
}
