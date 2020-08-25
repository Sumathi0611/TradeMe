package APILayer;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Base64;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

import LibraryLayer.CreateReference;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import junit.framework.Assert;
/**
* Module_TradeMe_API class contains API operations
* @author  Sumathi Thirumugam
* @version 1.0
* @since   2020-08-25
*/
public class Module_TradeMe_API {
	static JSONRead obj=new JSONRead();
	static String getURI=null;
	static HttpHeaders headers=null;
	 static ResponseEntity<String> response;
     static RestTemplate restTemplate = new RestTemplate();
     static String responseBody;
     static HttpEntity<String> entity ;
     static ResponseEntity<Object> responseEnt;
     static String authHeader;
     
     /**
 	 * This method is to set the endpoint for the Get API call
 	 * @param endpoint This is the endpoint value
 	 * @return void This method does not return any value
 	 */
	public static void setEndpoint(String endpoint)
	{
		getURI=endpoint;
	}
	  /**
	 	 * This method is to set the request header for the Get API call
	 	 * @return void This method does not return any value
	 	 */
	public static void setRequestHeader()
	{
		headers = new HttpHeaders();
	}
	
	  /**
	 	 * This method is to set OAuth request header for the Get API calls which required authorisation
	 	 * @return void This method does not return any value
	 	 */
	public static void setOAuthRequestHeader()
	{
		String authHeader = "OAuth oauth_consumer_key=\"CA99B59396EA1536251858A561288AC4\",oauth_signature_method=\"PLAINTEXT\",oauth_nonce=\"6PBJVa\",oauth_version=\"1.0\",oauth_signature=\"7FF8A7B2C7B000B0C8D9C13A08E553F2%26\"";
		headers.add("Authorization", authHeader);
		entity = new HttpEntity<String>(headers);
	}
	  /**
	 	 * This method is to get the response for the Get API call
	 	 * @return void This method does not return any value
	 	 */
	public static void sendGetRequest()
	{
		    response = restTemplate.getForEntity(getURI,String.class);
	        // Write response to file
	        responseBody = response.getBody().toString();
	        System.out.println("The responseBody is "+responseBody);
	}
	  /**
 	 * This method is to get the response for the Get API call with authorisation
 	 * @return void This method does not return any value
 	 */
	public static void sendOAuthGetRequest()
	{
		authHeader =
				  "OAuth oauth_consumer_key=\"CA99B59396EA1536251858A561288AC4\",oauth_signature_method=\"PLAINTEXT\",oauth_nonce=\"6PBJVa\",oauth_version=\"1.0\",oauth_signature=\"7FF8A7B2C7B000B0C8D9C13A08E553F2%26\"";
		
	
	headers.add("Authorization", authHeader);
	entity = new HttpEntity<String>(headers);
	System.out.println("The getURI is "+getURI);
	responseEnt = restTemplate.exchange(getURI, HttpMethod.GET, entity, Object.class,MediaType.APPLICATION_JSON_VALUE);
	}
	  /**
 	 * This method is to verify if the response for the Get API call is 200 OK
 	 * @return void This method does not return any value
 	 */
	public static void verifyValidResponse()
	{
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	  /**
 	 * This method is to verify if atleast one listing is present in the used cars response
 	 * @return void This method does not return any value
 	 */
	public static void verifyUsedCarsAPIListing() throws FileNotFoundException, ParseException
	{

       
        JSONRead.read(responseBody,"Name");
       int carsSubCategoriesCount= JSONRead.readArray(responseBody, "Subcategories");
       //Gets the count of subcategories and verifies if the count is more than 1 - verification for atleast one listing is present
       if(carsSubCategoriesCount>=1)
       {
    	   System.out.println("The number of cars returned from API is "+carsSubCategoriesCount);
       }
       
       else
       {
    	   System.out.println("The number of cars returned from API is "+carsSubCategoriesCount); 
       }
        
        System.out.println("GET Response Body :"+responseBody);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
        Assert.assertTrue(responseBody.contains("Cars"));
     	}
	  /**
 	 * This method is to verify the response of Get API call if Kia make is present
 	 * @return void This method does not return any value
 	 */
	public static void verifyKiaMakeUsedCarsAPIListing() throws FileNotFoundException, ParseException
	{
		
		//The content of the response is checked to verify if Kia make is present
        if(responseBody.contains("Kia"))
        {
        		System.out.println("Kia make exists");
        }
        else
        {
        	System.out.println("Kia make does not exists");
        }
        JSONRead.read(responseBody,"Name");
       int carsSubCategoriesCount= JSONRead.readArray(responseBody, "Subcategories");
       if(carsSubCategoriesCount>=1)
       {
    	   System.out.println("The number of cars returned from API is "+carsSubCategoriesCount);
       }
       
       else
       {
    	   System.out.println("The number of cars returned from API is "+carsSubCategoriesCount); 
       }
        
        System.out.println("GET Response Body :"+responseBody);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
        Assert.assertTrue(responseBody.contains("Cars"));
     	}
	
	
	  /**
 	 * This method is to verify all the listing of response for the Get API call
 	 * @return void This method does not return any value
 	 */
	public static void verifyDetailsUsedCarsListing() throws FileNotFoundException, ParseException
	{
		
		  RestTemplate restTemplate = new RestTemplate(); HttpHeaders headers = new
		  HttpHeaders();
		  getURI="https://api.tmsandbox.co.nz/v1/Search/Motors/Used.json";
		 
		
		  String authHeader =
		  "OAuth oauth_consumer_key=\"CA99B59396EA1536251858A561288AC4\",oauth_signature_method=\"PLAINTEXT\",oauth_nonce=\"6PBJVa\",oauth_version=\"1.0\",oauth_signature=\"7FF8A7B2C7B000B0C8D9C13A08E553F2%26\""
		  ; headers.add("Authorization", authHeader); 
		  HttpEntity<String> entity = new 
	      HttpEntity<String>(headers); ResponseEntity<Object> response =restTemplate.exchange("https://api.tmsandbox.co.nz/v1/Search/Motors/Used.json", HttpMethod.GET,
		  entity, Object.class,MediaType.APPLICATION_JSON_VALUE);
		 
		
		//The following code verifies if all the details are present in the json response
        String responseBody = responseEnt.getBody().toString();
        System.out.println("GET Response Body :"+responseBody);
        if(responseBody.contains("NumberPlate"))
        {
        	System.out.println("Number Plate is present");
        }
        else
        {
        	fail("Number Plate is not present in the API response");
        	System.out.println("Number Plate is not present");
        }
        
        if(responseBody.contains("Body"))
        {
        	System.out.println("Body is present");
        }
        else
        {
        	fail("Body is not present in the API response");
        	System.out.println("Body is not present");
        }
        
        if(responseBody.contains("Seat"))
        {
        	System.out.println("Seat is present");
        }
        else
        {
        	fail("Seat is not present in the API response");
        	System.out.println("Seat is not present");
        }
       
        
        
        if(responseBody.contains("Fuel"))
        {
        	System.out.println("Fuel is present");
        }
        else
        {
        	fail("Fuel is not present in the API response");
        	System.out.println("Fuel is not present");
        }
        if(responseBody.contains("Engine"))
        {
        	System.out.println("Engine is present");
        }
        else
        {
        	fail("Engine is not present in the API response");
        	System.out.println("Engine is not present");
        }
        if(responseBody.contains("Transmission"))
        {
        	System.out.println("Transmission is present");
        }
        else
        {
        	fail("Transmission is not present in the API response");
        	System.out.println("Transmission is not present");
        }
        if(responseBody.contains("History"))
        {
        	System.out.println("History is present");
        }
        else
        {
        	fail("History is not present in the API response");
        	System.out.println("History is not present");
        }
        if(responseBody.contains("RegistrationExpires"))
        {
        	System.out.println("RegistrationExpires is present");
        }
        else
        {
        	fail("RegistrationExpires is not present in the API response");
        	System.out.println("RegistrationExpires is not present");
        }
        if(responseBody.contains("WofExpires"))
        {
        	System.out.println("WofExpires is present");
        }
        else
        {
        	fail("WofExpires is not present in the API response");
        	System.out.println("WofExpires is not present");
        }
        if(responseBody.contains("Model"))
        {
        	System.out.println("Model is present");
        }
        else
        {
        	fail("Model is not present in the API response");
        	System.out.println("Model is not present");
        }
        
       
	}
	
	
	

}
