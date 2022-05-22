//package com.nexttechITC.Stepdefs;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.nexttechITC.PageObjectModel.AmazonSearchPOM;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//
//public class Amazonsearch {
//
//
//	WebDriver driver;
//	 
//		// TODO Auto-generated constructor stub
//	
//
//	//Constructor is not a method but a special type of method.constructor name should be same as class name.Their is not return type in constructor.
//		@Given("user visit amazon home page")
//		public void user_visit_amazon_home_page() throws Throwable{
//			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get("https://www.amazon.com/");
//			driver.manage().window().maximize();
//			Thread.sleep(5000);
//	     
//		}
//
//		@Given("user search by {string}")
//		public void user_search_by(String arg1) throws Throwable {//(string Arg1)is call Parameter and Arg1= agreement
//			AmazonSearchPOM AS= new AmazonSearchPOM(driver);
//	
//		AmazonSearchPOM obj= new AmazonSearchPOM(driver);
//		obj.Search().sendKeys(arg1);
//		
//		
//		//arg mean argement//AS object name= we have to create method and attribute= search is a method here
//			//WebDriverWait wait=new WebDriverWait(driver, 20);
//			Thread.sleep(5000);
//		}
//
//		
//		@Then("user click on search button")
//		public void user_click_on_search_button() throws Throwable {
//			AmazonSearchPOM AS= new AmazonSearchPOM(driver);
//			AS.searchbutton().click();
//			//WebDriverWait wait =new WebDriverWait(driver, 20);
//			
//
//
//
//
//
//
//
//
//
//
//
//
//		}
//
//}
