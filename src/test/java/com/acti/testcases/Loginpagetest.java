package com.acti.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.Driverscript;
import com.acti.pages.Loginpage;

/*
 * script-TCloginpage
 * tester-
 * verified by
 * date created-1/27/2022
 * date modified-1/27/2022
 */

public class Loginpagetest extends Driverscript
{
	Loginpage lp;
	
	public Loginpagetest()
	{
		//super key is used to call the parent class constructor
	super();	
	}
@BeforeMethod
public void pretest(){
	initapp();
    lp = new Loginpage();
}
@AfterMethod
public void posttest(){
	driver.close();
}
/*@Test(priority=1)
public void testverifyactilogo()
  {
	boolean flag = lp.verifyactilogo();
	Assert.assertTrue(flag);
	}
@Test(priority=2)
public void testloginpagetitle()
  {
	String title = lp.verifyloginpagetitle();
	Assert.assertEquals("actiTIME - Login", title);
  }
@Test(priority=3)
public void testvalidateloginfunction(){
	lp.validatelogin("admin", "manager");
  }*/
@Test(priority=4)
public void testvalidateloginfunction(){
	lp.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
  }
}
