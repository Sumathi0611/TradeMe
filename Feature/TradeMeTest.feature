@tests
Feature: TradeMe Feature
  This Feature file consists of Scenarios on TradeMe site


@test1	
  Scenario: Verify if atleast one listing in TradeMe used cars
  	Given Open the browser and launch the URL
  	When I select Cars Bikes and Boats in Search Items
  	And Verify atleast one listing is present
  	Then Close the browser
  	
@test2		
   Scenario: Verify if Kia Make is present in the listing in TradeMe used cars
  	Given Open the browser and launch the URL
  	When I select Cars Bikes and Boats in Search Items
  	And Verify if Kia make is present in the listing
  	Then Close the browser	

@test3
   Scenario: Verify if details are present in the used cars listing
     Given Open the browser and launch the URL 
     When I select Cars Bikes and Boats in Search Items
     And Verify all the details in any one used car listing
     Then Close the browser
   
@test4	
   Scenario: Verify if atleast one listing in TradeMe used cars using API
    Given I set the used cars API endpoint
    When I Set request header
    And Set get request
    And Verify valid response
    Then Verify if atleast one listing is present in TradeMe used cars listing 
    
  @test5	
   Scenario: Verify if Kia Make is present in listing in TradeMe used cars using API
    Given I set the used cars API endpoint
    When I Set request header
    And Set get request
    And Verify valid response
    Then Verify if Kia Make in listing is present in TradeMe used cars listing 

  @test6	
   Scenario: Verify if appropriate details are present in used listing in TradeMe used cars using API
    Given I set the used cars details API endpoint
    When I Set OAuth request header
    And Set OAuth get request
    And Verify valid response
    Then Verify if appropriate details are present in used listing in TradeMe used cars
