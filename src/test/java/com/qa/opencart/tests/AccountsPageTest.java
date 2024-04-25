package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountsPageTest extends BaseTest {

	@BeforeClass
	public void accSetUp() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void accPageTitleTest() {
		String actTitle = accPage.getAccPageTitle();
		Assert.assertEquals(actTitle, "My Account");
	}
	
	public void accPageURLTest() {
		String actUrl = accPage.getAccPageURL();
		Assert.assertTrue(actUrl.contains("account/account"));
	}
	
	

}
