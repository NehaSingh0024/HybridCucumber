package com.TestCases;
 

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.AdminSystemUser;
import com.Pages.Login;
import com.SeleniumReusableFunction.SeleniumUtilities;

public class AdminTest  extends Library {
 
		@BeforeTest
	    public void stratUp() {
	        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	       
	    }
	    @Test
	    public void GoToUser() { 
	    	AdminSystemUser clickUser=new AdminSystemUser();
	    	clickUser.GoToUser("Neha", "Neha123");
	    }
	    @AfterClass
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\Screenshots\\orangeHRMLogin.png");
	       
	        quit();
	       
	    }
 

}
