package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import model.Locators;
import model.Take_Screenshot;
import model.Timeout;
import pages.HomePage;

public class Test_001_HomePage extends Base{
	HomePage homePage = new HomePage();
	Timeout time = new Timeout();
	Take_Screenshot screenshot = new Take_Screenshot();
	Locators lc = new Locators();
	@Test
	public void homePageTest() throws IOException {
		homePage.waitForPageloas();
		assertEquals(homePage.getCurrentUrl(), lc.homePageUrl);
		assertEquals(homePage.getTitle(), lc.homePageTitle);
		time.timeOut();	
		screenshot.screenshot("HomePage");	
	}

}
