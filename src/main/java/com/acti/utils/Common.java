package com.acti.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.base.Driverscript;

public class Common extends Driverscript
{
public static void highlightelement(WebElement ele){
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",ele );
}
}
