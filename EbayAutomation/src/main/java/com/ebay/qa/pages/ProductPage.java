package com.ebay.qa.pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.qa.base.ParentPage;


public class ProductPage extends ParentPage {

	//Initializing Page Factory or Object Repository
	
	// Search Textbox Id
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement TxtSearch;
	
	//Search Button
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement SrchButton;
	
	//Main Page Link
	@FindBy(id="gh-la")
	WebElement homepage;
	
	//Selecting Product
	@FindBy(xpath="//*[@id=\"srp-river-results-listing2\"]/div/div[2]/a/h3")
	WebElement ProductSelect1;
	
	//Selecting Product
	@FindBy(xpath="//*[@id=\"srp-river-results-listing4\"]/div/div[2]/a/h3")
	WebElement ProductSelect2;
	
	//Add Cart Link/Button
	@FindBy(xpath="//a[@id=\"atcRedesignId_btn\"]")
	WebElement AddToCart;
	
	//Message after adding Product into Cart
	@FindBy(xpath="//div[@class='vi-overlayTitleBar']")
	WebElement CheckAddCart;
	
	//View Cart Link
	@FindBy(id="gh-cart")
	WebElement ViewCart;
	
	//Close Button
	@FindBy(xpath="//div[@class='clzBtnSection']")
	WebElement CartCloseBtn;
	
	//Initializing Objects
	
	//Constructor
	public ProductPage() 
	{
		PageFactory.initElements(driver,this);		
	}
	
	// Search First Product
	public String ProductSelection1(String txtsrch1)
	{		
		//Product to be Searched
		TxtSearch.sendKeys(txtsrch1);
		
		//Selecting Elements from Search Box which populate after type any Search String 
		List<WebElement> SearchResult = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::a[@class='ghAC_sugg ui-corner-all']"));
		
		//Navigate to the list of Search List Items populating During Search String Operation
		for (int Counter=0;Counter<SearchResult.size();Counter++)
		{
			//Displays the Searched Product Selected after Navigating to the List of Items
			System.out.println("Product:" + SearchResult.get(Counter).getText());
			if(SearchResult.get(Counter).getText().contains(prop.getProperty("product1")))
			{				
				SearchResult.get(Counter).click();
				break;
			}
		}
		
		//Once Searchd Product is Selected then Click on 'Search' Button
		SrchButton.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,5);		
		
		//Extracting Searched Product and Saving into Variable
		String ProductSelectText1 = ProductSelect1.getText();
		System.out.println("Selected Product Name:" + ProductSelectText1);
		ProductSelect1.click();
				
		wait = new WebDriverWait(driver,5);
		
		//Adding Selected Product into Shopping Cart 
		
		AddToCart.click();
		
		wait = new WebDriverWait(driver,5);
						
		return CheckAddCart.getText();
	}
	
	// Search First Product
	public String ProductSelection2(String txtsrch2)
	{		
		//Product to be Searched
		TxtSearch.sendKeys(txtsrch2);
		
		//Selecting Elements from Search Box which populate after type any Search String
		List<WebElement> SearchResult = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::a[@class='ghAC_sugg ui-corner-all']"));
		
		//Navigate to the list of Search List Items populating During Search String Operation
		for (int Counter=0;Counter<SearchResult.size();Counter++)
		{
			//Displays the Searched Product Selected after Navigating to the List of Items
			System.out.println("Product:" + SearchResult.get(Counter).getText());
			if(SearchResult.get(Counter).getText().contains(prop.getProperty("product2")))
			{				
				SearchResult.get(Counter).click();
				break;
			}
		}
				
		//Once Searchd Product is Selected then Click on 'Search' Button
		SrchButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);		
		
		//Wait Time after each transaction
		String ProductSelectText2 = ProductSelect2.getText();
		System.out.println("Selected Product Name:" + ProductSelectText2);
		ProductSelect2.click();
		
		//Adding Selected Product into Shopping Cart
		
		wait = new WebDriverWait(driver,5);
		AddToCart.click();
		
		wait = new WebDriverWait(driver,5);
					
		return CheckAddCart.getText();
	}
	
	
}
