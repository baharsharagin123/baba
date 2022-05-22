//package com.nexttechITC.Stepdefs;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class AmazonsigninStepDef {
//WebDriver driver;
//	@Given("user visit amazon home page")
//	public void user_visit_amazon_home_page() throws InterruptedException {
//	    
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//		driver = new ChromeDriver();
//	driver.get("https://www.amazon.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	Thread.sleep(2000);
//	
//	
//	
//	}
//
//	@When("user enter {string} and {string} and click sign in and user click on all and click on amazon music")
//	public void user_enter_and_and_click_sign_in_and_user_click_on_all_and_click_on_amazon_music(String string, String string2) {
//	    
//	
//	
//	
//	
//	
//	
//	
//	
//	}
//
//	@Then("user will be able to land on that page")
//	public void user_will_be_able_to_land_on_that_page() {
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
//}
