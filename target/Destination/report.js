$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TradeMeTest.feature");
formatter.feature({
  "line": 2,
  "name": "TradeMe Feature",
  "description": "This Feature file consists of Scenarios on TradeMe site",
  "id": "trademe-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tests"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Verify if atleast one listing in TradeMe used cars",
  "description": "",
  "id": "trademe-feature;verify-if-atleast-one-listing-in-trademe-used-cars",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open the browser and launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select Cars Bikes and Boats in Search Items",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Verify atleast one listing is present",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 11881540100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.I_select_Cars_Bikes_and_Boats_in_search_Items()"
});
formatter.result({
  "duration": 10601317700,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsStepDefinition.validate_atleast_if_one_listing_is_present()"
});
formatter.result({
  "duration": 305316100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 232014200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify if Kia Make is present in the listing in TradeMe used cars",
  "description": "",
  "id": "trademe-feature;verify-if-kia-make-is-present-in-the-listing-in-trademe-used-cars",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open the browser and launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I select Cars Bikes and Boats in Search Items",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Verify if Kia make is present in the listing",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 10206933700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.I_select_Cars_Bikes_and_Boats_in_search_Items()"
});
formatter.result({
  "duration": 8272441900,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsStepDefinition.verify_if_kia_make_is_present()"
});
formatter.result({
  "duration": 956144700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 4328537000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify if details are present in the used cars listing",
  "description": "",
  "id": "trademe-feature;verify-if-details-are-present-in-the-used-cars-listing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Open the browser and launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I select Cars Bikes and Boats in Search Items",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Verify all the details in any one used car listing",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 8233949200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.I_select_Cars_Bikes_and_Boats_in_search_Items()"
});
formatter.result({
  "duration": 9029959400,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsStepDefinition.verify_all_the_details_in_any_one_used_car_listing()"
});
formatter.result({
  "duration": 8087489400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 226425200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify if atleast one listing in TradeMe used cars using API",
  "description": "",
  "id": "trademe-feature;verify-if-atleast-one-listing-in-trademe-used-cars-using-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@test4"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I set the used cars API endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I Set request header",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Set get request",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Verify valid response",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify if atleast one listing is present in TradeMe used cars listing",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_the_used_cars_api_endpoint()"
});
formatter.result({
  "duration": 1190107800,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_request_header()"
});
formatter.result({
  "duration": 7974000,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_get_request()"
});
formatter.result({
  "duration": 395170800,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars_APIStepDefinition.verify_valid_response()"
});
formatter.result({
  "duration": 1888700,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars_APIStepDefinition.verify_if_atleast_one_listing_is_present()"
});
formatter.result({
  "duration": 21495300,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify if Kia Make is present in listing in TradeMe used cars using API",
  "description": "",
  "id": "trademe-feature;verify-if-kia-make-is-present-in-listing-in-trademe-used-cars-using-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@test5"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "I set the used cars API endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "I Set request header",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Set get request",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Verify valid response",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Verify if Kia Make in listing is present in TradeMe used cars listing",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_the_used_cars_api_endpoint()"
});
formatter.result({
  "duration": 80800,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_request_header()"
});
formatter.result({
  "duration": 48500,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_get_request()"
});
formatter.result({
  "duration": 24839300,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars_APIStepDefinition.verify_valid_response()"
});
formatter.result({
  "duration": 61600,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars_APIStepDefinition.verify_if_kia_make_in_listing_is_present_in_trademe_used_cars_listing()"
});
formatter.result({
  "duration": 20290200,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Verify if appropriate details are present in used listing in TradeMe used cars using API",
  "description": "",
  "id": "trademe-feature;verify-if-appropriate-details-are-present-in-used-listing-in-trademe-used-cars-using-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@test6"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "I set the used cars details API endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I Set OAuth request header",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Set OAuth get request",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Verify valid response",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Verify if appropriate details are present in used listing in TradeMe used cars",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_the_used_cars_details_api_endpoint()"
});
formatter.result({
  "duration": 93300,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_oauth_request_header()"
});
formatter.result({
  "duration": 107300,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.set_oauth_get_request()"
});
formatter.result({
  "duration": 185312300,
  "status": "passed"
});
formatter.match({
  "location": "UsedCars_APIStepDefinition.verify_valid_response()"
});
formatter.result({
  "duration": 50000,
  "status": "passed"
});
formatter.match({
  "location": "HomePage_APIStepDefinition.verify_if_appropriate_details_are_present_in_used_listing_in_trademe_used_cars()"
});
formatter.result({
  "duration": 113897400,
  "status": "passed"
});
});