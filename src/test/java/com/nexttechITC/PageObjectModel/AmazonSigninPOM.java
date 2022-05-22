package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninPOM {
WebDriver driver;
    public AmazonSigninPOM(WebDriver driver) {
	
    	
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}

    
  @FindBy(xpath="//a[@id='nav-link-accountList']")
  WebElement amazonsign;
  public WebElement amzsign() {
  
  return amazonsign;
  }
    
    
    
    
  @FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")
  WebElement login;
  public WebElement lastlogin() {
	  return login;
		  
    
  }   
    
   @FindBy(xpath="//input[@id='ap_email']")
   WebElement email;
   public WebElement emailin() {
	   return email;
   }
    











}
