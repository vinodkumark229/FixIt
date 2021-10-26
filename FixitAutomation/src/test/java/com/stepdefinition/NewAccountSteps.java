package com.stepdefinition;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.NewAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountSteps extends Base {
	NewAccountPage p;
	@Given("user on the amazon home page")
	public void user_on_the_amazon_home_page() {
		getDriver ();   
	    p=PageFactory.initElements(driver, NewAccountPage.class);
	    
	}

	@When("click on sign in and account tab")
	public void click_on_sign_in_and_account_tab() {
	 //driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();                                                       // driver.findElement(By.xpath(""))
	p.getSigninbtn();
	}

	@When("click on create a new account")
	public void click_on_create_a_new_account() {
		//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();   
	    p.getCreatenewbtn();
	}

	@When("enter Your name as {string}")
	public void enter_your_name_as(String name) {
		
	//	driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(string);
		// if there is no example given in feature file then we need to give the value as 
		//driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(string); >>>>>>>>>> sendKeys(string); give value for string ("vinod229")
		p.getUsername(name);
	    
	    
	}

	@When("enter Email address as {string}")
	public void enter_email_address_as(String email) {
	//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);    
	 
		p.getemail(email);		
	}

	@When("enter password as {string}")
	public void enter_password_as(String password) {
	//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string);   
	   p.getPassword(password); 
	}

	@When("re enter password {string}")
	public void re_enter_password(String pass ) {
	//driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(string);    
	  p.getpassword2(pass) ;
	}

	@Then("the user can create new account sucessfully")
	public void the_user_can_create_new_account_sucessfully() {
	//	driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		p.getFinalsigninbtn();
	   Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
	   
	    
	}

}
