package LibraryLayer;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.configuration.Theme;






public class Module_TradeMe_HomePage extends CommonFunctions_Selenium{
	ExtentReports reports = new ExtentReports();

	
	 public static void selectCarsFromSearchItems() {
			
		  selectDropdownOption(CreateReference.refMap.get("drpdownSearchType"),"Cars, bikes & boats");
		  click(CreateReference.refMap.get("buttonSearch"));
		  elementExists(CreateReference.refMap.get("linkUsedCars"));
		  click(CreateReference.refMap.get("linkUsedCars"));
		  
		  
		  
	  }
	 
	 
}
