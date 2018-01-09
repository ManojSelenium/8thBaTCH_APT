package com.apt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.apt.dao.CreateUserBean;
import com.apt.util.WebDriverCode;

public class LoginPage extends WebDriverCode{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	CreateUserBean bean;
	public void enterEmailAddressInCreateAccount(CreateUserBean bean){
		enterText(By.id("email_create"),bean.getEmailAddress());
	}
	
	public void clickCreateAccountButton(){
		click(By.id("SubmitCreate"));
	}
	
	public void clickForgotPassword() {
		
	}
	
	public void clickSIgnInButton() {
		
	}
	
}
