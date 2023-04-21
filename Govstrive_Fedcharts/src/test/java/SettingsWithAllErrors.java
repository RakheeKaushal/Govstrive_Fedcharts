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

import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;
	
public class SettingsWithAllErrors {
	
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
      	        
        driver.findElement(By.xpath("//*[@id=\"left_menu_nav\"]")).click();
        System.out.println("Left Menu Clicked");
        //*[@id="menutree"]
        driver.findElement(By.xpath("//*[@id=\"menutree\"]")).click();
        System.out.println("Org Structure Clicked");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;

   
	}
	
   @Test
	public void verifyUIUX() {
	   
	   //HOME
	   System.out.println("On Home Page");	
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Home = checkFont_Padding();
       /*
	   //SUBMIT CHANGES 
       //POSITION DETAIL CHANGES
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/ul/li[1]/a")).click();
       System.out.println("Position Detail Changes");
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Submit_Pos = checkFont_Padding();
       
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from Position Detail Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
       
       //ORGANISATIONAL LEVEL CHANGES
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/ul/li[2]/a")).click();
       System.out.println("Organisational Level Changes");
     
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Submit_Org = checkFont_Padding();
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from Organisational Level Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
       
       //HAR CHANGES
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[1]/ul/li[3]/a")).click();
       System.out.println("HAR Changes");
     
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Submit_HAR = checkFont_Padding();
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from HAR Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
       
       //--------------------------------------------------------------------------------------------------------
	   //APPROVE CHANGES
       //POSITION DETAIL CHANGES
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/ul/li[1]/a")).click();
       System.out.println("Approve Changes/Position Detail Changes");
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Approve_Pos = checkFont_Padding();
       
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from Approve/Position Detail Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
       
       //ORGANISATIONAL LEVEL CHANGES
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/ul/li[2]/a")).click();
       System.out.println("Organisational Level Changes");
     
     
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Approve_Org = checkFont_Padding();
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from Organisational Level Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
       
       //HAR CHANGES 
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/a/button")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div[2]/ul/li/ul/li[2]/ul/li[3]/a")).click();
       System.out.println("Approve/HAR Changes");
     
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Approve_HAR = checkFont_Padding();
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/a[1]/button")).click();
       System.out.println("Back Home from HAR Changes");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

       
       //BACK TO HOME
	   //SETTINGS
	    //Settings Page
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
       driver.findElement(By.linkText("Settings")).click();	        
       System.out.println("Settings Clicked");
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Settings = checkFont_Padding();
       
       //BACK TO HOME
       driver.findElement(By.xpath("//*[@id=\"homeButton\"]/span")).click();
       System.out.println("Back Home from Settings");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

       //ADMINISTRATOR >> USERS LIST
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
       driver.findElement(By.linkText("User List")).click();	        
       System.out.println("User List Clicked");
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_UserList = checkFont_Padding();
       //BACK TO HOME NOT REQUIRED
      
       
       //ADMINISTRATOR >> USERS DETAILS
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/button")).click();
       System.out.println("User Details Clicked");
       //WAIT AND PERFORM UI TESTS
       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
       int result_UserDetails = checkFont_Padding();
       
	   //ADMINISTRATOR >> System Configuration
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
       driver.findElement(By.linkText("System Configuration")).click();	        
       System.out.println("System Configuration Clicked");
       
       
	   //ADMINISTRATOR >> VIEW DRAFT STRUCTURES
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
       driver.findElement(By.linkText("View Draft Org Structures")).click();	        
       System.out.println("View Draft Org Structures Clicked");
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_View_Draft = checkFont_Padding();
       */
	   //HELP
       driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[5]/a/span")).click();
       System.out.println("Help Clicked");
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       int result_Help = checkFont_Padding();
       
       //LOG OUT
	         
        //close Browser :Do not do 
        //driver.close();			
	}
   @Test()
   public int checkFont_Padding(){
	 
       //WAIT
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       System.out.println("----------------------------------------------------------------------------------");
       
       try {
       	System.out.println("Test Results for Page Title UI/UX : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	SoftAssert softAssert = new SoftAssert();
       	
       	softAssert.assertEquals("52px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-bottom"),"Bottom Padding");
       	   
        //System.out.println("Page Title Font Family: " + driver.findElement(By.id("orgchartPageTitle")).getCssValue("font-family"));
       	softAssert.assertEquals("26px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("font-size"),"Font Size");
        String color =  driver.findElement(By.id("orgchartPageTitle")).getCssValue("color");
        String s1 = color.substring(4);
        color = s1.replace(')', ' ');
        StringTokenizer st = new StringTokenizer(color);
        int r = Integer.parseInt(st.nextToken(",").trim());
        int g = Integer.parseInt(st.nextToken(",").trim());
        int b = Integer.parseInt(st.nextToken(",").trim());
        System.out.println("Hello there: " + color + " r : " + r + "g : " + g + "b: " + b);
        /*
        Color c = new Color(r, g, b);
        String hexFont = "#"+Integer.toHexString(c.getRGB()).substring(2);
        System.out.println("Page Title Font Color: " + hexFont);
        
       	softAssert.assertEquals("51px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-top"),"Top Padding");
        softAssert.assertAll();*/
        return 1;
      }catch(Throwable e){
       	System.out.println("Test Failed! " + e);
       	return 0;
       	
        
       }
       
       
	}
}