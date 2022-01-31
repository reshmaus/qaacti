package com.acti.testcases;

import org.testng.annotations.Test;

import com.acti.pages.Loginpage;

public class Testcreatecustomer extends Basetest
{
	
//cltr+shift+o to remove unused imports

@Test
public void testcreatecustomer(){
    lp = new Loginpage();
	lp.validatelogin("admin","manager");
	String userlogged = etp.getuserloggednametext();
	System.out.println(userlogged);
	etp.clicktasksmenu();
	tp.clickAddnewbtn();
	tp.clicknewcustomeroption();
	tp.enterCustomername("Testcustomer12");
	tp.entercustomerdescription("creating dummy customer for test");
	tp.clickselectcustomerdropdown();
	tp.clickbigbangcompany();
	tp.clickcreatecustomerbutton();
	
	
}

}
