package APILayer;

/**
* JSONRead class contains operations that is performed on JSON to parse and validate
* @author  Sumathi Thirumugam
* @version 1.0
* @since   2020-08-25
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {
	/**
	 * This method is to parse the JSON
	 * 
	 * @param jsonString This is the json string to be parsed
	 * @param id         This is the tag which is to be validated in the json
	 * @return void This method does not return any value
	 */
	public static void read(String jsonString, String id) throws FileNotFoundException, ParseException {
		JSONParser parser = new JSONParser();

		{

			JSONObject jsonObject = (JSONObject) parser.parse(jsonString);
			System.out.println(jsonObject);

			String name = (String) jsonObject.get(id);
			System.out.println(name);

		}

	}

	/**
	 * This method is to parse the JSON Array
	 * 
	 * @param jsonString This is the json string to be parsed
	 * @param id         This is the tag which is to be validated in the json
	 * @return void This method does not return any value
	 */
	public static int readArray(String jsonString, String id) throws FileNotFoundException, ParseException {
		JSONParser parser = new JSONParser();

		{

			JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

			JSONArray msg = (JSONArray) jsonObject.get(id);

			return msg.size();

		}

	}

}
