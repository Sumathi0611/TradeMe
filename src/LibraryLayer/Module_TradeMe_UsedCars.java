package LibraryLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
public class Module_TradeMe_UsedCars extends CommonFunctions_Selenium{
	
	public static void verifyUsedCarListing() {
		 List<WebElement> listUsedCars = driver.findElements(By.xpath(CreateReference.refMap.get("listUsedCars")));
		 boolean usedCarsFlag=false;
		 findUsedCarsLoop:for(int count=0;count<listUsedCars.size();count++)
		 {
			 String listCarCount=listUsedCars.get(count).getText();
			 if(!listCarCount.contentEquals("(0)"))
			 {
				 
				 usedCarsFlag=true;
				 break findUsedCarsLoop;
			 }
			 else
			 {
				continue findUsedCarsLoop;
			 }
			 
		 }
		 if(usedCarsFlag)
		 {
			System.out.println("There is atleast one car listing in the used car section");
		 }
		 else
		 {
			 fail("There is no car listings in the used car section");
			 System.out.println("There is no car listings in the used car section");
		 }
	 }

	public static void verifyKiaMake() {
		 List<WebElement> listUsedCars = driver.findElements(By.xpath(CreateReference.refMap.get("listUsedCars")));
		 List<WebElement> listUsedCarMake = driver.findElements(By.xpath(CreateReference.refMap.get("listUsedCarsMake")));
		 boolean carMake=false;
		 String listCarCount=null;
		 findUsedCarsLoop:for(int count=0;count<listUsedCars.size();count++)
		 {
			 listCarCount=listUsedCars.get(count).getText();
			 String make=listUsedCarMake.get(count).getText();
			 if(make.contentEquals("Kia"))
			 {
				 
				 carMake=true;
				 break findUsedCarsLoop;
			 }
			 else
			 {
				continue findUsedCarsLoop;
			 }
			 
		 }
		 if(carMake)
		 {
			 if(!listCarCount.contentEquals("(0)"))
					 {
			 System.out.println("Kia Make is present in the used car listing and the number of listing is "+listCarCount);
					 }
			 else
			 {
			 System.out.println("Kia Make is present in the used car listing but the number of listing is "+listCarCount);
			 }
			 
		 }
		 else
		 {
			 fail("Kia Make is not present in the used car listing");
			 System.out.println("Kia Make is not present in the used car listing");
		 }
	 }

	public static void verifyDetailsOnUsedCar() {
		 CommonFunctions_Selenium.click(CreateReference.refMap.get("elementUsedCar1"));
		 
		 List<WebElement> listKeyDetails = driver.findElements(By.xpath(CreateReference.refMap.get("listKeyDetails")));
		 List<WebElement> listKeyDetailsValue = driver.findElements(By.xpath(CreateReference.refMap.get("listKeyDetailsValue")));
		 
		 for(int count=0;count<listKeyDetails.size();count++)
		 {
			 String listKeyDetail=listKeyDetails.get(count).getText();
			 String listKeyDetailVal=listKeyDetailsValue.get(count).getText();
			 
			 
			 if(listKeyDetailVal.isEmpty())
			 {
				 fail("Details are not present : The value of "+listKeyDetail+" is "+listKeyDetailVal);
				 System.out.println("Details are not present : The value of "+listKeyDetail+" is "+listKeyDetailVal);
			 }
			 else
			 {
				 System.out.println("The value of "+listKeyDetail+" is "+listKeyDetailVal);
				 
			 }
			 
		 }
			
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementNumberPlateValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementKilometresValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementBodyValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementFuelTypeValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementEngineSizeValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementTransmissionValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementHistoryValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementRegExpiresValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementWoFExpiresValue")));
			  System.out.println(CommonFunctions_Selenium.getText(CreateReference.refMap.
			  get("elementSterioDescriptionValue")));
			 
		 }
		 
		
	 


}
