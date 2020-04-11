package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.adactincucumber.baseclass.Baseclass;
import com.adactincucumber.pom.BookingConfirmation;
import com.adactincucumber.pom.HotelBooking;
import com.adactincucumber.pom.LoginPage;
import com.adactincucumber.pom.SearchHotel;
import com.adactincucumber.pom.SelectHotel;


import io.cucumber.java.en.When;
import io.cucumber.java.en.*;


public class StepDefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User has to login$")
	public void user_has_to_login() throws IOException {
		String geturl = FileReaderManager.getInstance().getcrInstane().geturl();
		geturl(geturl);
		implicitwait(30);
	}
	@Given("User to launch the application")
	public void user_to_launch_the_application() {
	 System.out.println("User launch the browser before every page begins");
	}

	@When("User to login the application")
	public void user_to_login_the_application() {
	   System.out.println("login repeats the browser navigated to next page");
	}

	@When("User Enter Username {string} in the usernamefield")
	public void user_Enter_Username_in_the_usernamefield(String string) {
		inputValueOnElements(pom.getlp().getUsername(), string);

	}

	@When("User Enter password {string}  in the passwordfield")
	public void user_Enter_password_in_the_passwordfield(String string) {
		inputValueOnElements(pom.getlp().getPassword(), string);
	}

	@And("^User Click On login Button$")
	public void user_Click_On_login_Button() {
		Clicks(pom.getlp().getLogin());

	}

	@Then("^User Navigates to Homepage$")
	public void user_Navigates_to_Homepage() {
		System.out.println("Navigates to Search hotel page");

	}

	@Given("^User navigated to Search Hotel page$")
	public void user_navigated_to_Search_Hotel_page() {
		System.out.println("Navigated to Search hotel page");
	}

	@When("^User select one location from Locationfield$")
	public void user_select_one_location_from_Locationfield() {
		dropDown(pom.getsp().getLocation(), "value", "New York");

	}

	@When("^User select  one Hotel from Hotelfield$")
	public void user_select_one_Hotel_from_Hotelfield() {
		dropDown(pom.getsp().getHotels(), "value", "Hotel Creek");
	}

	@When("^User select one Roomtype from Roomtypefield$")
	public void user_select_one_Roomtype_from_Roomtypefield() {
		dropDown(pom.getsp().getRoomtype(), "value", "Standard");

	}

	@When("^User select NumberofRooms from NumberofRoomsfield$")
	public void user_select_NumberofRooms_from_NumberofRoomsfield() {
		dropDown(pom.getsp().getRoomnos(), "value", "1");
	}

	@When("^User enter valid Date in Checkindatefield$")
	public void user_enter_valid_Date_in_Checkindatefield() {
		inputValueOnElements(pom.getsp().getCheckIntime(), "14/09/2020");
	}

	@When("^User enter valid Date in Checkoutdatefield$")
	public void user_enter_valid_Date_in_Checkoutdatefield() {
		inputValueOnElements(pom.getsp().getCheckIntime(), "15/09/2020");

	}

	@When("^User select Adults perroom from Adults perroomfield$")
	public void user_select_Adults_perroom_from_Adults_perroomfield() {
		dropDown(pom.getsp().getAdultsperroom(), "value", "2");
	}

	@When("^User Select Children perroom from Children perroomfield$")
	public void user_Select_Children_perroom_from_Children_perroomfield() {
		dropDown(pom.getsp().getChildrensperroom(), "value", "2");

	}

	@When("^User click on Search button$")
	public void user_click_on_Search_button() {
		Clicks(pom.getsp().getSubmit());

	}
	@Then("^User Navigates to Selected hotel details page\\.$")
	public void user_Navigates_to_Selected_hotel_details_page() {
		System.out.println("Navigates to Selected hotel page");
	}
	@Given("^User Navigated to Selected Hotel Details page$")
	public void user_Navigated_to_Selected_Hotel_Details_page() {
		System.out.println("Navigated to selected hotel page ");
	}

	@When("^User Check the Details of the Hotel And select the Details$")
	public void user_Check_the_Details_of_the_Hotel_And_select_the_Details() {
		Clicks(pom.getsh().getSelect());

	}

	@When("^User Click on Continue button$")
	public void user_Click_on_Continue_button() {
		Clicks(pom.getsh().getContinue());

	}

	@Then("^User Navigates to Hotel Booking Page\\.$")
	public void user_Navigates_to_Hotel_Booking_Page() {
		System.out.println("Navigates to Hotel booking page");
	}

	@Given("^User Navigated to Hotel Booking Page$")
	public void user_Navigated_to_Hotel_Booking_Page() {
		System.out.println("Navigated to Hotel booking page");
	}

	@When("User Enter valid Firstname {string} in the Firstnamefield")
	public void user_Enter_valid_Firstname_in_the_Firstnamefield(String string) {
		inputValueOnElements(pom.gethb().getFirstname(), string);
	}

	@When("User Enter Valid Lastname {string} in the Lastnamefield")
	public void user_Enter_Valid_Lastname_in_the_Lastnamefield(String string) {
		inputValueOnElements(pom.gethb().getLastname(), string);
	}

	@When("User Enter Valid Address {string} in the Billingaddressfield")
	public void user_Enter_Valid_Address_in_the_Billingaddressfield(String string) {
		inputValueOnElements(pom.gethb().getBillingAddress(), string);
	}

	@When("User Enter Valid Input Number {string} in Creditcardnofield")
	public void user_Enter_Valid_Input_Number_in_Creditcardnofield(String string) {
		inputValueOnElements(pom.gethb().getCreditcardno(), string);
	}

	@When("^User Select One CreditCardtype from CreditcardTypefield$")
	public void user_Select_One_CreditCardtype_from_CreditcardTypefield() {
		dropDown(pom.gethb().getCreditCardtype(), "value", "VISA");
	}

	@When("^User Select One Month and Year from ExpiryDatefield$")
	public void user_Select_One_Month_and_Year_from_ExpiryDatefield() {
		dropDown(pom.gethb().getExpmonth(), "value", "2");
		dropDown(pom.gethb().getExpyear(), "value", "2022");
	}

	@When("User Enter Valid InputNumber {string} in the CVVfield")
	public void user_Enter_Valid_InputNumber_in_the_CVVfield(String string) {
		inputValueOnElements(pom.gethb().getCVV(), string);
	}

	@When("^User Click on Booknow Button$")
	public void user_Click_on_Booknow_Button() {
		Clicks(pom.hb.getBooknow());
	}

	@Then("^User Navigates to Hotel Booking Confirmation Page\\.$")
	public void user_Navigates_to_Hotel_Booking_Confirmation_Page() {
		System.out.println("Navigates to hotel booking confirmation page");
	}

	@Given("^User Navigated to Hotel Booking Confirmation Page$")
	public void user_Navigated_to_Hotel_Booking_Confirmation_Page() {
		System.out.println("Navigated to Hotel booking confirmation page ");
	}

	@When("^User Checks Hotel Booking Confirmation Page that all Details are being Displayed$")
	public void user_Checks_Hotel_Booking_Confirmation_Page_that_all_Details_are_being_Displayed() {
		System.out.println("Checks Hotel booking Confirmation page");
	}

	@When("^User Click on Logout Button$")
	public void user_Click_on_Logout_Button() {
		Clicks(pom.getbc().getLogout());
	}

	@Then("^User Navigates to Exitpage\\.$")
	public void user_Navigates_to_Exitpage() {
		Assert.assertEquals(""," ");
		System.out.println("Navigates to exit page");
	}

}