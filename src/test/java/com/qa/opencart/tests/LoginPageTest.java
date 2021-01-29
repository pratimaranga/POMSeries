package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.democart.utils.Constants;
import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Epic("EPIC 100: Desgin full Login page for open cart application....")
@Story("US 101: Login page feature story")
public class LoginPageTest extends BaseTest {

	@Description("verify login page title test....")
	@Severity(SeverityLevel.MINOR)
	@Step("getting login page title....")
	@Test(priority = 1)
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}

	@Description("verify Forgot Pwd Link Test....")
	@Severity(SeverityLevel.CRITICAL)
	@Step("forgot pwd link is displyed on login page....")
	@Test(priority = 2)
	public void verifyForgotPwdLinkTest() {
		System.out.println("verifyForgotPwdLinkTest");
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	
	@Description("login test..")
	@Severity(SeverityLevel.BLOCKER)
	@Step("Login with username : {0} and password: {1}")
	@Test(priority = 3)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}