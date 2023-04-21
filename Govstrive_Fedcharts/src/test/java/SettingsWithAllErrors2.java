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
import java.util.concurrent.TimeUnit;

public class SettingsWithAllErrors2 {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("Jai Mata Di!");
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver1.exe");
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
	    
	    //Settings Page
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.linkText("Settings")).click();	        
        System.out.println("Settings Clicked");
        //WAIT
        //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

        int result_Settings = checkFont_Padding();
        
        //Users Page
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/div/div[3]/button")).click();
        driver.findElement(By.linkText("User List")).click();	        
        System.out.println("User List Clicked");
        int result_USer = checkFont_Padding();
        System.out.println("Result" + result_USer);
        /*
        if(result_Settings == 1) {
        	System.out.println("Yipee");	
        }
        else {
        	System.out.println("OMG");
        }
        */	
                
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
       	
       	softAssert.assertEquals("50px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-bottom"));
       	   
        //System.out.println("Page Title Font Family: " + driver.findElement(By.id("orgchartPageTitle")).getCssValue("font-family"));
       	softAssert.assertEquals("26px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("font-size"));
        //System.out.println("Page Title Font Color: " + driver.findElement(By.id("orgchartPageTitle")).getCssValue("color"));
       	softAssert.assertEquals("52px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-top"));
        softAssert.assertAll();
        return 1;
      }catch(Throwable e){
       	System.out.println("Test Failed! " + e);
       	return 0;
       }
       
       //close Browser :Do not do 
       //driver.close();
	}
}