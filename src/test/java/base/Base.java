package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import model.Locators;

public class Base {

	WebDriver driver = null;
	
	@BeforeClass
	public void setUp() {
		Locators lc = new Locators();
		String browser = System.getProperty("browser", "opera");
		if (browser.contains("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			
		}
		else if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if(browser.contains("htmlunit")) {
			driver = new HtmlUnitDriver();
			
		}
		driver.get(lc.homePageUrl);
		driver.manage().window().maximize();
		
		PageDriver.getInstance().setDriver(driver);
	}

	@AfterClass
	public void tearDown() {
		PageDriver.getCurrentDriver().quit();

	}

}
