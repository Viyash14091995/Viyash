$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/adactincucumber/feature/Adactin.feature");
formatter.feature({
  "name": "Testing HotelBooking Functionality on adactin application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_to_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to login the application",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "\tUser Checking the Functionality of Hotel Booking Confirmation Page by Using Valid Details ",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Navigated to Hotel Booking Confirmation Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigated_to_Hotel_Booking_Confirmation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Checks Hotel Booking Confirmation Page that all Details are being Displayed",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Checks_Hotel_Booking_Confirmation_Page_that_all_Details_are_being_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Logout Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Click_on_Logout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Exitpage.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Exitpage()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[ ]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Exitpage(StepDefinition.java:216)\r\n\tat ✽.User Navigates to Exitpage.(file:///C:/Users/Lenovo/eclipse-workspace/Adactincucumber/src/test/java/com/adactincucumber/feature/Adactin.feature:54)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});