package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;
import pages.LoginPage;

public class Test_002_LoginTest_Valid extends Base{
	HomePage homePage = new HomePage();
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	LoginPage loginPage = new LoginPage();
	@Test
	public void loginTestValid() throws IOException {
		homePage.waitForPageloas();
		time.timeOut();
		
		loginPage.clickUserIcon();
		loginPage.waitforLoginpageload();
		
		assertEquals(loginPage.getTitle(), lc.loginPageTitle);
		assertEquals(loginPage.currentPageUrl(), lc.loginPageUrl);
		
		loginPage.loginInfo(lc.loginNumber, lc.loginpassword);
		time.timeOut();
		screenshot.screenshot("LoginPage");
		loginPage.clickLoginButton();
		
		loginPage.waitforDashBoardpageload();
		assertEquals(loginPage.getTitle(), lc.dashBoardTitle);
		time.timeOut();
		screenshot.screenshot("After_Login_DashBoard");
	}

}
