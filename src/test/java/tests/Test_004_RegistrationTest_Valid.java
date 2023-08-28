package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import io.github.cdimascio.dotenv.Dotenv;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class Test_004_RegistrationTest_Valid extends Base{
	Dotenv dotenv = Dotenv.load();
	RegistrationPage registrationPage = new RegistrationPage();
	HomePage homePage = new HomePage();
	Timeout time = new Timeout();
	Locators lc = new Locators();
	LoginPage loginPage = new LoginPage();
	Take_Screenshot screenshot = new Take_Screenshot();
	@Test
	public void registrationTest() throws IOException {
		homePage.waitForPageloas();
		time.timeOut();
		
		loginPage.clickUserIcon();
		loginPage.waitforLoginpageload();
		
		registrationPage.clicRegisterNow();
		registrationPage.waitforRegPageload();
	
		assertEquals(registrationPage.getTitle(), lc.registerPageTitle);
		assertEquals(registrationPage.getCurrentUrl(), lc.registerPageUrl);

		registrationPage.registrationData(dotenv.get("reg_name"), dotenv.get("reg_number"), dotenv.get("reg_password"));
		registrationPage.checkTermsAndCondition();
		time.timeOut();
		screenshot.screenshot("RegisterPage");
		registrationPage.clickCreateAccountButton();
		registrationPage.waitforVerifyPageload();
		assertEquals(registrationPage.getTitle(), lc.verification_pageTitle);
		time.timeOut();
		screenshot.screenshot("After_Register");
	}

}
