package APILayer;

//Java program for write JSON to a file 

import java.io.FileNotFoundException; 
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException; 

public class JSONRead 
{ 
	public static void read(String jsonString,String id) throws FileNotFoundException, ParseException 
	{ 
		JSONParser parser = new JSONParser();
  		
    		 {

        JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
        System.out.println(jsonObject);

        String name = (String) jsonObject.get(id);
        System.out.println(name);

      
    		 } 

}
	
	
	public static int readArray(String jsonString,String id) throws FileNotFoundException, ParseException 
	{ 
		JSONParser parser = new JSONParser();
  		
    		 {

        JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
       
        
        
        JSONArray msg = (JSONArray) jsonObject.get(id);
      //  System.out.println("The size of the Subcategories array is "+msg.size());
        return msg.size();
      
    		 } 

}
	
	public static String readJSON(String jsonString,String id) throws FileNotFoundException, ParseException 
	{ 
		JSONParser parser = new JSONParser();
  		
    		 {

        JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
       
        
        
        JSONArray msg = (JSONArray) jsonObject.get(id);
      //  System.out.println("The size of the Subcategories array is "+msg.size());
        return (String) msg.get(0);
      
    		 } 

}


	} 
 
