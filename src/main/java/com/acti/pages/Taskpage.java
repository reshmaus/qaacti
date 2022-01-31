package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.base.Driverscript;
import com.acti.utils.Common;

public class Taskpage extends Driverscript
{
	  @FindBy(xpath="//div[text()='Add New']")WebElement Addnewbtn;
	  @FindBy(xpath="//div[@class='item createNewCustomer']")WebElement newcustomeroption;
	  @FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")WebElement CustomernameTb;
	  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement customerDescriptiontextarea;
	  @FindBy(xpath="//div[@id='customerLightBox']//div[@class='dropdownButton']")WebElement selectcustomerdropdown;
	  @FindBy(xpath="//div[@class='searchItemList']//div[text()='Big Bang Company']")WebElement bigbangcompany;
	  @FindBy(xpath="//div[text()='Create Customer']")WebElement createcustomerbtn;
	  
	  public  Taskpage ()
	  {
	  	PageFactory.initElements(driver, this);
	  }
	  public void clickAddnewbtn()
	  {
		  Common.highlightelement(Addnewbtn);
		  Addnewbtn.click();
	  }
	  
	  public void clicknewcustomeroption()
	  {
		  Common.highlightelement(newcustomeroption);
		  newcustomeroption.click();
	  }
	  
	  public void  enterCustomername(String  customername)
	  {
		  Common.highlightelement( CustomernameTb);
		  CustomernameTb.sendKeys(customername);
	  }
	  
	 public void entercustomerdescription(String customerDescription)
	 {
		 Common.highlightelement(customerDescriptiontextarea);
		 customerDescriptiontextarea.sendKeys(customerDescription);
	 }
	 
	 
	 public void clickselectcustomerdropdown()
	 {
		 Common.highlightelement(selectcustomerdropdown);
		 selectcustomerdropdown.click();
		 
	 }
	 
	 public void clickbigbangcompany()
	 {
		 Common.highlightelement(bigbangcompany);
		bigbangcompany.click();
	 }
	  public void clickcreatecustomerbutton()
	  {
		  Common.highlightelement(createcustomerbtn);
		  createcustomerbtn.click();
	  }
	  
}
