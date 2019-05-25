package EQU;


import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;


public class bytetrim implements Callable {
	 
    @Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
        //String a=eventContext.getMessage().getInvocationProperty("accountExists");
        Object a = eventContext.getMessage().getPayload();

        System.out.println("in java class=" + a.toString());
        return null;
    }

}


