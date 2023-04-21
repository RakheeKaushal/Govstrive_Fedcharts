package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HelpPageObjects;
import pages.SettingsPageObjects;
import pages.ViewDraftObjects;

public class verifyUIUX_PageTitle {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    @Test 
	public static void verifyUIUX() {
		System.out.println("Jai Mata Di!");
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
    	
        String baseUrl = "https://fedchart-redesign.azurewebsites.net/";
   	   
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        //TBD : call login class
        
       // LOAD AGENCY AND ORG STRUCTURE FOR AGENCY
        driver.findElement(By.id("username")).sendKeys("u@govstrive.com");							
        driver.findElement(By.id("password")).sendKeys("Beans@1234567");						
        driver.findElement(By.xpath("//input[@type='submit']")).submit();					
        System.out.println("Login Done with Submit");	
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
      	
      //"Left Menu Clicked"
        driver.findElement(By.xpath("//*[@id=\"left_menu_nav\"]")).click();
        
        //"Organization Structure Clicked"
        driver.findElement(By.xpath("//*[@id=\"menutree\"]")).click();
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;

        //SETTINGS PAGE 
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.linkText("Settings")).click();	        
        System.out.println("Settings Clicked");
        //WAIT AND PERFORM UI TESTS
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
        SettingsPageObjects settingObj1 = new SettingsPageObjects(driver);
        
        
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Page Title UI/UX Results for Settings Page");
        softAssert.assertEquals("26px",settingObj1.getFontSize(),settingObj1.getPageTitle()+ " :Font Size");
        softAssert.assertEquals("51px",settingObj1.getTopPadding(),settingObj1.getPageTitle()+ " :Top Padding");
        softAssert.assertEquals("52px",settingObj1.getBottomPadding(),settingObj1.getPageTitle()+ " :Bottom Padding");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
 	   //ADMINISTRATOR >> VIEW DRAFT STRUCTURES
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
        driver.findElement(By.linkText("View Draft Org Structures")).click();	        
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
        ViewDraftObjects viewDrObj1 = new ViewDraftObjects(driver);
        softAssert.assertEquals("24px",viewDrObj1.getFontSize(),viewDrObj1.getPageTitle()+ " :Font Size");
        softAssert.assertEquals("51px",viewDrObj1.getTopPadding(),viewDrObj1.getPageTitle()+ " :Top Padding");
        softAssert.assertEquals("50px",viewDrObj1.getBottomPadding(),viewDrObj1.getPageTitle()+ " :Bottom Padding");
        
        //BACK TO HOME //*[@id="homeButton"]    //*[@id="homeButton"]
        driver.findElement(By.id("homeButton")).click();
        System.out.println("Back Home from Position Detail Changes");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        
        
        /*
           
        //HELP ( Not getting pgae title as opening in new window)
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/span")).click();
        System.out.println("Help Clicked");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
        HelpPageObjects helpObj1 = new HelpPageObjects(driver);
        System.out.println("Page Title UI/UX Results for Help Page");
        softAssert.assertEquals("24px",helpObj1.getFontSize(),helpObj1.getPageTitle()+ "Font Size");
        softAssert.assertEquals("51px",helpObj1.getTopPadding(),helpObj1.getPageTitle()+ "Top Padding");
        softAssert.assertEquals("50px",helpObj1.getBottomPadding(),helpObj1.getPageTitle()+ "Bottom Padding");
        */
        softAssert.assertAll();
	}
}
