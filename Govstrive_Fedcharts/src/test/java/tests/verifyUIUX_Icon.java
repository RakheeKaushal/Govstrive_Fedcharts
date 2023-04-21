package tests;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.SettingsPageObjects;
import pages.ViewDraftObjects;

public class verifyUIUX_Icon {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    @Test
	public static void verifyUIUX() {
		System.out.println("Jai Mata Di2!");
		/*
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
        
        //"Org Structure Clicked"
        driver.findElement(By.xpath("//*[@id=\"menutree\"]")).click();
        */
		//SET DRIVER
		driver = verifyUIUX_PageTitle.driver;
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;

        //SETTINGS PAGE 
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.linkText("Settings")).click();	        
        System.out.println("Settings Clicked");
        //WAIT AND PERFORM UI TESTS
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
        SettingsPageObjects settingObj1 = new SettingsPageObjects(driver);
        
        SoftAssert softAssert = new SoftAssert();
        //User Bar Icons
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconSignedInAs(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconSignedInAs(),"Icon Width");
       
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconNotification(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconNotification(),"Icon Width");

        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconHome(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconHome(),"Icon Width");
       
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconLogout(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconLogout(),"Icon Width");

        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconHelp(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconHelp(),"Icon Width");
       
      

        //Other Icons on page
        
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconOrgView(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconOrgView(),"Icon Width");
       
        /*
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconBlackWhite(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconBlackWhite(),"Icon Width");

        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconSetTimeZone(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconSetTimeZone(),"Icon Width");
       
        softAssert.assertEquals("24px",settingObj1.getIconHeight_iconChangePass(),"Icon Height");
        softAssert.assertEquals("24px",settingObj1.getIconWidth_iconChangePass(),"Icon Width");
        */
        System.out.println("View Draft Structures Clicked");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
 	   //ADMINISTRATOR >> VIEW DRAFT STRUCTURES
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
        driver.findElement(By.linkText("View Draft Org Structures")).click();	        
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
        
        ViewDraftObjects viewDrObj1 = new ViewDraftObjects(driver);
        try {
        List<WebElement> eye_icons = driver.findElements(By.className("resizeIcons"));
        Iterator<WebElement> itr = eye_icons.iterator();
        while(itr.hasNext()) {
            WebElement eye_icon = itr.next(); 
            System.out.println("Eye Icon UI/UX");    
            softAssert.assertEquals("25px",eye_icon.getCssValue("height"),viewDrObj1.getPageTitle() + " : Eye Icon Height");
            softAssert.assertEquals("24px",eye_icon.getCssValue("width"),viewDrObj1.getPageTitle() + " : Eye Icon Width");
        	
            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
        }}catch(Throwable e){
           	System.out.println("Issues Observed ! " + e);
        }
       	
        softAssert.assertAll();
        
	}
}
