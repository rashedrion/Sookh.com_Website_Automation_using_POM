package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.PageDriver;

public class CommonMethods {
	
	public String currentPageUrl() {
		return PageDriver.getCurrentDriver().getCurrentUrl();
	}
	public String getTitle() {
		return PageDriver.getCurrentDriver().getTitle();
	}

	public void clickOnButton(By btn) {
		PageDriver.getCurrentDriver().findElement(btn).click();
	}

	public String getText(By element) {
		return PageDriver.getCurrentDriver().findElement(element).getText();
	}
	
	public int getSize(By element) {
		return PageDriver.getCurrentDriver().findElements(element).size();
	}
	
	public List<WebElement> getEls(By element) {
		return PageDriver.getCurrentDriver().findElements(element);
	}

	public void sendText(By element, String value) {
		PageDriver.getCurrentDriver().findElement(element).sendKeys(value);

	}
	
	public void shadowDomPopUp(By host, By btn) {
		WebElement shadowDomHostElement = PageDriver.getCurrentDriver().findElement(host);
		// Finding the ShadowRoot in a WebElement 
		SearchContext context = shadowDomHostElement.getShadowRoot();
		// finding the targeted element
		context.findElement(btn).click();
	}
	
	public void selectitem(By element, String visibleText) {
		Select selectItems = new Select(PageDriver.getCurrentDriver().findElement(element));
		selectItems.selectByVisibleText(visibleText);
	}
	
	public void listitem(By element, String visibleText) {
		List<WebElement> listItems =  PageDriver.getCurrentDriver().findElements(element);
		for(WebElement item : listItems) {
			if(item.getText().equals(visibleText)) {
				item.click();
				break;	
			}
		}
	}
	
	public void highlighter(By element) {
		WebElement el = PageDriver.getCurrentDriver().findElement(element);
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background: beige');", el);
		
	}
	public void scorllToElement(By element) {
		WebElement el = PageDriver.getCurrentDriver().findElement(element);
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", el);
	}
	
	public void scorllInsideElement(String cssLocator,int offsetX, int offsetY ) {
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
		js.executeScript("document.querySelector('"+cssLocator+"').scrollBy("+offsetX+","+offsetY+");");
	}



}
