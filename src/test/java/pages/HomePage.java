package pages;

import model.CommonMethods;
import model.Locators;
import model.Timeout;

public class HomePage extends CommonMethods{
	Locators lc =  new Locators();
	Timeout time = new Timeout();
	
	public String homePageUrl() {
		return  lc.homePageUrl;
	}
	
	public String getCurrentUrl() {
		return currentPageUrl();
		
	}
	public String title() {
		return getTitle();
	}
	public void waitForPageloas() {
		time.waitForEl(lc.home_welcomeMassage);
	}

}
