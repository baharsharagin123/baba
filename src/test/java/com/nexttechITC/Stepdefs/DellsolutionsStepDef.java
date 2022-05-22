//package com.nexttechITC.Stepdefs;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import com.nexttechITC.PageObjectModel.DellsolutionsPOM;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DellsolutionsStepDef {
//
//
//WebDriver driver;
//
//
//@Given("user visit dell home page")
//public void user_visit_dell_home_page() throws InterruptedException {
//    
//
//
//
//
//	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://www.dell.com/en-us");
//	driver.manage().window().maximize();
//	Thread.sleep(5000); 
//
//
//
//
//
//
//
//
//}
//
//@When("user go to solutions drop down menu and able to see all solutions")
//public void user_go_to_solutions_drop_down_menu_and_able_to_see_all_solutions() throws InterruptedException {
//   
//	
//	Actions obj=new Actions(driver);
//	DellsolutionsPOM mo= new DellsolutionsPOM(driver);
//	
//	obj.moveToElement(mo.options()).build().perform();
//	//obj.moveToElement(mo.allsolutions()).click().build().perform();
//	Thread.sleep(2000);
//	obj.moveToElement(mo.industryoptions()).click().build().perform();
//	Thread.sleep(2000);
//	obj.moveToElement(mo.lastoption()).click().build().perform();
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
//
//@Then("user will be able to redirect solution portfolio")
//public void user_will_be_able_to_redirect_solution_portfolio() {
//   
//}
//
//
//
//
//
//
//
//
//}
