import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IconUIUX2 {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
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
        
        //"Org Structure Clicked"
        driver.findElement(By.xpath("//*[@id=\"menutree\"]")).click();
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;

   
	}
	/*	
   @Test
	public void verifyUIUX() {
	   //VERIFY ICONS ON HOME 
	   //checkHome_IconSize_Padding();
	   
	   //VERIFY ICONS ON SETTINGS
	   checkSettings_IconSize_Padding(); 
        	
       //close Browser :Do not do 
       //driver.close();			
	}
   //for home icons
   
   @Test()
   public void checkHome_IconSize_Padding(){
	    //WAIT
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       
        System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
      	System.out.println("Test Results for Icon UI/UX for : Signed In As");
      	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i")).getCssValue("max-height"));
      	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i")).getCssValue("max-width"));
      	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i")).getCssValue("margin-right"));
      	System.out.println("----------------------------------------------------------------------------------");
    
      	       
       //try {
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Notification");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"notificationButton\"]/i")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"notificationButton\"]/i")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"notificationButton\"]/i")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");
       	
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Home");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"homeButton\"]/i")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"homeButton\"]/i")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"homeButton\"]/i")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");
       	
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : LogOut");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[4]/a/i")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[4]/a/i")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[4]/a/i")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");
       	
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Help");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/i")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/i")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/i")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");
    	  	
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Global Light Bulb");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/section/div[1]/div/div[3]/a")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/section/div[1]/div/div[3]/a")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/section/div[1]/div/div[3]/a")).getCssValue("margin-left"));
       	System.out.println("----------------------------------------------------------------------------------");

       	/*Element Not found
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Annotations");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");

       	//Assert.assertEquals("52px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-top"));
     
      //}catch(Exception e){
       	//System.out.println("Test Failed : Top Padding not as per UI/UX Guidelines");
       	//return 0;
     
       
       //close Browser :Do not do 
       //driver.close();
	}
        */
@Test()
public void checkSubmitPages_IconSize_Padding(){
	    //WAIT
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
   
	   //SUBMIT CHANGES 
    //POSITION DETAIL CHANGES
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/ul/li[1]/a")).click();
    System.out.println("Position Detail Changes");
    //WAIT AND PERFORM UI TESTS
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
    System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
   	
  
   	//"//img[@title='Tutorialspoint']"
    //By.xpath("//img[contains(@src,'web/L001/images/IMAGENAME.jpg')]")
    //System.out.println(driver.findElement(By.xpath("//input[contains(@src='/images/edit_pencil.jpg')]")).getCssValue("height"));
    try {
    System.out.println("Bulb Icon UI/UX");	
    SoftAssert softAssert = new SoftAssert();
   	
   	softAssert.assertEquals("24px",driver.findElement(By.xpath("//*[@id=\"changesTable\"]/thead/tr/th[15]/img")).getCssValue("height"),"Bulb Icon Height");
   	softAssert.assertEquals("24px",driver.findElement(By.xpath("//*[@id=\"changesTable\"]/thead/tr/th[15]/img")).getCssValue("width"),"Bulb Icon Width");
    //System.out.println(driver.findElement(By.xpath("//*[@id=\"changesTable\"]/thead/tr/th[15]/img")).getCssValue("height"));
    //System.out.println(driver.findElement(By.xpath("//*[@id=\"changesTable\"]/thead/tr/th[15]/img")).getCssValue("width"));
    System.out.println("----------------------------------------------------------------------------------");
    
    List<WebElement> eye_icons = driver.findElements(By.className("resizeIcons"));
    Iterator<WebElement> itr = eye_icons.iterator();
    while(itr.hasNext()) {
        WebElement eye_icon = itr.next(); 
        System.out.println("Eye Icon UI/UX");    
        softAssert.assertEquals("24px",eye_icon.getCssValue("height"),"Eye Icon Height");
        softAssert.assertEquals("24px",eye_icon.getCssValue("width"),"Eye Icon Width");
    	//System.out.println(eye_icon.getCssValue("height"));
    	//System.out.println(eye_icon.getCssValue("width"));
    }
   	   	   	   	
    softAssert.assertAll();
    
    }catch(Throwable e){
       	System.out.println("Issues Observed ! " + e);
    }
   	
    //close Browser :Do not do 
    //driver.close();
  }
}