//
//
//
//package com.nexttechITC.Stepdefs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.nexttechITC.PageObjectModel.BestSellerButtonPOM;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//
//
//public class AmazonBestSellerStepDef {
//
//WebDriver driver;
//
//	@Given("^user visits Amazon homepage$")
//	public void user_visits_Amazon_homepage() throws Throwable {
//	 System.setProperty("webdriver.chromedriver","C://chromedriver.exe");
//	 WebDriver driver =new ChromeDriver();
//	 driver.get("https://www.amazon.com/");
//	 
//	 
//	 
//	
//	
//	
//	}
//
//	@When("^user clicks on Best seller$")
//	public void user_clicks_on_Best_seller() throws Throwable {
//	    
//	BestSellerButtonPOM obj=new BestSellerButtonPOM(driver);
//			
//	obj.click();
//
//	
//	
//	
//	}
//
//	@Then("^user should be able to redirect to the Best Seller Page$")
//	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
//	    
//	}
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
//
//
//
//
//
//
//
//}
