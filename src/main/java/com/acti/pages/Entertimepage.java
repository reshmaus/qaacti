package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.Driverscript;
import com.acti.utils.Common;

public class Entertimepage extends Driverscript
{
  @FindBy(id="container_tasks")WebElement tasksmenu;
  @FindBy(xpath="//a[@class='userProfileLink username ']")WebElement userloggedname;
  @FindBy(id="logoutLink")WebElement Logoutlink;
  

public Entertimepage ()
{
	PageFactory.initElements(driver, this);
}
public void clickLogoutlink(){
	Common.highlightelement(Logoutlink);
	Logoutlink.click();
}
public void clicktasksmenu(){
	Common.highlightelement(tasksmenu);
	tasksmenu.click();
}
public String getuserloggednametext(){ 
	Common.highlightelement(userloggedname);
	 return userloggedname.getText();

}
}