package com.apt.pages;

import org.openqa.selenium.WebDriver;

import com.apt.dao.CreateUserBean;
import com.apt.objrepo.CreateAccountPageProperty;
import com.apt.util.WebDriverCode;

public class CreateAccountPage extends WebDriverCode implements CreateAccountPageProperty{

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	CreateUserBean bean;
	public void enterFirstName(String testData) {
		enterText(FIRSTNAMELOCATOR, bean.getFirstName());
	}
	public void selectTitle() {
	}
	public void enterLastName(String testData) {
		enterText(LASTNAMELOCATOR, bean.getLastName());
	}
	public void enterPassword() {

	}
	public void enterCity() {

	}
	public void enterState() {

	}
	public void enterMobileNo() {

	}

	public void createNewUser() {
		enterFirstName("");
		enterLastName("");
		enterPassword();
		enterMobileNo();
		enterCity();
	}

}
