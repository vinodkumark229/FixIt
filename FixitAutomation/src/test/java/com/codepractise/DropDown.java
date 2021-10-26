package com.codepractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//lauch the browesr its not connect the any other class
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select AllDepartments = new Select(driver.findElement(By.xpath("//select[@id = 'searchDropdownBox']")));
		// Select is class and  s the parameter
		AllDepartments.selectByVisibleText("Alexa Skills");
		
		List<WebElement>  l = AllDepartments.getOptions();
		System.out.println(l.size());
		
		// List == java interface 		l is variable 
				
	// if now there is no Select in 
	//	<>- known as generic inside we have to pass raper class		
		
	for(int i = 0; i<l.size();i++) {
		//System.out.println(l.get(i).getText());
		System.out.println(l.get(45).getText());
	}
		
		
		
		
		
		

	}

}
