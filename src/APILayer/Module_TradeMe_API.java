package APILayer;

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
	public static void setEndpoint(String endpoint)
	{
		getURI=endpoint;
	}
	
	public static void setRequestHeader()
	{
		headers = new HttpHeaders();
	}
	
	
	public static void setOAuthRequestHeader()
	{
		String authHeader = "OAuth oauth_consumer_key=\"CA99B59396EA1536251858A561288AC4\",oauth_signature_method=\"PLAINTEXT\",oauth_nonce=\"6PBJVa\",oauth_version=\"1.0\",oauth_signature=\"7FF8A7B2C7B000B0C8D9C13A08E553F2%26\"";
		headers.add("Authorization", authHeader);
		entity = new HttpEntity<String>(headers);
	}
	
	public static void sendGetRequest()
	{
		    response = restTemplate.getForEntity(getURI,String.class);
	        // Write response to file
	        responseBody = response.getBody().toString();
	        System.out.println("The responseBody is "+responseBody);
	}
	
	public static void sendOAuthGetRequest()
	{
		authHeader =
				  "OAuth oauth_consumer_key=\"CA99B59396EA1536251858A561288AC4\",oauth_signature_method=\"PLAINTEXT\",oauth_nonce=\"6PBJVa\",oauth_version=\"1.0\",oauth_signature=\"7FF8A7B2C7B000B0C8D9C13A08E553F2%26\"";
		
	//authHeader = createReference.refMap.get("OAuthToken").toString();
	headers.add("Authorization", authHeader);
	entity = new HttpEntity<String>(headers);
	System.out.println("The getURI is "+getURI);
	responseEnt = restTemplate.exchange(getURI, HttpMethod.GET, entity, Object.class,MediaType.APPLICATION_JSON_VALUE);
	}
	public static void verifyValidResponse()
	{
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
		
	}
	public static void verifyUsedCarsAPIListing() throws FileNotFoundException, ParseException
	{
		/*
		 * String getURI="https://api.tmsandbox.co.nz/v1/Categories/UsedCars.json";
		 * HttpHeaders headers = new HttpHeaders();
		 * 
		 * ResponseEntity<String> response; RestTemplate restTemplate = new
		 * RestTemplate(); response = restTemplate.getForEntity(getURI,String.class);
		 * 
		 * String responseBody = response.getBody().toString();
		 */
		
       
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
	
	public static void verifyKiaMakeUsedCarsAPIListing() throws FileNotFoundException, ParseException
	{
		/*
		 * String getURI="https://api.tmsandbox.co.nz/v1/Categories/UsedCars.json";
		 * HttpHeaders headers = new HttpHeaders();
		 * 
		 * ResponseEntity<String> response; RestTemplate restTemplate = new
		 * RestTemplate(); response = restTemplate.getForEntity(getURI,String.class);
		 * 
		 * String responseBody = response.getBody().toString();
		 */
		
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
		 
		
		
        String responseBody = responseEnt.getBody().toString();
        System.out.println("GET Response Body :"+responseBody);
        if(responseBody.contains("NumberPlate"))
        {
        	System.out.println("Number Plate is present");
        }
        else
        {
        	System.out.println("Number Plate is not present");
        }
        
		/*
		 * int listingCount= JSONRead.readArray(responseBody, "List");
		 * System.out.println("The listing count is "+listingCount);
		 */
       // JSONRead.read(responseBody,"Title");

	}
	
	
	

}
