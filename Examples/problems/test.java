package problems;
/**
 * Example presents usage of the successful test() API method  
 */

import com.SphereEngine.Api.ProblemsClientV3;
import com.google.gson.JsonObject;

public class test 
{

	public static void main(String[] args) 
	{
		ProblemsClientV3 client = new ProblemsClientV3(
				"<access_token>", 
				"<endpoint>");
		
		JsonObject response = client.test();
	}	
}
