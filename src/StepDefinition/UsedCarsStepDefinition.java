package StepDefinition;		

import LibraryLayer.CommonFunctions_Selenium;
import LibraryLayer.Module_TradeMe_HomePage;
import LibraryLayer.Module_TradeMe_UsedCars;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class UsedCarsStepDefinition extends CommonFunctions_Selenium{				

   
   
    @Then("^Verify atleast one listing is present$")					
    public void validate_atleast_if_one_listing_is_present() throws Throwable 							
    {    		
    	System.out.println("Validate atleast if one listing is present");	
    	Module_TradeMe_UsedCars.verifyUsedCarListing();
        				
    }	
    @Then("^Verify if Kia make is present in the listing$")					
    public void verify_if_kia_make_is_present() throws Throwable 							
    {    		
    	System.out.println("Verify if Kia Make is present in the listing");	
    	Module_TradeMe_UsedCars.verifyKiaMake();
        				
    }
    
    @Then("^Verify all the details in any one used car listing$")					
    public void verify_all_the_details_in_any_one_used_car_listing() throws Throwable 							
    {    		
    	System.out.println("Verify all the details in any one used car listing");	
    	Thread.sleep(5000);
    	Module_TradeMe_UsedCars.verifyDetailsOnUsedCar();
        				
    }
    
   
    

}