package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.ParentPage;

public class LoginPage extends ParentPage {

// Initializing Page Factory or Object Repository

	// Defining Element Path of User Id Textbox
	@FindBy(xpath="//input[@name='userid']")
	WebElement Username;

	// Defining Element Path of Password Textbox
	@FindBy(xpath="//input[@name='pass']")
	WebElement Password;

	// Defining Element Path of Sign Button
	@FindBy(xpath="//button[@id='sgnBt']")
	WebElement SignIn;
	
	// Defining Element Path of Sign In Link
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignInText;

//Initializing Page Objects
	
	//Constructor
	public LoginPage()
	{
		PageFactory.initElements(driver,this);	
	}

//Validating Ebay Login Page Title
	public String ValidateLoginPage() 
	{		
		return driver.getTitle();
	}

	public HomePage login(String User, String Pword)
	{
		// Clicking 'Sign In' to populate Login Window 
		SignInText.click();
		
		//Passing Username
		Username.sendKeys(User);
		
		//Passing Password
		Password.sendKeys(Pword);
		SignIn.click();
		
		return new HomePage();
	
	}
 

}
