Feature: Testing HotelBooking Functionality on adactin application 
Background: 
	Given User to launch the application 
	When User to login the application 
	
Scenario Outline: User Checking the Functionality of Login page 
	Given User has to login 
	When User Enter Username "<username>" in the usernamefield 
	And User Enter password "<password>"  in the passwordfield 
	And User Click On login Button 
	Then User Navigates to Homepage 
	
	Examples: 
		|username|password|
		|aaaaaa|12345678|
		|Viyashgandhi|1234567|
		
Scenario: User Checking the Search Hotel page Functionality by Using valid details that required to fill 
	Given User navigated to Search Hotel page 
	When  User select one location from Locationfield 
	And User select  one Hotel from Hotelfield 
	And User select one Roomtype from Roomtypefield 
	And User select NumberofRooms from NumberofRoomsfield 
	And User select Adults perroom from Adults perroomfield 
	And User Select Children perroom from Children perroomfield 
	And User click on Search button 
	Then User Navigates to Selected hotel details page. 
	
Scenario: User Checking the Functionality of Selected Hotel Details page 
	Given User Navigated to Selected Hotel Details page 
	When User Check the Details of the Hotel And select the Details 
	And User Click on Continue button 
	Then User Navigates to Hotel Booking Page. 
	
Scenario: 
	User Checking the Hotel Booking page Functionality by Using Valid Details 
	Given User Navigated to Hotel Booking Page 
	When User Enter valid Firstname "Viyash" in the Firstnamefield 
	And User Enter Valid Lastname "gandhi" in the Lastnamefield 
	And User Enter Valid Address "list street" in the Billingaddressfield 
	And User Enter Valid Input Number "1234567891011123" in Creditcardnofield 
	And User Select One CreditCardtype from CreditcardTypefield 
	And User Select One Month and Year from ExpiryDatefield 
	And User Enter Valid InputNumber "315" in the CVVfield 
	And User Click on Booknow Button 
	Then User Navigates to Hotel Booking Confirmation Page. 
	
	
Scenario: 
	User Checking the Functionality of Hotel Booking Confirmation Page by Using Valid Details 
	Given User Navigated to Hotel Booking Confirmation Page 
	When User Checks Hotel Booking Confirmation Page that all Details are being Displayed 
	And User Click on Logout Button 
	Then User Navigates to Exitpage. 
	
	
	
 