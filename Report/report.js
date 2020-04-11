$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/adactincucumber/feature/Adactin.feature");
formatter.feature({
  "name": "Testing HotelBooking Functionality on adactin application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Checking the Functionality of Login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to login",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enter Username \"\u003cusername\u003e\" in the usernamefield",
  "keyword": "When "
});
formatter.step({
  "name": "User Enter password \"\u003cpassword\u003e\"  in the passwordfield",
  "keyword": "And "
});
formatter.step({
  "name": "User Click On login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User Navigates to Homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "aaaaaa",
        "12345678"
      ]
    },
    {
      "cells": [
        "Viyashgandhi",
        "1234567"
      ]
    }
  ]
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
  "name": "User Checking the Functionality of Login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_has_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Username \"aaaaaa\" in the usernamefield",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Username_in_the_usernamefield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter password \"12345678\"  in the passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_password_in_the_passwordfield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click On login Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Click_On_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 9.992\n  (Session info: chrome\u003d80.0.3987.163)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-9POL9LP6\u0027, ip: \u0027192.168.43.91\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.163, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:65532}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a45fcc243745b3719cde40a4648d16da\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat com.adactincucumber.baseclass.Baseclass.Screenshot(Baseclass.java:236)\r\n\tat com.adactin.stepdefinition.StepDefinitionHooks.beforeHooks(StepDefinitionHooks.java:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_to_launch_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User to login the application",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "User Checking the Functionality of Login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_has_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enter Username \"Viyashgandhi\" in the usernamefield",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Username_in_the_usernamefield(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enter password \"1234567\"  in the passwordfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_password_in_the_passwordfield(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click On login Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Click_On_login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Navigates to Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "name": "User Checking the Search Hotel page Functionality by Using valid details that required to fill",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigated to Search Hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_navigated_to_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select one location from Locationfield",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_select_one_location_from_Locationfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select  one Hotel from Hotelfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_select_one_Hotel_from_Hotelfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select one Roomtype from Roomtypefield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_select_one_Roomtype_from_Roomtypefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select NumberofRooms from NumberofRoomsfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_select_NumberofRooms_from_NumberofRoomsfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Adults perroom from Adults perroomfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_select_Adults_perroom_from_Adults_perroomfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Children perroom from Children perroomfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Select_Children_perroom_from_Children_perroomfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Selected hotel details page.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Selected_hotel_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "User Checking the Functionality of Selected Hotel Details page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Navigated to Selected Hotel Details page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigated_to_Selected_Hotel_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Check the Details of the Hotel And select the Details",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Check_the_Details_of_the_Hotel_And_select_the_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Click_on_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Hotel Booking Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Hotel_Booking_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "description": "\tUser Checking the Hotel Booking page Functionality by Using Valid Details ",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Navigated to Hotel Booking Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigated_to_Hotel_Booking_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter valid Firstname \"Viyash\" in the Firstnamefield",
  "keyword": "When "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_valid_Firstname_in_the_Firstnamefield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Lastname \"gandhi\" in the Lastnamefield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Valid_Lastname_in_the_Lastnamefield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Address \"list street\" in the Billingaddressfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Valid_Address_in_the_Billingaddressfield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Input Number \"1234567891011123\" in Creditcardnofield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Valid_Input_Number_in_Creditcardnofield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select One CreditCardtype from CreditcardTypefield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Select_One_CreditCardtype_from_CreditcardTypefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select One Month and Year from ExpiryDatefield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Select_One_Month_and_Year_from_ExpiryDatefield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid InputNumber \"315\" in the CVVfield",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Enter_Valid_InputNumber_in_the_CVVfield(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Booknow Button",
  "keyword": "And "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Click_on_Booknow_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigates to Hotel Booking Confirmation Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.adactin.stepdefinition.StepDefinition.user_Navigates_to_Hotel_Booking_Confirmation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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