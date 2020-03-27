package com.adactincucumber.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.security.auth.callback.ConfirmationCallback;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("WebDriver.ie.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcepts\\Drivers\\geckoDriverServer.exe ");
				driver = new FirefoxDriver();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueOnElements(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Clicks(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
		}

	}

	public static void navigate(String value) {
		try {
			driver.navigate().to(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void robot() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
		}
	}

	public void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getText(WebElement element) {
		try {
			element.getText();
		} catch (Exception e) {
		}
	}

	public void GetAttribute(WebElement element, String attributename) {
		try {
			element.getAttribute(attributename);
		} catch (Exception e) {
		}

	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public static void Action(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void Action1(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	public static void Action2(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	public static void dropDown(WebElement element, String option, String input) {
		try {
			Select s = new Select(element);
			if (option.equals("index")) {
				int parseInt = Integer.parseInt(input);
				s.selectByIndex(parseInt);
			}

			else if (option.equals("value")) {
				s.selectByValue(input);
			}

			else if (option.equals("text")) {
				s.selectByVisibleText(input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void simpleAlert() {
		try {
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void confirmAlert(String confirmation) {
		try {
			if (confirmation.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			} else if (confirmation.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("invalid option");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void promptAlert(String confirmation, String message) {
		try {
			if (confirmation.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().sendKeys(message);
				driver.switchTo().alert().accept();
			} else if (confirmation.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(message);
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void Screenshot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("value");
		FileUtils.copyFile(SrcFile, desFile);
	}

	public static void frames(int i) {
		try {
			driver.switchTo().frame(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void multiframes(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dragandDrop(WebElement source, WebElement target) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitwait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void explicitwait(int seconds, WebElement element) {
		WebDriverWait Wait = new WebDriverWait(driver, seconds);
		Wait.until(ExpectedConditions.visibilityOf(element));
	}

}
