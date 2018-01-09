package com.apt.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCode {

	WebDriver driver;
	
	public WebDriverCode(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
	
	public String getText(By prop){
		return driver.findElement(prop).getText();
	}

	public void selectValueFromDropDown(By prop,String text) {
		new Select(driver.findElement(prop)).selectByVisibleText(text);
	}
	
	public void handelAlert() {
		driver.switchTo().alert().accept();
	}
	
	public boolean verifyIsElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}
	
	public boolean verifyElementPrsentWithOutException(By prop) {
		
		boolean flag=false;
		
		try {
			if(driver.findElement(prop).isDisplayed()){
				flag=true;
			}
		} catch (Exception e) {
			flag=false;
		}
		
		return flag;
	}
}
