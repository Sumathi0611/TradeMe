package StepDefinition;		

import APILayer.Module_TradeMe_API;
import LibraryLayer.CommonFunctions_Selenium;
import LibraryLayer.Module_TradeMe_HomePage;
import LibraryLayer.Module_TradeMe_UsedCars;
import LibraryLayer.CreateReference;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class HomePage_APIStepDefinition extends CommonFunctions_Selenium{				

	
   
    @Given("^I set the used cars API endpoint$")				
    public void set_the_used_cars_api_endpoint() throws Throwable							
    {	
    	Module_TradeMe_API.setEndpoint(CreateReference.refMap.get("usedCarsEndpoint").toString());
        System.out.println("This Step is to set the endpoint for API");					
    }	
    
    @Given("^I set the used cars details API endpoint$")				
    public void set_the_used_cars_details_api_endpoint() throws Throwable							
    {	
    	Module_TradeMe_API.setEndpoint(CreateReference.refMap.get("usedCarsDetailsEndpoint").toString());
        System.out.println("This Step is to set the endpoint for API");					
    }	

    @When("^I Set request header$")
    public void set_request_header() throws Throwable
    {
    	Module_TradeMe_API.setRequestHeader();
    }
       
    @Then("^Set get request$")
    public void set_get_request() throws Throwable
    {
    	Module_TradeMe_API.sendGetRequest();
    }
    
    @When("^I Set OAuth request header$")
    public void set_oauth_request_header() throws Throwable
    {
    	Module_TradeMe_API.setOAuthRequestHeader();
    }
       
    @Then("^Set OAuth get request$")
    public void set_oauth_get_request() throws Throwable
    {
    	Module_TradeMe_API.sendOAuthGetRequest();
    }

    @Then("^Verify if appropriate details are present in used listing in TradeMe used cars$")
    public void verify_if_appropriate_details_are_present_in_used_listing_in_trademe_used_cars() throws Throwable
    {
    	Module_TradeMe_API.verifyDetailsUsedCarsListing();
    }

}