package com.ebay.qa.testset;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.ParentPage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.ProductPage;

public class ProductPageTest extends ParentPage{

	LoginPage LoginPage;
	HomePage HomePage;
	ProductPage ProductPage;
	
	public ProductPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		LoginPage = new LoginPage();
		HomePage=LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		ProductPage=new ProductPage();
	}
	
	
	@Test(priority=1)
	public void DisplayProduct1()
	{	
		String SrchTextValue1 = ProductPage.ProductSelection1(prop.getProperty("product1"));
		Assert.assertEquals(SrchTextValue1,"1 item added to cart");
	}
	
	@Test(priority=2)
	public void DisplayProduct2()
	{
		String SrchTextValue2 = ProductPage.ProductSelection2(prop.getProperty("product2"));
		Assert.assertEquals(SrchTextValue2,"1 item added to cart");
		
	}
	
		
	@AfterMethod
	public void teardown() 
	{
		driver.quit();		
	}
}
