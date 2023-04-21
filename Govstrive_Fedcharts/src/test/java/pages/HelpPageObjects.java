package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpPageObjects {
	
WebDriver driver = null;
	
	// Get Page Title //*[@id="main-wrapper"]/div/div/div[1]/span
   	By pgTitle = By.id("page-title");
   	
  //-------------------------------------------------------------------------------------------------------
    //Get User Bar Icons
   	
   	//System.out.println("Test Results for Icon UI/UX for : Signed In As");
   	By iconSignedInAs = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Home");
   	By iconHome = By.xpath("//*[@id=\"homeButton\"]/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : LogOut");
   	By iconLogout = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[4]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Help");
   	By iconHelp = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Global Light Bulb");
   	By iconGlobalLightBulb = By.xpath("//*[@id=\"container\"]/div/section/div[1]/div/div[3]/a");

   	//Get Text
   	
 //METHODS
   	
   	public HelpPageObjects(WebDriver driver) {
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
 	
 	//User Bar Icons
 	public String getIconHeight_iconSignedInAs() {
   		return driver.findElement(iconSignedInAs).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconSignedInAs() {
   		return driver.findElement(iconSignedInAs).getCssValue("max-width");
   	}
 	
	public String getIconHeight_iconHome() {
   		return driver.findElement(iconHome).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconHome() {
   		return driver.findElement(iconHome).getCssValue("max-width");
   	}
 	public String getIconHeight_iconLogout() {
   		return driver.findElement(iconLogout).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconLogout() {
   		return driver.findElement(iconLogout).getCssValue("max-width");
   	}	
 	public String getIconHeight_iconHelp() {
   		return driver.findElement(iconHelp).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconHelp() {
   		return driver.findElement(iconHelp).getCssValue("max-width");
   	}
}
