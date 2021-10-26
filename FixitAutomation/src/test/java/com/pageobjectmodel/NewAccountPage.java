package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
	
	
   public WebDriver driver;
   public NewAccountPage (WebDriver driver) {
   this.driver=driver;
   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signinbtn;
	public void getSigninbtn ()  {
	signinbtn.click(); 
	
	}
	
	
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement createnewbtn;
	public void getCreatenewbtn () {
		createnewbtn.click();
	}
	
	
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	
	WebElement  customerName;
	public void getUsername(String name) {
		customerName.sendKeys(name);
		}
	
	
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailAddress;
	public void getemail (String email) {
	emailAddress.sendKeys(email);
	}
	
	
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password1;
	
	public void getPassword(String pass) {
		
		password1.sendKeys(pass);
		
	}
	
	
	
	
	@FindBy(xpath ="//input[@id='ap_password_check']")
	WebElement password3;
	public void getpassword2 (String passw) {
		password3.sendKeys(passw);	
	
	}
	
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement finalsigninbtn;
	
	public void getFinalsigninbtn() {
		
		finalsigninbtn.click();
		
	}
}
