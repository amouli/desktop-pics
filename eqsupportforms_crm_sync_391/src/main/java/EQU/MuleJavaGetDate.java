package EQU;


import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MuleJavaGetDate
{		
		public String getNewStartEndDate(String payload)
		{
			String new_end_date = "";
			String sourceDate = payload;  //"2012-01-01";

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			try
			{
				cal.setTime(dateFormat.parse(sourceDate));
							
				cal.add(Calendar.DATE, 1);
				new_end_date = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
									
				return new_end_date;
			}
			catch(Exception ex)
			{
				return null;
			}
		}
		
	
}
    

