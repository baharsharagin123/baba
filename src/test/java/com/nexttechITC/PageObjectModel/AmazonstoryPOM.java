package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonstoryPOM {

WebDriver driver;
    public AmazonstoryPOM(WebDriver driver) {
    	
	
    	
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}

@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement searchbar;
public WebElement searchbox() {
	return searchbar;
}


@FindBy(xpath="//input[@id='nav-search-submit-button']")
WebElement buttonclick;
public WebElement submittclick() {
	return buttonclick;
}






}
