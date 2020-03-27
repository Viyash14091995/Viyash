package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactincucumber.pom.BookingConfirmation;
import com.adactincucumber.pom.HotelBooking;
import com.adactincucumber.pom.LoginPage;
import com.adactincucumber.pom.SearchHotel;
import com.adactincucumber.pom.SelectHotel;

public class PageObjectManager {

	public static WebDriver driver;

	public static LoginPage lp;
	public static SearchHotel sp;
	public static SelectHotel sh;
	public static HotelBooking hb;
	public static BookingConfirmation bc;

	public PageObjectManager(WebDriver Ldriver) {
		this.driver = Ldriver;
	}

	public static LoginPage getlp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public static SearchHotel getsp() {
		sp = new SearchHotel(driver);
		return sp;
	}

	public static SelectHotel getsh() {
		sh = new SelectHotel(driver);
		return sh;
	}

	public static HotelBooking gethb() {
		hb = new HotelBooking(driver);
		return hb;
	}

	public BookingConfirmation getbc() {
		bc = new BookingConfirmation(driver);
		return bc;
	}

}
