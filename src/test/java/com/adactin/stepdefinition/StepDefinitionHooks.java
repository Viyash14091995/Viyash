package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactincucumber.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class StepDefinitionHooks {
	
	@Before
	public void beforeHooks(Scenario scen) throws Throwable  {
      System.out.println("before hooks");
		System.out.println("Scenario name is" +scen.getName());	
		 if (scen.getName().contentEquals(scen.getName())) {
			Baseclass.Screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcept\\Screenshot\\s.png");
			 
		}
		
	}
	@After
	public void afterHooks(Scenario scen) throws Throwable {
     System.out.println("after hoooks");
	 System.out.println(scen.getStatus());
	 if (scen.getStatus().equals("PASSED")) {
		 Baseclass.Screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcept\\Screenshot\\s2.png");
	}else if (scen.isFailed()) {
		Baseclass.Screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumConcept\\Screenshot\\s3.png");
	}
	 
		
	}
	

}
