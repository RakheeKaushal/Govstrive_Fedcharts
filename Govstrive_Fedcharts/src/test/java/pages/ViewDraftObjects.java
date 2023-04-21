package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewDraftObjects {

	WebDriver driver = null;
	
	// Get Page Title
   	By pgTitle = By.id("orgchartPageTitle");
   	
    
   	//METHODS
   	
   	public ViewDraftObjects(WebDriver driver) {
   		this.driver = driver;
   	}
   	//Page Title
   	public String getPageTitle() {
   		return driver.findElement(pgTitle).getText();
   	}
   	public String getFontSize() {
   		return driver.findElement(pgTitle).getCssValue("font-size");
   	}
 	public String getTopPadding() {
   		return driver.findElement(pgTitle).getCssValue("padding-top");
   	}
 	public String getBottomPadding() {
   		return driver.findElement(pgTitle).getCssValue("padding-bottom");
   	}
 
	
}
