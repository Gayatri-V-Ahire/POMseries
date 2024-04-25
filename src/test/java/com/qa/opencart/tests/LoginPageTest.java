package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest{
  
	

	@Test(priority = 1)
	public void loginPageTitleTest() {
		
       String actTitle = loginPage.getLoginPageTitle();
       Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test(priority = 2)
	
	public void loginPageUrlTest() {
		String url = loginPage.getLoginPageURL();
		Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@Test(priority = 3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgottenPwdLinkExist());
	}
	
	@Test(priority = 4)
	public void loginTest() {
		String accPageTitle = loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(accPageTitle, "My Account");
	}
}


