import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Jai Mata Di!");
			
			
			System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver1.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        
	        //String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String baseUrl = "https://fedchart-redesign.azurewebsites.net/";
	        String expectedTitle = "Log In";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        //using submit method to submit the form. Submit used on password field		
	        		
	        driver.findElement(By.id("username")).sendKeys("u@govstrive.com");							
	        driver.findElement(By.id("password")).sendKeys("Success@123456");							
	        driver.findElement(By.xpath("//input[@type='submit']")).submit();					
	        System.out.println("Login Done with Submit");	
	        
	        
	        		
	        
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Hurray! God is GReat!");
	        }
	       
	        //close Browser :Do not do 
	        //driver.close();
			
	}

	
}
