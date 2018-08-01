package com.ebay.qa.testset;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.ParentPage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.HomePage;

public class HomePageTest extends ParentPage{

	LoginPage LoginPage;
	HomePage HomePage;
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		LoginPage = new LoginPage();
		HomePage=LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void ValidateUsernameDisplayTest()
	{
		String UserNameDisplay = HomePage.ValidateUsernameDisplay();		
		Assert.assertEquals(UserNameDisplay,"Abhishek");		
	}
	
	@Test(priority=2)
	public void ValidateSavedLinkTextTest() 
	{
		String SavedText = HomePage.ValidateSavedLink();
		Assert.assertEquals(SavedText,"Saved");
	}
	
	@Test(priority=3)
	public void ValidateFashionLinkTextTest() 
	{
		String FashionText = HomePage.ValidateFashionLink();
		Assert.assertEquals(FashionText,"Fashion");
	}
	
	@Test(priority=4)
	public void ValidateMotorsLinkTextTest() 
	{
		String MotorsText = HomePage.ValidateMotorsLink();
		Assert.assertEquals(MotorsText,"Motors");
	}
	
	@Test(priority=5)
	public void ValidateHomeGardenLinkTextTest() 
	{
		String HomeGardenText = HomePage.ValidateHomeGardenLink();
		Assert.assertEquals(HomeGardenText,"Home & Garden");
	}
	
	@Test(priority=6)
	public void ValidateElectronicsLinkTextTest() 
	{
		String ElectronicsText = HomePage.ValidateElectronicsLink();
		Assert.assertEquals(ElectronicsText,"Electronics");
	}
	
	@Test(priority=7)
	public void ValidateSportsLinkTextTest() 
	{
		String SportsText = HomePage.ValidateSportsLink();
		Assert.assertEquals(SportsText,"Sports");
	}
	
	@Test(priority=8)
	public void ValidateLiquorGroceryLinkTextTest() 
	{
		String LiquorGroceryText = HomePage.ValidateLiquorGroceryLink();
		Assert.assertEquals(LiquorGroceryText,"Liquor & Grocery");
	}
	
	@Test(priority=9)
	public void ValidateHealthBeautyLinkTextTest() 
	{
		String HealthBeautyText = HomePage.ValidateHealthBeautyLink();
		Assert.assertEquals(HealthBeautyText,"Health, Beauty & Baby");
	}
	
	@Test(priority=10)
	public void ValidateToysMediaLinkTextTest() 
	{
		String ToysMediaText = HomePage.ValidateToysMediaLink();
		Assert.assertEquals(ToysMediaText,"Toys & Media");
	}
	
	@Test(priority=11)
	public void ValidateCollectablesLinkTextTest() 
	{
		String CollectablesText = HomePage.ValidateCollectablesLink();
		Assert.assertEquals(CollectablesText,"Collectables");
	}
	
	@Test(priority=12)
	public void ValidateDealsLinkTextTest() 
	{
		String DealsText = HomePage.ValidateDealsLink();
		Assert.assertEquals(DealsText,"Deals & Events");
	}
	
	
		
	@AfterMethod
	public void teardown() 
	{
		driver.quit();		
	}
}
