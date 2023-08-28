package model;

import org.openqa.selenium.By;

import io.github.cdimascio.dotenv.Dotenv;

public class Locators {
	Dotenv dotenv = Dotenv.load();
	// HomePage
	public String homePageUrl = "https://www.sookh.com/";
	public String homePageTitle = "SOOKH | Home";
	public By home_welcomeMassage = By.cssSelector(".header-left .welcome-msg");
	
	
	//loginPage
	public String loginPageTitle = "SOOKH | Login";
	public String loginPageUrl = "https://www.sookh.com/users/login";
	public String loginNumber = dotenv.get("phone_number");
	public String loginpassword = dotenv.get("password");
	public String loginErrorMsg = "Invalid phone or password";
	
	public By userloginIcon = By.cssSelector(".far.fa-user");
	public By loginPageText = By.cssSelector(".h3.h3.fw-500");
	public By loginPhoneNumber = By.cssSelector("#phone");
	public By loginPassword = By.cssSelector("#password");
	public By loginButton = By.xpath("//button[normalize-space()='Login']");
	public By loginError = By.xpath("//p[@class='login-error text-danger']");

	// Customer Registration
	public String registerPageTitle = "SOOKH | Register";
	public String registerPageUrl = "https://www.sookh.com/users/registration";
	public String regi_passwordNotMatchtext = "The password confirmation does not match.";
	

	
	public By registerNowLink = By.xpath("//a[normalize-space()='Register Now']");
	public By regi_enterName = By.cssSelector("input[placeholder='Name *']"); 
	public By regi_enterPhoneNumber = By.xpath("//input[@id='phone_no']");
	public By regi_Password = By.xpath("//input[@id='new_password']");
	public By regi_ConfirmPassword= By.xpath("//input[@id='confirm_password']");
	public By regi_checkTermsAndCondition = By.cssSelector(".aiz-square-check");
	public By regi_createAccountButton = By.cssSelector("#password_update");
	
	//Phone Verification
	
	public String verification_pageTitle = "SOOKH | Phone Verification";
	public String verify_resendAlertText = "Verification code resend successfully";
	public By verif_Text_PV = By.cssSelector(".heading.heading-4.fw-500");
	public By verifi_enterOPT = By.cssSelector("input[placeholder='OTP Number']");
	public By verify_verifyButton = By.xpath("//button[normalize-space()='Verify']");
	public By verify_resendCode = By.cssSelector(".text-primary");
	
	//Customer DashBoard
	public String dashBoardUrl = "https://www.sookh.com/dashboard";
	public String dashBoardTitle = "SOOKH | Dashboard";
	public By dashBoardName = By.cssSelector("section .h5.fw-600");
	
	
	/*
	public By  = By
	public By  = By
	public By  = By
	public By  = By
	*/
	
	
	
	//public static By notifiPopUpHost = By.cssSelector(".airship-html-prompt-shadow");
	//public static By notInterestedButtonClick = By.cssSelector(".airship-btn.airship-btn-deny");
}
