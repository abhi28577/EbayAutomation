package com.ebay.qa.testset;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.ParentPage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.HomePage;

public class LoginPageTest extends ParentPage{

	LoginPage LoginPage;
	HomePage HomePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		LoginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		String Title = LoginPage.ValidateLoginPage();		
		Assert.assertEquals(Title,"Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
		
	
	}
	
	@Test(priority=2)
	public void HomePageDisplayTest()
	{		
		HomePage=LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void teardown() 
	{
		driver.quit();		
	}
}
