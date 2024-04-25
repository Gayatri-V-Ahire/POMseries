package com.qa.opencart.pages;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.Utils.ElementUtil;

public class LoginPage {

	// page class is not responsible for any testing testNG, test cases
		// for every page we maintain our private webdriver driver

		//Page class/Page Library/Page Object
		private WebDriver driver;

		// 1. Private By Locators
		private By emailId = By.id("input-email");
		private By password = By.id("input-password");
		private By loginButton = By.xpath("//input[@type='submit' and @value='Login']");
		private By forgotPwdLink = By.linkText("Forgotten Password");

		// 2. Public Page Class Const...

		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		//3. Public Page Actions/Method
		public String getLoginPageTitle() {
			String title = driver.getTitle();
			System.out.println("Login page title:"+title);
			return title;
		}
	   
		public String getLoginPageURL() {
			String url = driver.getCurrentUrl();
			System.out.println("Login Page url:"+url);
			return url;
		}
		
		public boolean isForgottenPwdLinkExist() {
			return driver.findElement(forgotPwdLink).isDisplayed();	
		}
		
		public void doLogin(String username, String pwd) {
			System.out.println("user creds:"+username+":"+pwd);
			driver.findElement(emailId).sendKeys(username);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(loginButton).click();
		}
	
}






