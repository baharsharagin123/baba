package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {



	WebDriver driver;
	public AmazonSearchPOM (WebDriver driver) {// First capture the webelement by a locator, Declare a webelement, create a method.
		//Constructor is a part of java. We reuse our code.Constructor we use a special method. Method name should be the same as class name. And there's no return type. 
		//Object oriented programming we reuse over code.webelement capture in Page Object Model class

	     this.driver=driver;//
	    
	     PageFactory.initElements(driver, this);
	    }
	   
	  // @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	   @FindBy(name="field-keywords")
	   WebElement edit_searchbox;
	   public WebElement Search(){ // search is a method here= to call the method you have to use method or web elements. Every single method we have to have web elements 

	   return edit_searchbox;
	    
	   }
	   @FindBy(id="nav-search-submit-button")// every time you create method you have to have attribute 
	   WebElement click_searchbutton;
	   
	   public WebElement searchbutton(){
	   return click_searchbutton;
	    

}


//first locator
	  //declare webelement
	  //create method
//method attribute we r looking for



















}
