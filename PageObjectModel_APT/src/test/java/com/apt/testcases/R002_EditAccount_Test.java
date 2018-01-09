package com.apt.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apt.pages.CreateAccountPage;
import com.apt.pages.LandingPage;
import com.apt.pages.LoginPage;
import com.apt.util.TestBase;

import java_cup.runtime.lr_parser;

public class R002_EditAccount_Test extends TestBase {

	String sBrowser="chrome";
	private LandingPage landingPage;
	private LoginPage loginPage;
	private CreateAccountPage accountPage;
	@BeforeMethod
	public void setUp() {
		driver=launchBrowser(sBrowser);
		enterURL(URL);
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		accountPage=new CreateAccountPage(driver);
	}
	
	@Test
	public void AT_verify_EditAccountTest(){
		landingPage.clickSignIn();
		//loginPage.enterEmailAddressInCreateAccount();
		loginPage.clickCreateAccountButton();
		accountPage.createNewUser();
	}
}
