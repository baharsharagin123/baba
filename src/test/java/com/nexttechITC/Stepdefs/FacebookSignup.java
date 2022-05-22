//package com.nexttechITC.Stepdefs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import com.nexttechITC.PageObjectModel.FacebookSignupPOM;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class FacebookSignup {
//
//WebDriver driver;
//String pass;
//
//	@Given("user visiting facebook url")
//	public void user_visiting_facebook_url() throws Throwable {
//	
//		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/r.php");
//		driver.manage().window().maximize();
//		Thread.sleep(5000); 
//	
//	
//	
//	}
//
//	@When("user enter {string} and {string} and valid {string} and {string}")
//	public void user_enter_and_and_valid_and(String string, String string2, String string3, String string4) {
//	
//	FacebookSignupPOM obj=new FacebookSignupPOM(driver);
//	obj.Firstname().sendKeys(string);
//	obj.Lastname().sendKeys(string2);
//	obj.email().sendKeys(string3);
//	obj.password().sendKeys(string4);
//	pass=string3;
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
//	}
//
//	@Then("user select dropdown Month and dropdown Day and dropdown Year")
//	public void user_select_dropdown_month_and_dropdown_day_and_dropdown_year() {
//	   
//		FacebookSignupPOM obj2=new FacebookSignupPOM (driver);
//	Select dropdown =new Select(obj2.month());
//	dropdown.selectByIndex(0);//jan
//	
//	
//	
//	Select dropdown1=new Select(obj2.day());
//	dropdown1.selectByValue("2");//2
//	
//	Select dropdown2=new Select(obj2.year());
//	dropdown2.selectByVisibleText("1987");//text witgh be year
//	
//	
//	obj2.femaleradio().click();
//	obj2.submitbutton().click();
//	
//	
//	obj2.reenteremail().sendKeys(pass);
//	obj2.submitbutton().click();
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
//
//}
