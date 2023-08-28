package pages;

import org.openqa.selenium.By;

import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class LoginPage extends CommonMethods {
	
	Timeout time = new Timeout();
	Locators lc =  new Locators();

	public void clickUserIcon() {
		clickOnButton(lc.userloginIcon);	
	}
	
	public String loginPageTitle() {
		return getTitle();
	}
	
	public void waitforLoginpageload() {
		time.waitForEl(lc.loginPageText);	
	}
	
	public void loginInfo(String phoneNumber, String password ) {
		sendText(lc.loginPhoneNumber, phoneNumber);
		sendText(lc.loginPassword, password);
		
	}
	
	public void clickLoginButton() {
		clickOnButton(lc.loginButton);
		
	}
	public void waitforDashBoardpageload() {
		time.waitForEl(lc.dashBoardName);
	}
	public String getCurrentUrl() {
		return currentPageUrl();
		
	}
	public String text(By element) {
		return getText(element);
	}
	
	
	
	
	

}
