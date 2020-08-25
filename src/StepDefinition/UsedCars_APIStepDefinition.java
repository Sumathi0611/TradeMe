package StepDefinition;

import APILayer.Module_TradeMe_API;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UsedCars_APIStepDefinition {
	
	@And("^Verify valid response$")
    public void verify_valid_response() throws Throwable
    {
    	Module_TradeMe_API.verifyValidResponse();
    }
	
	@And("^Verify if atleast one listing is present in TradeMe used cars listing$")
    public void verify_if_atleast_one_listing_is_present() throws Throwable
    {
    	Module_TradeMe_API.verifyUsedCarsAPIListing();
    }
	
	@And("^Verify if Kia Make in listing is present in TradeMe used cars listing$")
    public void verify_if_kia_make_in_listing_is_present_in_trademe_used_cars_listing() throws Throwable
    {
    	Module_TradeMe_API.verifyKiaMakeUsedCarsAPIListing();
    }

}
