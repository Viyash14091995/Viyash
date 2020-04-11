package com.adactin.runner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactincucumber.baseclass.Baseclass;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "@Report/failedScenario.txt", 
                 glue = "com\\adactin\\stepdefinition", 
		         plugin={"pretty","html:Report/rerunReport.html"},//"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"},
		         
		         monochrome = true, dryRun = false, strict = true)


public class Re_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void SetUp() throws IOException, InterruptedException {
		String browsername = FileReaderManager.getInstance().getcrInstane().getBrowserName();
		driver = Baseclass.browserlaunch(browsername);
		Thread.sleep(2000);
	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}

	
}

	

