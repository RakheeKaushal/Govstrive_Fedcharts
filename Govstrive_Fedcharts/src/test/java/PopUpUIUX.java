import org.openqa.selenium.Alert;
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
import java.util.Iterator;		
import java.util.Set;

public class PopUpUIUX {
	
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
        driver.findElement(By.id("password")).sendKeys("Success@123456");							
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
	    
	   int result = checkFont_Padding();
        System.out.println("Result" + result);
        if(result == 1) {
        	System.out.println("Yipee");	
        }
        else {
        	System.out.println("OMG");
        }
        	
               //close Browser :Do not do 
        //driver.close();			
	}
   @Test()
   public int checkFont_Padding(){
	    //WAIT
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       
        System.out.println("Test Results for UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
      	System.out.println("Test Results for UI/UX for :Manage Office");
        //*[@id="container"]/div/div/div/button[2]
      
      	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/button[2]")).click();
        // Switching to Pop up        
      	 String MainWindow=driver.getWindowHandle();		
      	System.out.println("Where am I in Main : " + driver.getTitle());
         // To handle all new opened window.				
         Set<String> s1=driver.getWindowHandles();		
         Iterator<String> i1=s1.iterator();		
         		
         while(i1.hasNext())			
         {		
             String ChildWindow=i1.next();		
             System.out.println("Child Window" + ChildWindow);  		
             //if(!MainWindow.equalsIgnoreCase(ChildWindow))			
             //{    		
                  
        // Switching to Child window
        driver.switchTo().window(ChildWindow);
        //*[@id="moveOffices"]
        driver.findElement(By.xpath("*[@id=\"moveOffices\"]"));
        System.out.println("Got it :");
        System.out.println("Where am I : " + driver.switchTo().window(ChildWindow).getTitle());
             //}
         }
      	//System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/nav/div[2]/ul/li[1]/a/i")).getCssValue("max-height"));
      	//
      	System.out.println("----------------------------------------------------------------------------------");
    
      	       
           	/*Element Not found
       	System.out.println("Test Results for Icon UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	System.out.println("Test Results for Icon UI/UX for : Annotations");
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("max-height"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("max-width"));
       	System.out.println(driver.findElement(By.xpath("//*[@id=\"leftmenudiv\"]/div[3]/div/div[6]/div[1]/div[1]/img")).getCssValue("margin-right"));
       	System.out.println("----------------------------------------------------------------------------------");
        */
       	//Assert.assertEquals("52px",driver.findElement(By.id("orgchartPageTitle")).getCssValue("padding-top"));
        return 1;
      //}catch(Exception e){
       	//System.out.println("Test Failed : Top Padding not as per UI/UX Guidelines");
       	//return 0;
       }
       
       //close Browser :Do not do 
       //driver.close();
	}
//}