package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.Login;

import com.SeleniumReusableFunction.SeleniumUtilities;

public class LoginTestCase  extends Library {
 
		@BeforeTest
	    public void stratUp() {
	        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	       
	    }
	    @Test
	    public void login() {
	    	Login lpage=new Login(driver);
	        lpage.login("Admin", "admin123");
	       
	    }
	    @AfterClass
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\Screenshots\\orangeHRMLogin.png");
	       
	        quit();
	       
	    }
 

}
