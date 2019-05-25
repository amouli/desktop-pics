package EQU;



import java.util.Base64;
import org.json.*;


public class MuleJavaComponent
{	
		public String WriteFile(String payload) 
        {
	        	//convert payload from json to object
        		JSONObject obj = new JSONObject(payload);      		
        		   		
        		if(obj.getString("call_note") == "" || obj.getString("call_note") == null)
        		{
        			return payload;        			
        		}
        		
        		    		
        		String encoded_note = Base64.getEncoder().encodeToString(obj.getString("call_note").getBytes());
        		 
        		obj.put("call_note", encoded_note);
	        	
        		String jsonText = obj.toString();
        		
	        	return jsonText;
    		
     	
        }
	
		
	
}
    

