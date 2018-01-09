package com.apt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.apt.objrepo.LandingPageProperty;
import com.apt.util.WebDriverCode;

public class LandingPage  extends WebDriverCode implements LandingPageProperty{

	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignIn() {
		click(SIGNINLOCATOR);
	}
	
	public void clickContactUs() {
		System.out.println("Click Contact Us");
	}
	
	public void enterSearchItem(String itemName) {
		
	}
	
	public void clickAddToCart() {
		
	}
}
