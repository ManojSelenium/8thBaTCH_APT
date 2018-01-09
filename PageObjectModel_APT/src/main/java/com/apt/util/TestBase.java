package com.apt.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements SetUP{

	public WebDriver driver;
	public WebDriver launchBrowser(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "..//PageObjectModel_APT/src/test/resources/LIB/chromedriver.exe");
		 driver=new ChromeDriver();
		}else if(sBrowser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\tmp\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		System.out.println("Test Base Driver "+driver);
		return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
}
