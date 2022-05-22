package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsolutionsPOM {

	WebDriver driver;
	public DellsolutionsPOM (WebDriver driver) {// First capture the webelement by a locator, Declare a webelement, create a method.
		//Constructor is a part of java. We reuse our code.Constructor we use a special method. Method name should be the same as class name. And there's no return type. 
		//Object oriented programming we reuse over code.webelement capture in Page Object Model class

	     this.driver=driver;//
	    
	     PageFactory.initElements(driver, this);
	     
	     
	    }
	@FindBy(xpath="//span[text()='Solutions']")
	WebElement solutionsoption;
	public WebElement options() {
		return solutionsoption;
	}


@FindBy(xpath="//a[text()='View All Solutions']")
WebElement all;
public WebElement allsolutions() {
	
	return all;
}

@FindBy(xpath="//a[text()='Industry Solutions']")
WebElement industry;
public WebElement industryoptions() {
	return industry;
}
@FindBy(xpath="//a[text()='Federal Government']")
WebElement lastclick;
public WebElement lastoption() {
	return lastclick;
}

}
