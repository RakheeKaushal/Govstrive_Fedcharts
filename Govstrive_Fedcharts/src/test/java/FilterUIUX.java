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

public class FilterUIUX {
	
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
	 //*[@id="multiselectContainerReact"]/div[2]
	 //*[@id="multiselectContainerReact"]/div[1]
       //WAIT
       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
       System.out.println("----------------------------------------------------------------------------------");
       //try {
       	System.out.println("Test Results for Filter UI/UX for : " + driver.findElement(By.id("orgchartPageTitle")).getText());
       	
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]")).getCssValue("font-family"));
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]")).getCssValue("font-size"));
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]")).getCssValue("color"));
      
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]/ul")).getCssValue("padding-top"));
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]/ul")).getCssValue("padding-bottom"));
      //
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]/ul/li[1]")).getCssValue("padding-left"));
       	System.out.println(driver.findElement(By.xpath("//*[@id='multiselectContainerReact']/div[2]/ulli[1]")).getCssValue("padding-right"));
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