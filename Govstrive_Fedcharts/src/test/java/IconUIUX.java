import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IconUIUX {
	
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
public void checkSettings_IconSize_Padding(){
	    //WAIT
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
    //Settings Page
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/span")).click();
    driver.findElement(By.linkText("Settings")).click();	        
    System.out.println("Settings Clicked");
    
    System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
   	
  //*[@id="container"]/div/div/div[2]/div/div[1]/div/input
   	//"//img[@title='Tutorialspoint']"
    System.out.println("UI/UX for Organisation View");
   	System.out.println(driver.findElement(By.xpath("//input[@class='resizeIcons image_pr-10']")).getCssValue("height"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[1]/div/input")).getCssValue("width"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[1]/div/input")).getCssValue("padding"));
   	System.out.println("----------------------------------------------------------------------------------");
 
   	System.out.println("UI/UX for Switch to Black and White");
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[3]/div/input")).getCssValue("height"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[3]/div/input")).getCssValue("width"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[3]/div/input")).getCssValue("padding"));
   	System.out.println("----------------------------------------------------------------------------------");    
   
   	//start from here //*[@id="container"]/div/div/div[2]/div/div[5]/svg
   	//jss19 resizeIcons image_pr-10
   	System.out.println("UI/UX for Set Time Zone");
   	//System.out.println(driver.findElement(By.xpath("//svg[@class='jss19 resizeIcons image_pr-10']")).getCssValue("height"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[5]/svg")).getCssValue("width"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[5]/svg")).getCssValue("padding"));
   	System.out.println("----------------------------------------------------------------------------------");
  //   	*[@id="container"]/div/div/div[2]/div/div[7]/svg
   	System.out.println("UI/UX for Change Password");
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[7]/div/input")).getCssValue("height"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[7]/div/input")).getCssValue("width"));
   	System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div[7]/div/input")).getCssValue("padding"));
   	System.out.println("----------------------------------------------------------------------------------");    
    }
    
    //close Browser :Do not do 
    //driver.close();
	}
//}