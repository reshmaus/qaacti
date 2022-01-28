package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driverscript
{
	public static WebDriver driver;
	public static Properties prop;
public Driverscript() 
{
try
{
	File src = new File("./acticonfigeration/config.properties");
	FileInputStream fis = new FileInputStream(src);
    prop = new Properties();
	prop.load(fis);
}
catch(Exception e)
{
	System.out.println("unable to load property file"+e.getMessage());
}
}


public static void initapp()
{
	String browser = prop.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./actiBowser/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./actiBowser/chromedriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	String url = prop.getProperty("qaurl");
	driver.get(url);
	
}
}