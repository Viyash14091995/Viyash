package com.adactincucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(id = "login")
	private WebElement Login;

	public LoginPage(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

}
