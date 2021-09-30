package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

 
	public class AdminSystemUser extends Library{
	@FindBy(id="menu_admin_viewAdminModule")
    WebElement hover1;
    @FindBy(id="menu_admin_viewSystemUsers")
    WebElement click; 
//    @FindBy(id="searchSystemUser_userType")
//    WebElement DayDropDown;
    @FindBy(id="searchSystemUser_employeeName_empName")
    WebElement Name; 
    @FindBy(id="searchSystemUser_userName")
    WebElement UserName; 
//    @FindBy(id="searchSystemUser_status")
//    WebElement YearDropDown; 
    
 
     
     
    

        

    public void GoToUser(String name, String Uname) { 
        hover1.click(); 
        click.click();
        Name.sendKeys(name);
        UserName.sendKeys(Uname);
//        DayDropDown.selectByValue(DayDrop); , String DayDrop, String YearDrop 
//        YearDropDown.selectByIndex(YearDrop);
        

    }
    
}
