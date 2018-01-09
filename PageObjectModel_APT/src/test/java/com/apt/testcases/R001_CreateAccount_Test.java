package com.apt.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apt.dao.BeanFactory;
import com.apt.dao.CreateUserBean;
import com.apt.dao.EditUserBean;
import com.apt.pages.CreateAccountPage;
import com.apt.pages.LandingPage;
import com.apt.pages.LoginPage;
import com.apt.util.TestBase;

public class R001_CreateAccount_Test extends TestBase {

	private LandingPage landingPage;
	private LoginPage loginPage;
	private CreateAccountPage accountPage;
	
	private CreateUserBean bean;
	private EditUserBean bean2;
	private BeanFactory factory;
	String sBrowser="chrome";
	@BeforeMethod
	public void setUp() {
		driver=launchBrowser(sBrowser);
		System.out.println("Test Case Driver :"+driver);
		enterURL(URL);
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		accountPage=new CreateAccountPage(driver);
		factory=new BeanFactory();
		bean=new CreateUserBean();
		
		factory.createUserData(bean);
		factory.editUserData(bean2);
	}

	@Test
	public void AT_Verify_createAccountWithValidData(){


		landingPage.clickSignIn();
		loginPage.enterEmailAddressInCreateAccount(bean);
		loginPage.clickCreateAccountButton();
		
		accountPage.enterFirstName("");
	
		Assert.assertEquals("",bean.getEmailAddress());
	}


}
