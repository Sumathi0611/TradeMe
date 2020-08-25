package LibraryLayer;
/**
* CommonFunctions_Selenium class contains Selenium methods
* @author  Sumathi Thirumugam
* @version 1.0
* @since   2020-08-25
*/
import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





public class CommonFunctions_Selenium{
	
	 static WebDriver driver;
	 /**
	   * This method is used to invoke the Chrome browser for execution , pass the URL and maximize the browser
	   * @return void This method does not return any value
	   */
	public void start_Browser() throws IOException
	{
		//Calls the create reference method to create a reference Map with Key and Value pair required for execution
		CreateReference.createReference();
		//Sets the chromedriver path
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		//invokes the Chrome browser and passes the URL
		driver = new ChromeDriver();
        driver.get(CreateReference.refMap.get("URL"));
        driver.manage().window().maximize();
        
        
       
	}
	/**
	   * This method is to select the value from dropdown
	   * @param xpath This is the xpath of the element
       * @param visibleText This is the visible text to be selected in the dropdown
	   * @return void This method does not return any value
	   */
	public static void selectDropdownOption(String xpath,String visibleText)
	{
		
		//WebDriverWait wait=new WebDriverWait(driver, 200);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByVisibleText(visibleText);
		
	}
	/**
	   * This method is to get text from an element
	   * @param xpath This is the xpath of the element
       * @return void This method does not return any value
	   */
	public static String getText(String xpath)
	{
		String value=null;
		
		WebDriverWait wait=new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		value=driver.findElement(By.xpath(xpath)).getText();
		
		
		return value;
	}
	/**
	   * This method is to click an element
	   * @param xpath This is the xpath of the element
     * @return void This method does not return any value
	   */
	public static void click(String xpath)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			WebElement element = driver.findElement(By.xpath(xpath));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false);", element);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		  
		
	}
	/**
	   * This method is to check if an element exists
	   * @param xpath This is the xpath of the element
     * @return void This method does not return any value
	   */
	public static void elementExists(String xpath)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			WebElement element = driver.findElement(By.xpath(xpath));
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false);", element);
		    element.isDisplayed();
		
	}
	
	/**
	   * This method is to close the browser
	   * @param xpath This is the xpath of the element
     * @return void This method does not return any value
	   */
	public static void closeBrowser()
	{
		
		
		driver.close();
		
	}

	
	}
	

