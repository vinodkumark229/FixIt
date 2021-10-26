package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public  WebDriver driver ; 


    // here we write it to make a public variable so that we can call it back 
	public void getDriver () {
		
		WebDriverManager.chromedriver().setup();
		
		
	    driver = new ChromeDriver();  // new ChromeDriver();   NEW (constructor)
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
}
