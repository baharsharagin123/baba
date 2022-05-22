package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignupPOM {


	WebDriver driver;
	public FacebookSignupPOM  (WebDriver driver) {// First capture the webelement by a locator, Declare a webelement, create a method.
		//Constructor is a part of java. We reuse our code.Constructor we use a special method. Method name should be the same as class name. And there's no return type. 
		//Object oriented programming we reuse over code.webelement capture in Page Object Model class

	     this.driver=driver;//
	    
	     PageFactory.initElements(driver, this);
	    }
	
	
	@FindBy(xpath="//input[@name='firstname']")
WebElement edit_Firstname;
public WebElement Firstname() {
	return edit_Firstname;
}


@FindBy(xpath="//input[@name='lastname']")
WebElement edit_Lastname;
public WebElement Lastname() {
	return edit_Lastname;
	
}


@FindBy(xpath="//input[@name='reg_email__']")
WebElement edit_email;
public WebElement email() {
	return edit_email;
}

@FindBy(xpath="//input[@name='reg_passwd__']")
WebElement edit_password;
public WebElement password() {
	
	return edit_password;
}


@FindBy(xpath="//select[@id='month']")
WebElement click_month;
public WebElement month() {
	
	return click_month ;
		
	}

@FindBy(xpath="//select[@id='day']")
WebElement click_day;
public WebElement day() {
return click_day;	


}

@FindBy(xpath="//select[@id='year']")
WebElement click_year;
public WebElement year() {
	return click_year;
}

@FindBy(xpath="//label[text()='Female']")
WebElement femaleradio;
public WebElement femaleradio() {
	
	return femaleradio;
}


@FindBy(xpath="//button[@name='websubmit']")
WebElement submitbutton;
public WebElement submitbutton() {
	return submitbutton;
}

@FindBy(xpath="//input[@name='reg_email_confirmation__']")
WebElement reenteremail;
public WebElement reenteremail() {
	return reenteremail;
}


}
