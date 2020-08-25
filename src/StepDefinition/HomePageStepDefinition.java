package StepDefinition;		

import LibraryLayer.CommonFunctions_Selenium;
import LibraryLayer.Module_TradeMe_HomePage;
import LibraryLayer.Module_TradeMe_UsedCars;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class HomePageStepDefinition extends CommonFunctions_Selenium{				

   
    @Given("^Open the browser and launch the URL$")				
    public void open_the_browser_and_launch_the_application() throws Throwable							
    {	
    	start_Browser();	
        System.out.println("This Step open the Browser and launch the application.");					
    }		

    @When("^I select Cars Bikes and Boats in Search Items$")					
    public void I_select_Cars_Bikes_and_Boats_in_search_Items() throws Throwable 							
    {
    	Thread.sleep(5000);
    	Module_TradeMe_HomePage.selectCarsFromSearchItems();
       System.out.println("Cars Bikes and Boats are selected in Search Items.");					
    }		

    @Then("^Close the browser$")					
    public void close_the_browser() throws Throwable 							
    {    		
    	System.out.println("Close the browser");	
    	CommonFunctions_Selenium.closeBrowser();
        				
    }
    
    

}