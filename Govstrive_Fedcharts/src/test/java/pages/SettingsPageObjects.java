package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPageObjects {

	WebDriver driver = null;
	
	// Get Page Title
   	//System.out.println("Test Results for Page Title UI/UX : " + driver.findElement(By.id("orgchartPageTitle")).getText());
   	By pgTitle = By.id("orgchartPageTitle");
   	
   	//-------------------------------------------------------------------------------------------------------
    //Get User Bar Icons
   	
   	//System.out.println("Test Results for Icon UI/UX for : Signed In As");
   	By iconSignedInAs = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Notification");
   	By iconNotification = By.xpath("//*[@id=\"notificationButton\"]/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Home");
   	By iconHome = By.xpath("//*[@id=\"homeButton\"]/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : LogOut");
   	By iconLogout = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[4]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Help");
   	By iconHelp = By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/i");
   	
   	//System.out.println("Test Results for Icon UI/UX for : Global Light Bulb");
   	By iconGlobalLightBulb = By.xpath("//*[@id=\"container\"]/div/section/div[1]/div/div[3]/a");
   	
    //GET ICONS
   	By iconOrgView = By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[1]/div/input");
   	
   	By iconBlackWhite = By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[3]/div/input");
   	
   	By iconSetTimeZone =By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[5]/svg");
   			
   	By iconChangePass = By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[7]/div/input");
   	
   	//Get Text 
	
	//Get Drop Down
		
	//Get Buttons
	
   //METHODS
   	
   	public SettingsPageObjects(WebDriver driver) {
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
 	public String getIconHeight_iconNotification() {
   		return driver.findElement(iconNotification).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconNotification() {
   		return driver.findElement(iconNotification).getCssValue("max-width");
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
 	public String getIconHeight_iconGlobalLightBulb() {
   		return driver.findElement(iconGlobalLightBulb).getCssValue("max-height");
   	}
 	
 	public String getIconWidth_iconGlobalLightBulb() {
   		return driver.findElement(iconGlobalLightBulb).getCssValue("max-width");
   	}	
 	
 	//Icons on page
 	public String getIconHeight_iconOrgView() {
   		return driver.findElement(iconOrgView).getCssValue("height");
   	}
 	
 	public String getIconWidth_iconOrgView() {
   		return driver.findElement(iconOrgView).getCssValue("width");
   	}
 	public String getIconHeight_iconBlackWhite() {
   		return driver.findElement(iconBlackWhite).getCssValue("height");
   	}
 	
 	public String getIconWidth_iconBlackWhite() {
   		return driver.findElement(iconBlackWhite).getCssValue("width");
   	}
 	
 	public String getIconHeight_iconSetTimeZone() {
   		return driver.findElement(iconSetTimeZone).getCssValue("height");
   	}
 	
 	public String getIconWidth_iconSetTimeZone() {
   		return driver.findElement(iconSetTimeZone).getCssValue("width");
   	}
 	public String getIconHeight_iconChangePass() {
   		return driver.findElement(iconChangePass).getCssValue("height");
   	}
 	
 	public String getIconWidth_iconChangePass() {
   		return driver.findElement(iconChangePass).getCssValue("width");
   	}
}
