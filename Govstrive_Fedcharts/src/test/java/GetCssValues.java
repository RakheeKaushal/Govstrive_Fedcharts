import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//https://www.seleniumeasy.com/selenium-tutorials/how-to-get-css-values-using-webdriver
public class GetCssValues {

	public WebDriver driver;
	//private By bySearchButton = By.name("btnK");
								
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://fedchart-redesign.azurewebsites.net/";
		driver.get(baseUrl);
		//driver.findElement(By.id("username")).sendKeys("u@govstrive.com");							
        //driver.findElement(By.id("password")).sendKeys("Success@123456");							
        //driver.findElement(By.xpath("//input[@type='submit']")).submit();					
        //System.out.println("Login Done with Submit");
	}

	@Test(priority=1)
	public void getCssValue_ButtonColor()  {
		//WebElement wb = driver.findElement(By.className("btn btn-light new-btn-design"));
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		int buttonCount=0;
		for(WebElement a : buttons){        
		    if(a.getText().equals("buttonName")){
		          buttonCount++;
		}   
		    System.out.println(buttonCount);
		}
		/*
		WebElement googleSearchBtn = driver.findElement(bySearchButton); 
		System.out.println("Color of a button before mouse hover: "	+ googleSearchBtn.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(googleSearchBtn).perform();
		System.out.println("Color of a button after mouse hover : "	+ googleSearchBtn.getCssValue("color"));
		*/
	}
	/*
	@Test(priority=2)
	public void getCssValue_ButtonFontSize() {
		WebElement googleSearchBtn = driver.findElement(bySearchButton);
		System.out.println("Font Size of a button "	+ googleSearchBtn.getCssValue("font-size"));
	}
	
	@Test(priority=3)
	public void getCssValue_ButtonFontWeight(){
		WebElement googleSearchBtn = driver.findElement(bySearchButton);
		System.out.println("Font Weight of a button "	+getFontWeight(googleSearchBtn) );
	}
	
	public String getFontWeight(WebElement element) {
		//Output will return as 400 for font-weight : normal, and 700 for font-weight : bold
		return element.getCssValue("font-weight");
	}
	*/
	
	//@AfterClass
	//public void tearDown() {
	//	driver.quit();
	//}
}