package com.ebay.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ebay.qa.util.TestUtil;

public class ParentPage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public ParentPage()
	{
		try
		{
			//Importing Properties from Config File
			prop=new Properties();
			FileInputStream IP = new FileInputStream("/Users/abhi28577/eclipse-workspace/EbayAutomation/src/main/java/com/ebay/qa/config/config.properties");
			prop.load(IP);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}			
	}
	
	public static void initialization()
	{
		//Parameters populating from Config File. Config File needs to be changed for Browser(Chrome/FireFox)
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			//Path of Chrome Driver
			System.setProperty("webdriver.chrome.driver", "//Users//abhi28577//Hadoop//Selenium//Java//Driver//chromedriver");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FF"))
		{
			//Path of FireFox Driver
			System.setProperty("webdriver.gecko.driver", "//Users//abhi28577//Hadoop//Selenium//Java//Driver/geckodriver");
			driver = new FirefoxDriver();
		}
		
		// Defining Properties of Browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//Defining the Path of Parent URL (https://www.ebay.com.au)
		driver.get(prop.getProperty("url"));	
	}

}
