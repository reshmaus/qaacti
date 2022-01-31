package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.Driverscript;
import com.acti.pages.Entertimepage;
import com.acti.pages.Loginpage;
import com.acti.pages.Taskpage;

public class Basetest extends Driverscript {

	Loginpage lp ;
	Entertimepage etp;
	Taskpage tp ;
	
	public Basetest()
	{
		super();
	}
	
	@BeforeMethod
	public void pretest(){
		
		initapp();
		 lp = new Loginpage();
		 etp = new Entertimepage();
		 tp = new Taskpage();
		}
	
	//@AfterMethod
	public void posttest(){
		driver.close();
	}
}
