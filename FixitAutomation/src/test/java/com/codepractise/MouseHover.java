package com.codepractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//launch the browser its not connect the any other class
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
	    WebElement b = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
	    // study contains method
	    
		// a is source and b is target 
	    
	   Actions ac = new Actions(driver); 
	   ac.moveToElement(a) .moveToElement(b).click().build().perform();
		
		
	}

}
