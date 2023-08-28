package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class RegistrationPage extends CommonMethods {
	
	Timeout time = new Timeout();
	Locators lc =  new Locators();

	
	public void clicRegisterNow() {
		clickOnButton(lc.registerNowLink);
	}
	
	public String registrationPageTitle() {
		return getTitle();
	}
	
	public void waitforRegPageload() {
		time.waitForEl(lc.regi_enterName);
		
	}
	public void waitforVerifyPageload() {
		time.waitForEl(lc.verif_Text_PV);
		
	}
	public String getCurrentUrl() {
		return currentPageUrl();
		
	}
	
	public void registrationData(String name, String phoneNumber, String password ) {
		sendText(lc.regi_enterName, name);
		sendText(lc.regi_enterPhoneNumber, phoneNumber);
		sendText(lc.regi_Password, password);
		sendText(lc.regi_ConfirmPassword, password);
	}
	public void checkTermsAndCondition() {
		clickOnButton(lc.regi_checkTermsAndCondition);
	}
	public void clickCreateAccountButton() {
		clickOnButton(lc.regi_createAccountButton);
		
	}
	
	
	
	
	

}
