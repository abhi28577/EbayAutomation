package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.ParentPage;

public class HomePage extends ParentPage{

	//Initializing Page Factory or Object Repository
	
	//Defining the Path of Login Name
	@FindBy(xpath="//div[@id='gh-top']//ul[@id='gh-topl']//*[contains(text(),'Abhishek')]")
	WebElement UsernameDisplay;
	
	//UI Path
	@FindBy(xpath="//a[contains(text(),'Saved')]//parent::li[@class='saved']")
	WebElement SavedLinkText;
	
	//UI Path
	@FindBy(linkText="Fashion")
	WebElement FashionLinkText;
	
	//UI Path
	@FindBy(linkText="Motors")
	WebElement MotorsLinkText;
	
	//UI Path
	@FindBy(linkText="Home & Garden")
	WebElement HomeGardenLinkText;
	
	//UI Path
	@FindBy(linkText="Electronics")
	WebElement ElectronicsLinkText;
	
	//UI Path
	@FindBy(linkText="Sports")
	WebElement SportsLinkText;
	
	//UI Path
	@FindBy(linkText="Liquor & Grocery")
	WebElement LiquorGroceryLinkText;
	
	//UI Path
	@FindBy(linkText="Health, Beauty & Baby")
	WebElement HealthBeautyLinkText;
	
	//UI Path
	@FindBy(linkText="Toys & Media")
	WebElement ToysMediaLinkText;
	
	//UI Path
	@FindBy(linkText="Collectables")
	WebElement CollectablesLinkText;
	
	//UI Path
	@FindBy(linkText="Deals & Events")
	WebElement DealsLinkText;
	
	//Constructor
	public HomePage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Returning Username Value
	public String ValidateUsernameDisplay()
	{
		return UsernameDisplay.getText();
	}
	
	//Validating 'Saved' UI
	public String ValidateSavedLink() 
	{
		return  SavedLinkText.getText();
	}
	
	//Validating 'Fashion' UI
	public String ValidateFashionLink() 
	{
		return  FashionLinkText.getText();
	}
	
	//Validating 'Motors' UI
	public String ValidateMotorsLink() 
	{
		return  MotorsLinkText.getText();
	}
	
	//Validating 'Home Garden' UI
	public String ValidateHomeGardenLink() 
	{
		return  HomeGardenLinkText.getText();
	}
	
	//Validating 'Electronics' UI
	public String ValidateElectronicsLink() 
	{
		return  ElectronicsLinkText.getText();
	}
	
	//Validating 'Sports' UI
	public String ValidateSportsLink() 
	{
		return  SportsLinkText.getText();
	}
	
	//Validating 'Liquor' UI
	public String ValidateLiquorGroceryLink() 
	{
		return  LiquorGroceryLinkText.getText();
	}
	
	//Validating 'Health and Beauty' UI
	public String ValidateHealthBeautyLink() 
	{
		return  HealthBeautyLinkText.getText();
	}
	
	//Validating 'Toys and Media' UI
	public String ValidateToysMediaLink() 
	{
		return  ToysMediaLinkText.getText();
	}
	
	//Validating 'Collectables' UI
	public String ValidateCollectablesLink() 
	{
		return  CollectablesLinkText.getText();
	}
	
	//Validating 'Deals' UI
	public String ValidateDealsLink() 
	{
		return  DealsLinkText.getText();
	}
	
}
