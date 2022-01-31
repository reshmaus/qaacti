package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.Driverscript;
import com.acti.utils.Common;

/*
 * script-loginpage
 * tester-reshma
 * verified by-reshma
 * date created-1/27/2022
 * date modified-1/27/2022
 */

public class Loginpage extends Driverscript
{
//************************page elements********************************************//
	
	@FindBy(id="whiteBoxWithLogo")WebElement actilogo;
	@FindBy(id="username")WebElement usernameTb;
	@FindBy(name="pwd")WebElement passwordTb;
	@FindBy(id="loginButton")WebElement loginbtn;
	
//************************page Initialization********************************************//
	//pagefactory is a class in POM which is used to intialize the page element of the class
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//************************Action/methods*********************//
	
	
	public  boolean verifyactilogo()
	{
		return actilogo.isDisplayed();
	}
	
	public void validatelogin(String username,String password)
	{
		Common.highlightelement(usernameTb);
		usernameTb.sendKeys("admin");
		Common.highlightelement(passwordTb);
		 passwordTb.sendKeys("manager");
		 Common.highlightelement(loginbtn);
		 loginbtn.click();
	}
	
	public String verifyloginpagetitle()
	{
		return driver.getTitle();
	}
	
	
}
